package com.capg.gla.fs.service;

import java.util.List;

import com.capg.gla.fs.model.Product;




public interface ProductServiceImpl {
	
	public Product save(Product product);

	public List<Product> reterive();

}

