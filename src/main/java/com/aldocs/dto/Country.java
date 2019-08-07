package com.aldocs.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Country {

  private String numeric;
  private String alpha2;
  private String name;
  private String emoji;
  private String currency;
  private String latitude;
  private String longitude;

}
