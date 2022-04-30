package com.example.insurance.serviceimpl;

import com.example.insurance.dto.PatientDetailsRequest;
import com.example.insurance.dto.ProductDetailsResponse;
import com.example.insurance.dto.ProductFeedbackResponse;
import com.example.insurance.entity.Patient;
import com.example.insurance.entity.Product;
import com.example.insurance.repository.ProductDAO;
import com.example.insurance.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

//    @Override
//    public ProductDetailsResponse getProductDetails(String productName,int productId) {
//
//            ProductDetailsResponse productDetails=new ProductDetailsResponse();
//
//
//            List<ProductFeedbackResponse> productFeedbackResponseList = new ArrayList<>();
//
//            //DB Call
//            Optional<Product> product = productDAO.findByNameAndId(productId);
//            Product Product1=product.get();
//
//            productDetails.setName(Product1.getName());
//            productDetails.setPrice(Product1.getPrice());
//
//            ProductFeedbackResponse feedbackResponse=new ProductFeedbackResponse();
//
//
//            feedbackResponse.setName("Yamini");
//            feedbackResponse.setRating(5);
//            productFeedbackResponseList.add(feedbackResponse);
//
//            ProductFeedbackResponse feedbackResponse1=new ProductFeedbackResponse();
//            feedbackResponse1.setName("Sandhya");
//            feedbackResponse1.setRating(2);
//            productFeedbackResponseList.add(feedbackResponse1);
//
//
//            productDetails.setProductFeedbackResponse(productFeedbackResponseList);
//            return productDetails;
//
//        }


    @Override
    public ProductDetailsResponse fetchProductDetailsBasedOnName(String productName,int productId) {


        ProductDetailsResponse productDetailsResponse=new ProductDetailsResponse();

        Product product=productDAO.findByNameAndId(productName,productId);

        productDetailsResponse.setPrice(product.getPrice());
        productDetailsResponse.setId(product.getId());
        productDetailsResponse.setName(product.getName());



        return productDetailsResponse;
    }


}




