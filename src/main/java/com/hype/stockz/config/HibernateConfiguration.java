package com.hype.stockz.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.hype.stockz")
public class HibernateConfiguration {
	
	// Create a Sessionfactory Object
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		
		//Database Config & Hibernate configuration
		
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] {"com.hype.stockz.model"});
		sessionFactory.setHibernateProperties(hibernateProperties());
		
		return sessionFactory;
		
	}

	private Properties hibernateProperties() {
		Properties properties= new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		// Optional Properties
		properties.put("hibernate.show_sql",true);
		properties.put("hibernate.format_sql",true);
		return properties;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/stockz?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("Mysql@1601");
		
		return dataSource;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory factory) {
		HibernateTransactionManager manager=new HibernateTransactionManager();
		manager.setSessionFactory(factory);
		return  manager;
	}
}