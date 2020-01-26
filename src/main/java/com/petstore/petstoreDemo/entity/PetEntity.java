package com.petstore.petstoreDemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class PetEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "category_id")
	private Category category;
	private String [] photoUrls;
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "tag_id", referencedColumnName = "id")
	private Tag tag;

}
