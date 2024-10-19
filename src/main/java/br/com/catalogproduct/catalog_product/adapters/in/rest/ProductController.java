package br.com.catalogproduct.catalog_product.adapters.in.rest;

import br.com.catalogproduct.catalog_product.adapters.out.ProductServicepPortOutImpl;
import br.com.catalogproduct.catalog_product.domain.dto.ProductRequest;
import br.com.catalogproduct.catalog_product.domain.dto.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServicepPortOutImpl service;

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(ProductRequest productRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(productRequest));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<ProductResponse>> updateProduct(@RequestBody ProductRequest productRequest, @PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(productRequest, id));
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<ProductResponse>> getProductById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.delete(id);
    }
}
