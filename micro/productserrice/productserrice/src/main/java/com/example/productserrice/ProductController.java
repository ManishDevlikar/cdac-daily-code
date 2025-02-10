package com.example.productserrice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping("/{id}")
  public Product getProduct(@PathVariable(name = "id") Long id) {
    return productRepository.findById(id).orElseThrow();
  }

  @PostMapping
  public Product createProduct(@RequestBody Product product) {
    return productRepository.save(product);
  }
}