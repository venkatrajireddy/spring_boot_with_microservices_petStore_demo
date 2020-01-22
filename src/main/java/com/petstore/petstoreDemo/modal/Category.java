package com.petstore.petstoreDemo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Category {
	
	private int id;
	private String name;
    private Pet pet;

}
