package com.example.insurance.repository;

import com.example.insurance.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface ProductDAO extends JpaRepository<Product,Integer> {


}
