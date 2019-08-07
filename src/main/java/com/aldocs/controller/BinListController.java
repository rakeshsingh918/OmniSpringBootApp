package com.aldocs.controller;

import com.aldocs.dto.CardDetailsDto;
import com.aldocs.service.BinListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
public class BinListController {

  private static final String APPLICATION_JSON_VALUE_WITH_UTF8 = MediaType.APPLICATION_JSON_VALUE + "; charset=utf-8";
  private final BinListService service;

  @Autowired
  public BinListController(BinListService service) {
    this.service = service;
  }

  @RequestMapping(value = "/binlist/{cardNumber}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE_WITH_UTF8)
  @ResponseBody
  public ResponseEntity<CardDetailsDto> getCardDetailsByLastDigits(@PathVariable String cardNumber ) {
    ResponseEntity<CardDetailsDto> binResult = null;
    try {
      binResult = service.findDetailsOfCard(cardNumber);
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    return binResult;

  }
}
