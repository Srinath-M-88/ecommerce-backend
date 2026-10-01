package com.codegnan.app.javawebapp23.dao;

import java.util.List;

import com.codegnan.app.javawebapp23.dto.ProductRequestDto;
import com.codegnan.app.javawebapp23.dto.ProductResponseDto;

public interface ProductDao {
	boolean save(ProductRequestDto productRequestDto);
	
	ProductResponseDto findById(int productId);
	
	List<ProductResponseDto> findAll();
	
	boolean updateName(int productId, String updatedName);
	
	boolean delete(int productId);
}