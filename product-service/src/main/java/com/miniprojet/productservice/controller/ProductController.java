package com.miniprojet.productservice.controller;

import com.miniprojet.productservice.dto.ProductDto;
import com.miniprojet.productservice.dto.ProductDtoRes;
import com.miniprojet.productservice.model.Product;
import com.miniprojet.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductDto productDto){
        productService.createProduct(productDto);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDtoRes> getAllProducts(){
        return productService.getAll();
    }
}
