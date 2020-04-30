package com.capg.gla.fs.dao;

import java.util.List;

import com.capg.gla.fs.model.Product;




public interface ProductDaoImpl {
	
	public boolean create(Product product);
	public List<Product> reterive();
	

}
