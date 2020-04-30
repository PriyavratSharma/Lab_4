package com.capg.gla.fs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.gla.fs.dao.ProductDao;
import com.capg.gla.fs.model.Product;



@Service
public class ProductService implements ProductServiceImpl {
	@Autowired
	ProductDao productDao;

	@Override
	public Product save(Product product) {
		boolean result = productDao.create(product);

		if (result) {
			return product;
		} else
			return null;
	}

	@Override
	public List<Product> reterive() {
		// TODO Auto-generated method stub
		return productDao.reterive();
	}
}

