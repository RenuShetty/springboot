package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Product;
import com.service.ProductService;
@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	@RequestMapping(value="/success")
	public String product_list_display(Model m)
	{
		System.out.println("success");
		
		List<Product> productlist=productService.getall_product_fromdao();
		m.addAttribute("productlist", productlist);
		System.out.println(productlist.size());
		return"product";
		
	}
	@RequestMapping(value="/abc")
	public String cart_list_display()
	{
		System.out.println("success");
		return"cart";
		
	}
}
