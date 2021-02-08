package com.hype.stockz.driver;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hype.stockz.dao.ProductDAO;
import com.hype.stockz.model.Product;

public class ProductDriver {
	public static void main (String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.hype.stockz");
		context.refresh();
	
		// 1. Insert data
		Product product=new Product("AirJordan Retro 11", 17000, 15, "01/02/2021", "31/03/2021", "Nike AirJordan Retro 11 25th Anniversary ");
		
		ProductDAO dao = (ProductDAO) context.getBean("productDAO");
		
//				dao.addProduct(product);
		
	//2. Update data
		//2.1 get the data by using getProductById();
		
//		Product prod=dao.getProductById(6);
//		prod.setId(4);
//		
//		prod.setPrice(55000);
//		prod.setDescription("Nike AirJordan 1 Dark Mocha High");
//		
//		dao.updateProduct(prod);
//		
//		System.out.println(prod);
	
	//3. Delete the data
		
//		Product prodDelete =dao.getProductById(5);
//		
//		dao.deleteProduct(prodDelete);
		
		
	// 4. 		
		
		List<Product> products=dao.findAll();
		
		for(Product p:products) {
		System.out.println(p);
		}
		
		
		
		
	}
	

}
