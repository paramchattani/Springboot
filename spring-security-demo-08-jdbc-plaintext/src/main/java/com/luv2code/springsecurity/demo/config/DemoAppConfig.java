package com.luv2code.springsecurity.demo.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.luv2code.springsecurity.demo")
@PropertySource("classpath:persistence-mysql.properties")
public class DemoAppConfig {
//set the variable to hold the property 
	
	@Autowired 
	private Environment env;
	
	private Logger logger=Logger.getLogger(getClass().getName());
	
	
	//define bean for view resolver  
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	public DataSource securityDataSource() {
		
		//create Connection pool 
		ComboPooledDataSource securityDataSource=new ComboPooledDataSource(); 
		//set the JDBC driver class 
		try {
			securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		logger.info(""+env.getProperty("jdbc.url"));
		
		//log connection props
		
		//set databse connection props
		securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		securityDataSource.setUser(env.getProperty("jdbc.user"));
		securityDataSource.setPassword(env.getProperty("jdbc.password"));
		//set connection pool props
		
		//need a helper method 
	securityDataSource.setInitialPoolSize(helper("connection.pool.initialPoolSize"));
	securityDataSource.setMinPoolSize(helper("connection.pool.minPoolSize"));
	securityDataSource.setMaxPoolSize(helper("connection.pool.maxPoolSize"));
	securityDataSource.setMaxIdleTime(helper("connection.pool.maxIdleTime"));
		return securityDataSource;
	}
	private int helper(String propname)
	{
		String propVal=env.getProperty(propname);
		int pv=Integer.parseInt(propVal);
		return pv;
	}
}
