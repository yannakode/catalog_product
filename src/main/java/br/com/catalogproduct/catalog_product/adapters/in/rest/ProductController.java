package br.com.catalogproduct.catalog_product.adapters.in.rest;

import br.com.catalogproduct.catalog_product.adapters.out.ProductServicePortOutImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    @Autowired
    private ProductServicePortOutImpl service;
}
