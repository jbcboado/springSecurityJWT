package com.random.SpringSecurityJWT.repository;

import com.random.SpringSecurityJWT.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
