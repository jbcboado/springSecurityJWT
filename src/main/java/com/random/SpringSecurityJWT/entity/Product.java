package com.random.SpringSecurityJWT.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "products ")
@RequiredArgsConstructor
public class Product {
    private String name;
    private int price;
}
