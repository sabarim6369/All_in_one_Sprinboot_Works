package com.mongodbwithSpringboot.Mongodbwithspringboot.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Students {
@Id
private Integer rno;

private String name;

private String address;

public Integer getRno() {
	return rno;
}

public void setRno(Integer rno) {
	this.rno = rno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

}
