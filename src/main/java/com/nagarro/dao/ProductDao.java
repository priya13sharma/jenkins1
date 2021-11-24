package com.nagarro.dao;

import java.util.List;

import com.nagarro.dto.Product;

public interface ProductDao {

	public void addProduct(Product product);

	public List<Product> getProducts(String color, String size, String gender);

}

