package com.petstore.petstoreDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Category {
	
	@Id
	private int id;
	private String name;
	@OneToOne
    private PetEntity pet;

}
