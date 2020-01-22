package com.petstore.petstoreDemo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petstore.petstoreDemo.entity.PetEntity;
import com.petstore.petstoreDemo.modal.Pet;
import com.petstore.petstoreDemo.repository.PetRepository;


@Service
public class PetService {

	@Autowired
	private PetRepository petRepo;
	
	
	public Pet postPet(Pet pet) {
		
		ModelMapper modelMapper= new ModelMapper();
		PetEntity petEntity=modelMapper.map(pet, PetEntity.class);
		petRepo.save(petEntity);
		return pet;
	}

}
