package com.nagarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dao.ProductDao;
import com.nagarro.dto.Product;

/***
 * ProductSearchService class search products according to user's input
 * 
 * @author priyasharma
 *
 */

public class ProductSearchService {
	@Autowired
	private ProductDao productDao;

	public List<Product> getSearchResult(String color, String size, String gender) {
		List<Product> searchResults = productDao.getProducts(color, size, gender);
		return searchResults;
	}

}
