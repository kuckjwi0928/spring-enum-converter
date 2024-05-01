package io.kuckjwi.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Product {
  @Id
  private long id;

  private String name;

  private ProductType type;

  public Product(String name, ProductType type) {
    this.name = name;
    this.type = type;
  }

  protected Product() {
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public ProductType getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return id == product.id && Objects.equals(name, product.name) && type == product.type;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type);
  }

  @Override
  public String toString() {
    return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", type=" + type +
            '}';
  }
}
