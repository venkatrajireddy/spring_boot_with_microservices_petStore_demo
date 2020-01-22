package com.petstore.petstoreDemo.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Pet {
	private int id;
	private String name;
	private Category category;
	private String [] photoUrls;
	private Tag tag;

}
