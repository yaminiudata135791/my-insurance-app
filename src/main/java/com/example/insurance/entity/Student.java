package com.example.insurance.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

    @Entity
    @Setter
    @Getter
    @ToString
    @Table(name="student")
    public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        private int id;

        @Column(name = "studentName")
        private String studentName;

        @Column(name = "branch")
        private String branch;

        @Column(name = "address")
        private String address;

}
