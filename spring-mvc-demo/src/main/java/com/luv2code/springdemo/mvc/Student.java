package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
private String firstName;
private String lastName;
private String country;
private String favouriteLanguage;
private String[] operatingSystem;
//we can select multiple os 
private LinkedHashMap<String,String> countryOptions;

public Student()
{
countryOptions=new LinkedHashMap<>();
countryOptions.put("BR","BRAZIL");
countryOptions.put("IN","INDIA");
countryOptions.put("DE","PAKISTAN");
countryOptions.put("FR","KUZBEKISTAN");

}
public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}
public String getFirstName() {
	return firstName;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFavouriteLanguage() {
	return favouriteLanguage;
}
public void setFavouriteLanguage(String favouriteLanguage) {
	this.favouriteLanguage = favouriteLanguage;
}
public String[] getOperatingSystem() {
	return operatingSystem;
}
public void setOperatingSystem(String[] operatingSystem) {
	this.operatingSystem = operatingSystem;
}


}
