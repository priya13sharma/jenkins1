package com.nagarro.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dto.Product;

/***
 * OutputPreferanceService class sorts the search results according to user's
 * preference.
 * 
 * @author priyasharma
 *
 */

public class OutputPreferenceService {
	@Autowired
	private ProductComparatorService productComparator;

	public void sortProducts(List<Product> searchProduct, int preference) {
		Comparator<Product> comparator;
		if (preference == 1) {
			comparator = productComparator.getProductComparatorByPrice();
			Collections.sort(searchProduct, comparator);
		} else if (preference == 2) {
			comparator = productComparator.getProductComparatorByRating();
			Collections.sort(searchProduct, comparator);
		} else {
			comparator = productComparator.getProductComparatorByPriceRating();
			Collections.sort(searchProduct, comparator);
		}

	}

}
