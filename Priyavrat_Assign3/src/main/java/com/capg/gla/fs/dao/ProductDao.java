package com.capg.gla.fs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.gla.fs.model.Product;



@Transactional
@Repository
public class ProductDao implements ProductDaoImpl {

	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Product product) {
		em.persist(product);
		return true;
	}

	@Override
	public List<Product> reterivev1() {
		String Qstr = "SELECT product FROM Product product";
		TypedQuery<Product> query = em.createQuery(Qstr, Product.class);

		return query.getResultList();
	}
}