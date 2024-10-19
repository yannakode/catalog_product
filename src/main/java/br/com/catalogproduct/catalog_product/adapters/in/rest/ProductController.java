package br.com.catalogproduct.catalog_product.adapters.in.rest;

import br.com.catalogproduct.catalog_product.application.service.ProductServicePortOutImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServicePortOutImpl service;
}
