package com.nagarro.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.dto.Product;
import com.nagarro.service.FileUploadService;
import com.nagarro.service.OutputPreferenceService;
import com.nagarro.service.ProductSearchService;

@Controller
public class SearchController {
	@Autowired
	private ProductSearchService searchService;
	@Autowired
	private OutputPreferenceService outputPreferance;
	@Autowired
	private FileUploadService fileUpload;

	@RequestMapping("/search")
	public ModelAndView searchProducts(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String color = request.getParameter("color");
		String size = request.getParameter("size");
		String gender = request.getParameter("gender");
		int preferance = Integer.parseInt(request.getParameter("preferance"));
		List<Product> list = fileUpload.saveData();
		Product product = new Product();
		List<Product> searchProduct = searchService.getSearchResult(color, size, gender);
		outputPreferance.sortProducts(searchProduct, preferance);
		HttpSession session = request.getSession();
		session.setAttribute("searchProduct", searchProduct);
		mv.addObject("searchProduct", searchProduct);
		mv.setViewName("result");
		return mv;
	}

}
