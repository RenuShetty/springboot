package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.Product;

@Repository
public class ProductDao {
	
	
	public List<Product> get_all_products(){
		
		Product p1=new Product();
		p1.setPid(11);
		p1.setName("table");
		Product p2=new Product();
		p1.setPid(102);
		p1.setName("table-chair");
		Product p3=new Product();
		p1.setPid(103);
		p1.setName("table-chair");
		//Product plist=new Product();
		List<Product> al=new ArrayList<Product>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		List<Product> plist=new ArrayList<>();
		plist.addAll(al);
		System.out.println(al.size());
		return plist;
		
	}

}
