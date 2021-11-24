package com.nagarro.service;

import java.util.Comparator;

import com.nagarro.dto.Product;

/***
 * ProductComparatorService class generates comparator according to user's
 * output preference
 * 
 * @author priyasharma
 *
 */

public class ProductComparatorService {

	public Comparator<Product> getProductComparatorByPrice() {
		return (product1, product2) -> {
			return Double.compare(product1.getPrice(), product2.getPrice());
		};
	}

	public Comparator<Product> getProductComparatorByRating() {
		return (product1, product2) -> {
			return Double.compare(product1.getRating(), product2.getRating());
		};
	}

	public Comparator<Product> getProductComparatorByPriceRating() {
		return (product1, product2) -> {
			int sort1 = Double.compare(product1.getPrice(), product2.getPrice());
			if (sort1 == 0) {
				int sort2 = Double.compare(product1.getRating(), product2.getRating());
				return sort2;
			}
			return sort1;
		};
	}

}
