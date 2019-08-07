package com.aldocs.controller;

import com.aldocs.model.AIMJob;
import com.aldocs.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class ProductRestController {
	
  @Autowired
  ProductService productService;  //Service which will do all data retrieval/manipulation work

  
  
  @RequestMapping(value = "/getAllAIMJob/", method = RequestMethod.GET)
  public ResponseEntity<List<AIMJob>> listAllJob() {
    List<AIMJob> aimJobList = productService.findAllJob();
    if (aimJobList.isEmpty()) {
      return new ResponseEntity<List<AIMJob>>(HttpStatus.NO_CONTENT);
    }
    return new ResponseEntity<List<AIMJob>>(aimJobList, HttpStatus.OK);
  }

  
  
  @RequestMapping(value = "/CheckSourceDB/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<AIMJob> CheckSourceDB(@PathVariable("id") int id) {
    AIMJob product = productService.findById(id);
    if (product == null) {
      return new ResponseEntity<AIMJob>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<AIMJob>(product, HttpStatus.OK);
  }

  
  
  @RequestMapping(value = "/CheckTargetDB/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<AIMJob> CheckTargetDB(@PathVariable("id") int id) {
    AIMJob product = productService.findById(id);
    if (product == null) {
      return new ResponseEntity<AIMJob>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<AIMJob>(product, HttpStatus.OK);
  }

  
  
  @RequestMapping(value = "/validateContextKey/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<AIMJob> validateContextKey(@PathVariable("id") int id) {
    AIMJob product = productService.findById(id);
    if (product == null) {
      return new ResponseEntity<AIMJob>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<AIMJob>(product, HttpStatus.OK);
  }

  
  
  @RequestMapping(value = "/createNewJob/", method = RequestMethod.POST)
  public ResponseEntity<Void> createNewJob(@RequestBody AIMJob product, UriComponentsBuilder ucBuilder) {
    productService.saveJob(product);
    HttpHeaders headers = new HttpHeaders();
    headers.setLocation(ucBuilder.path("/product/{id}").buildAndExpand(product.getId()).toUri());
    return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
  }
  
  

  @RequestMapping(value = "/getAIMJobByID/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<AIMJob> getAIMJobByID(@PathVariable("id") int id) {
    AIMJob product = productService.findById(id);
    if (product == null) {
      return new ResponseEntity<AIMJob>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<AIMJob>(product, HttpStatus.OK);
  }

  
}
