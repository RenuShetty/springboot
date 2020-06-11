package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDao;
import com.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productDao;
	
	@Transactional
	
	public List<Product> getall_product_fromdao(){
		
		System.out.println("inservice");
		List<Product> product=productDao.get_all_products();
		System.out.println(product.size());
		return product;
	}

}
