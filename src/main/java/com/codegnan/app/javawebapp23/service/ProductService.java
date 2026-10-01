package com.codegnan.app.javawebapp23.service;

import java.util.List;

import com.codegnan.app.javawebapp23.dto.ProductRequestDto;
import com.codegnan.app.javawebapp23.dto.ProductResponseDto;

public interface ProductService {
	boolean addProduct(ProductRequestDto productRequestDto);
	
	ProductResponseDto searchProductById(int productId);
	
	List<ProductResponseDto> getAllProducts();
	
	boolean renameProduct(int productId, String updatedName);
	
	boolean removeProduct(int productId);
}