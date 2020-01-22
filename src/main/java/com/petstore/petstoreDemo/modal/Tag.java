package com.petstore.petstoreDemo.modal;


import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Tag {
	private int id;
	private String name;
    private Pet petTag;
}
