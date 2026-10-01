package com.codegnan.app.javawebapp23.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegnan.app.javawebapp23.dao.ProductDao;
import com.codegnan.app.javawebapp23.dto.ProductRequestDto;
import com.codegnan.app.javawebapp23.dto.ProductResponseDto;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;
	
	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	@Override
	public boolean addProduct(ProductRequestDto productRequestDto) {
		return productDao.save(productRequestDto);
	}
	
	@Override
	public ProductResponseDto searchProductById(int productId) {
		return productDao.findById(productId);
	}
	
	@Override
	public List<ProductResponseDto> getAllProducts() {
		return productDao.findAll();
	}
	
	@Override
	public boolean renameProduct(int productId, String updatedName) {
		return productDao.updateName(productId, updatedName);
	}
	
	@Override
	public boolean removeProduct(int productId) {
		return productDao.delete(productId);
	}
}