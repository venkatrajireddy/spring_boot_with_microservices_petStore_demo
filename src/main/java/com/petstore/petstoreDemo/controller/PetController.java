package com.petstore.petstoreDemo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.petstore.petstoreDemo.exception.BadRequest;
import com.petstore.petstoreDemo.exception.PetNotFound;
import com.petstore.petstoreDemo.modal.Pet;
import com.petstore.petstoreDemo.service.PetService;

//import com.pet.petstore.modal.PetModel;
//import com.pet.petstore.service.PetService;

@RestController
@RequestMapping("/pet")
public class PetController {

	@Autowired
	PetService petService;

	@GetMapping(path="/{id}", produces = "application/json")
	public ResponseEntity<Pet> getPetById(@PathVariable("id") int id) throws BadRequest {

		System.out.println("This is one example");
		try {
			Pet p= petService.getPetById(id);
			if(p==null) {
				throw new PetNotFound("Not found");
			}
		}catch(Exception e) {
			throw new BadRequest("Bad Request");
		}
		return new ResponseEntity<Pet>(petService.getPetById(id), HttpStatus.OK);

	}

	@PostMapping(path="/create" , consumes = "application/json", produces = "application/json")
	public ResponseEntity<Pet> postPet(@RequestBody Pet pet) {

		return new ResponseEntity<Pet>(petService.postPet(pet), HttpStatus.OK);
	}

	@DeleteMapping(path="/{id}")
	public void deletePetById(@PathVariable("id") int id) {
		petService.deletePetById(id);
	}


}
