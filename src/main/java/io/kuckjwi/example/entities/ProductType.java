package io.kuckjwi.example.entities;

import io.kuckjwi.example.converter.AbstractCodedEnumConverter;
import io.kuckjwi.example.converter.CodedEnum;

public enum ProductType implements CodedEnum<Integer> {
  FOOD(100),
  DRINK(200),
  CLOTHES(300),
  ELECTRONICS(400),
  OTHER(500);

  private final int code;

  ProductType(int code) {
    this.code = code;
  }

  public Integer getCode() {
    return code;
  }

  @jakarta.persistence.Converter(autoApply = true)
  static class Converter extends AbstractCodedEnumConverter<ProductType, Integer> {
    public Converter() {
      super(ProductType.class);
    }
  }
}
