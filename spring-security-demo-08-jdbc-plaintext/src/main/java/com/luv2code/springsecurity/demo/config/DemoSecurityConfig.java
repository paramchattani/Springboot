package com.luv2code.springsecurity.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource securityDataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
	//	UserBuilder users=User.withDefaultPasswordEncoder();
		//auth.inMemoryAuthentication().withUser(users.username("Param").password("param6373").roles("EMPLOYEE"))
		//.withUser(users.username("Kaajal").password("kaajal6373").roles("MANAGER"))
		//.withUser(users.username("Heena").password("heena6373").roles("ADMIN"));
		
		
		//use jdbc authentication 
		
		auth.jdbcAuthentication().dataSource(securityDataSource);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/").hasRole("EMPLOYEE").antMatchers("/leaders/**").hasRole("MANAGERS").antMatchers("/systems/**").hasRole("ADMIN").and().formLogin().loginPage("/showMyLoginPage").loginProcessingUrl("/authenticateTheUser").permitAll().and().logout().permitAll().and().exceptionHandling().accessDeniedPage("/access-denied");
	}
//gives logout
	
}
