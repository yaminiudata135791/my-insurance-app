package com.example.insurance.repository;

import com.example.insurance.entity.Patient;
import com.example.insurance.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductDAO extends JpaRepository<Product,Integer> {


    @Query(value="SELECT * From product WHERE name=?1 AND id=?2",nativeQuery=true)
    Product findByNameAndId(String productName,int productId);
}
