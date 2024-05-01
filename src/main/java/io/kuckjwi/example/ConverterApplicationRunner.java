package io.kuckjwi.example;

import io.kuckjwi.example.entities.Product;
import io.kuckjwi.example.entities.ProductType;
import io.kuckjwi.example.repository.ProductRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ConverterApplicationRunner implements ApplicationRunner {
  private final ProductRepository productRepository;

  public ConverterApplicationRunner(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public void run(ApplicationArguments args) {
    final var product = new Product("apple", ProductType.FOOD);
    productRepository.save(new Product("apple", ProductType.FOOD));
    System.out.println(productRepository.findById(product.getId()).orElseThrow());
  }
}
