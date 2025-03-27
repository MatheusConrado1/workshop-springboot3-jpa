package com.matheusconrado.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusconrado.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
