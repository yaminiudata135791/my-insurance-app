package com.example.insurance.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("banks/{bankName}")
    public String banking(@PathVariable String bankName) {
        switch (bankName) {
            case "ICICI":
                return bankNameOne();
            case "Canara":
                return bankNameTwo();
            case "Union":
                return bankNameThree();
            default:
                return "Bank Name not Found";
        }
    }
        public String bankNameOne(){
            return "ICICI Bank Limited is an Indian multinational bank and financial services company headquartered in Vadodara.";
        }
        public String bankNameTwo(){
            return "Canara Bank is the third largest nationalised bank in India.";
        }
        public String bankNameThree(){
            return "State Bank of India is an Indian multinational public sector bank and financial services statutory body headquartered in Mumbai";
        }


    }




