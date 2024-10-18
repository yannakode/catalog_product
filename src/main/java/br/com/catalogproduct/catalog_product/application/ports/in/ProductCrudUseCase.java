package br.com.catalogproduct.catalog_product.application.ports.in;

import br.com.catalogproduct.catalog_product.domain.dto.ProductRequest;
import br.com.catalogproduct.catalog_product.domain.dto.ProductResponse;

import java.util.List;

public interface ProductCrudUseCase {

    ProductResponse create(ProductRequest productRequest);

    ProductResponse update(ProductRequest productRequest);

    ProductResponse delete(ProductRequest productRequest);

    ProductResponse findById(ProductRequest productRequest);

    List<ProductResponse> findAll();
}
