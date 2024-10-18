package br.com.catalogproduct.catalog_product.adapters.out;

import br.com.catalogproduct.catalog_product.adapters.out.repositories.ProductRepository;
import br.com.catalogproduct.catalog_product.application.ports.in.ProductCrudUseCase;
import br.com.catalogproduct.catalog_product.domain.dto.ProductRequest;
import br.com.catalogproduct.catalog_product.domain.dto.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicePortOutImpl implements ProductCrudUseCase {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductResponse create(ProductRequest productRequest) {
        return null;
    }

    @Override
    public ProductResponse update(ProductRequest productRequest) {
        return null;
    }

    @Override
    public ProductResponse delete(ProductRequest productRequest) {
        return null;
    }

    @Override
    public ProductResponse findById(ProductRequest productRequest) {
        return null;
    }

    @Override
    public List<ProductResponse> findAll() {
        return List.of();
    }
}
