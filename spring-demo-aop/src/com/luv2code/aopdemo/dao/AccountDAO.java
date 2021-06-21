package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
public void addAccount() {
	System.out.println(getClass()+"DOing db work");
	
}
public List<Account> findAccounts(){
	List<Account> myAccounts=new ArrayList<>();
	
	//create accounts sample
	Account temp=new Account("Praama","Silver");
	Account temp1=new Account("Kaajal","Platinum");
	myAccounts.add(temp);
	myAccounts.add(temp1);
	//add them to the list 
	return myAccounts;
}
}
