package com.app.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.app.axis.AxisAcc;

@Configuration
public class SpringConfig {

	//@Autowired
	//private Environment env;
	
	@Bean
	public HibernateTemplate ht(){
		HibernateTemplate bean=new HibernateTemplate();
		bean.setSessionFactory(sessionFactory().getObject());
		return bean;
	}
	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setAnnotatedClasses(AxisAcc.class);
		bean.setDataSource(dataSource());
		
		Properties hibernateProperties=new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		
		bean.setHibernateProperties(hibernateProperties);
		return bean;
	}
	
	@Bean
	public DataSource dataSource(){
		
		DriverManagerDataSource bean=new DriverManagerDataSource();
		bean.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bean.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		bean.setUsername("system");
		bean.setPassword("tiger");
		
		return bean;
	}
}
