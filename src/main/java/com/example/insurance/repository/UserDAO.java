package com.example.insurance.repository;


import com.example.insurance.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface UserDAO extends JpaRepository<Users,Integer> {


}
