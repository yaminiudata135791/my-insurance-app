package com.example.insurance.controller;

import com.example.insurance.dto.PatientDetailsRequest;
import com.example.insurance.dto.ProductDetailsResponse;
import com.example.insurance.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

//    @GetMapping("get-product-details/{productId}")
//    public ProductDetailsResponse fetchProductDetails(@PathVariable int productId){
//        return productService.getProductDetails(productId);
//
//    }
    @GetMapping("fetch-product-details/{productName}/{productId}")
    public ProductDetailsResponse fetchProductDetailsBasedOnName(@PathVariable String productName,@PathVariable int productId){
        return productService.fetchProductDetailsBasedOnName(productName,productId);
    }

}

