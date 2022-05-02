package com.example.insurance.service;

import com.example.insurance.dto.BaseResponse;
import com.example.insurance.dto.PatientDetailsRequest;
import com.example.insurance.dto.ProductDetailsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

    @Component
    public interface ProductService {

//        ProductDetailsResponse getProductDetails(int productId);

        ProductDetailsResponse fetchProductDetailsBasedOnName(String productName,int productId);

        ResponseEntity<BaseResponse> findProductDetails(int productId);
}
