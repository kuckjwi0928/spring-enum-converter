package io.kuckjwi.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringEnumConverterApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringEnumConverterApplication.class, args);
  }
}
