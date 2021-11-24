package com.nagarro.daoImp;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.dao.Dao;
import com.nagarro.dao.ProductDao;
import com.nagarro.dto.Product;

public class ProductDaoImp implements ProductDao {
	@Autowired
	private Dao dao;

	public void addProduct(Product product) {
		dao.begin();
		dao.getSession().save(product);
		dao.commit();
		dao.close();

	}

	public List<Product> getProducts(String color, String size, String gender) {
		dao.begin();
		CriteriaBuilder criteriaBuilder = dao.getSession().getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
		Root<Product> root = criteriaQuery.from(Product.class);
		Predicate[] predicates = new Predicate[3];
		predicates[0] = criteriaBuilder.equal(root.get("color"), color);
		predicates[1] = criteriaBuilder.equal(root.get("size"), size);
		predicates[2] = criteriaBuilder.equal(root.get("gender"), gender);

		criteriaQuery.select(root).where(predicates);
		Query<Product> query = dao.getSession().createQuery(criteriaQuery);
		List<Product> searchResult = query.getResultList();
		dao.commit();
		dao.close();
		return searchResult;
	}
}
