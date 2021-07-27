package com.natwest.demofruit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.natwest.demofruit.domain.Fruit;
import com.natwest.demofruit.repo.FruitRepo;

@Service
public class FruitService {

	public FruitRepo repo;

	public FruitService(FruitRepo repo) {
		super();
		this.repo = repo;
	}

	// READ
	public List<Fruit> readall() {
		
		return this.repo.findAll();
		
	}
	
	//FINDBYID
	public Fruit findById(Long id) {
		return this.repo.findById(id).orElseThrow();
				
	}
	
	//CREATE
	public Fruit create(Fruit fruit) {
		return this.repo.saveAndFlush(fruit);
	}
	
	//DELETE
	public Boolean delete(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
	}
	//UPDATE
	public Fruit update(Long id, Fruit fruit) {
		Fruit exists = this.repo.getById(id);
		exists.setType(fruit.getType());
		exists.setColour(fruit.getColour());
		Fruit updated = this.repo.save(exists);
		return updated;
	}

}
