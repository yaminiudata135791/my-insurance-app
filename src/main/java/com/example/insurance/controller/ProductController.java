package com.example.insurance.controller;

import com.example.insurance.dto.BaseResponse;
import com.example.insurance.dto.PatientDetailsRequest;
import com.example.insurance.dto.ProductDetailsResponse;
import com.example.insurance.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("fetch-product-details/{productId}")
    public ResponseEntity<BaseResponse> getProductDetails(@PathVariable int productId) {

        if(productId==0||(String.valueOf(productId)==null)){
            BaseResponse baseResponse=new BaseResponse();
            baseResponse.setMessage("Product ID cannot be 0 or null");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode((HttpStatus.BAD_REQUEST.value()));

            return new ResponseEntity<BaseResponse>(baseResponse,HttpStatus.BAD_REQUEST);
        }
        return productService.findProductDetails(productId);

    }

}

