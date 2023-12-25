package com.miniprojet.productservice.service;

import com.miniprojet.productservice.dto.ProductDto;
import com.miniprojet.productservice.dto.ProductDtoRes;
import com.miniprojet.productservice.model.Product;
import com.miniprojet.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private ProductRepository productRepository;
    public void createProduct(ProductDto productDto){
        Product product = Product.builder()
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice()).build();
        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }
    public List<ProductDtoRes> getAll(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductDtoRes).toList();
    }
    private ProductDtoRes mapToProductDtoRes(Product product){
        return ProductDtoRes.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice()).build();
    }
}
