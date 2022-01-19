package com.example.demonstration;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tutorial.codegen.controllers.PetApi;
import com.tutorial.codegen.model.Pet;

@Service
public class ApiImplementation implements PetApi{
	
	@Override
	public ResponseEntity<Pet> getPetByNewIds(Long petId) {
		// TODO Auto-generated method stub
		return PetApi.super.getPetByNewIds(petId);
	}
}
