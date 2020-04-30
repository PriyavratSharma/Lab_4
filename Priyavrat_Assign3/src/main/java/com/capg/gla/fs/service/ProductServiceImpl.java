package com.capg.gla.fs.service;

import java.util.List;

import com.capg.gla.fs.model.Product;
import com.capg.gla.fs.model.ProductOld;




public interface ProductServiceImpl {
	
	public Product save(Product product);

	public List<ProductOld> reterive();
	public List<Product> reterivev1();

}
