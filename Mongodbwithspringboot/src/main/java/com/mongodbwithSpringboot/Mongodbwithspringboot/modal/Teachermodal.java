package com.mongodbwithSpringboot.Mongodbwithspringboot.modal;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Teachermodal {
//	@Id
//	private int id;
	private String name;
	private Integer age;
	private List<Integer>pricelist;
	
	private List<String>recipies;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<Integer> getPricelist() {
		return pricelist;
	}
	public void setPricelist(List<Integer> pricelist) {
		this.pricelist = pricelist;
	}
	public List<String> getRecipies() {
		return recipies;
	}
	public void setRecipies(List<String> recipies) {
		this.recipies = recipies;
	}
	
	

}
