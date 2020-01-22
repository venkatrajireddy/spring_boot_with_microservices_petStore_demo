package com.petstore.petstoreDemo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.petstore.petstoreDemo.modal.Pet;
import com.petstore.petstoreDemo.service.PetService;

//import com.pet.petstore.modal.PetModel;
//import com.pet.petstore.service.PetService;

@RestController
@RequestMapping("/pet")
public class PetController {
	
	@Autowired
	PetService petService;
	
	@GetMapping()
	public void getPetById()
	{
		System.out.println("hiii");
	}
	
	@RequestMapping("/create")
	public Pet postPet(@RequestBody Pet pet)
	{
		System.out.println("in post method");
		petService.postPet(pet);
		return pet;
		
	}
}
