package io.kuckjwi.example.repository;

import io.kuckjwi.example.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
