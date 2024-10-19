package br.com.catalogproduct.catalog_product.application.ports.out;

import br.com.catalogproduct.catalog_product.domain.dto.ProductRequest;
import br.com.catalogproduct.catalog_product.domain.dto.ProductResponse;

import java.util.List;
import java.util.Optional;

public interface ApiProductsPortOut {

    ProductResponse create(ProductRequest productRequest);

    ProductResponse update(ProductRequest productRequest);

    void delete(ProductRequest productRequest);

    Optional<ProductResponse> findById(ProductRequest productRequest);

    List<ProductResponse> findAll();
}
