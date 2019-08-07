package com.aldocs.service;

import com.aldocs.dto.CardDetailsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class BinListService {
  public ResponseEntity<CardDetailsDto> findDetailsOfCard(String cardNumber) throws URISyntaxException {

    RestTemplate restTemplate = new RestTemplate();

    final String baseUrl = "https://lookup.binlist.net/" + cardNumber;
    URI uri = new URI(baseUrl);
    ResponseEntity<CardDetailsDto> result = restTemplate.getForEntity(uri, CardDetailsDto.class);
    System.out.println(result);

    return  result;
  }
}
