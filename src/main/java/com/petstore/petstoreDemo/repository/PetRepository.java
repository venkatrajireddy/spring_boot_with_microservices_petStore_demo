package com.petstore.petstoreDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.petstore.petstoreDemo.entity.PetEntity;

@Repository
public interface PetRepository extends  CrudRepository<PetEntity, String>{

}
