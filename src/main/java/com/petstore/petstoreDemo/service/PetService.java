package com.petstore.petstoreDemo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petstore.petstoreDemo.entity.PetEntity;
import com.petstore.petstoreDemo.modal.Pet;
import com.petstore.petstoreDemo.repository.PetRepository;


@Service
@Transactional
public class PetService {

	@Autowired
	private PetRepository petRepo;
	
	
	public Pet postPet(Pet pet) {
		
		ModelMapper modelMapper= new ModelMapper();
		PetEntity petEntity=modelMapper.map(pet, PetEntity.class);
		petRepo.save(petEntity);
		return pet;
	}


	public Pet getPetById(int id) {
		
		PetEntity entity=petRepo.findById(id).get();
		System.out.println(entity);
		ModelMapper modelMapper= new ModelMapper();
		Pet pet=modelMapper.map(entity, Pet.class);
		System.out.println(pet);
		return pet;
	}


	public void deletePetById(int id) {
		petRepo.deleteById(id);
	}

}
