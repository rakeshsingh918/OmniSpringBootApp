package com.aldocs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDetailsDto {

  @JsonProperty("number")
  private CardNumber cardNumber;
  private String scheme;
  private String type;
  private String brand;
  private String prepaid;
  private Country country;
  private Bank bank;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
