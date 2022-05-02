package com.example.insurance.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProductDetailsResponse {

        private int id;
        private String name;
        private String price;

        List<ProductFeedbackResponse> productFeedbackResponse;

}
