package com.example.insurance.service;

import com.example.insurance.dto.ProductDetailsResponse;
import org.springframework.stereotype.Component;

    @Component
    public interface ProductService {

        ProductDetailsResponse getProductDetails(int productId);


}
