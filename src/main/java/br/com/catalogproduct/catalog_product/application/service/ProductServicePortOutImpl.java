package br.com.catalogproduct.catalog_product.application.service;

import br.com.catalogproduct.catalog_product.adapters.out.repositories.ProductRepository;
import br.com.catalogproduct.catalog_product.application.ports.in.ProductCrudUseCase;
import br.com.catalogproduct.catalog_product.domain.dto.ProductRequest;
import br.com.catalogproduct.catalog_product.domain.dto.ProductResponse;
import br.com.catalogproduct.catalog_product.domain.model.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServicePortOutImpl implements ProductCrudUseCase {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductResponse create(ProductRequest productRequest) {
        Product product = modelMapper.map(productRequest, Product.class);
        Product savedProduct = productRepository.save(product);
        return modelMapper.map(savedProduct, ProductResponse.class);
    }

    @Override
    public Optional<ProductResponse> update(ProductRequest productRequest, Long productId) {
        if(!productRepository.existsById(productId)){
            return Optional.empty();
        }

        Product product = productRepository.findById(productId).get();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
        ProductResponse productResponse = modelMapper.map(product, ProductResponse.class);

        return Optional.of(productResponse);
    }

    @Override
    public void delete(Long productId) {
        if(productRepository.existsById(productId)){
            productRepository.deleteById(productId);
        }
    }

    @Override
    public Optional<ProductResponse> findById(Long productId) {
        if(!productRepository.existsById(productId)){
            return Optional.empty();
        }

        Product product = productRepository.findById(productId).get();

        return Optional.of(modelMapper.map(product, ProductResponse.class));
    }

    @Override
    public List<ProductResponse> findAll() {
        List<Product> products = productRepository.findAll();

        List<ProductResponse> productResponses = products
                .stream()
                .map(p -> modelMapper.map(p, ProductResponse.class))
                .toList();
        return productResponses;
    }
}