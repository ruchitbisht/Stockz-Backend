package com.hype.stockz.driver;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hype.stockz.dao.ProductDAO;
import com.hype.stockz.dao.UserDAO;
import com.hype.stockz.model.Product;
import com.hype.stockz.model.User;

public class UserDriver {
	public static void main (String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.hype.stockz");
		context.refresh();
	
		User user=new User("user", "user@123", "user@gmail.com", 99911100067L, "South Delhi", "28/02/2000");
		
		UserDAO userDAO =(UserDAO) context.getBean("userDAO");
		
		userDAO.saveUser(user);
	}
	

}
