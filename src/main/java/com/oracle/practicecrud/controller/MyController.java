package com.oracle.practicecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.practicecrud.entity.Person;
import com.oracle.practicecrud.service.PersonService;

@RestController
@RequestMapping("/person")
public class MyController {
	@Autowired
	PersonService service;

	@PostMapping
	public Person savePerson(@RequestBody Person person) {
		return service.savePerson(person);
	}

	@GetMapping
	public List<Person> fetchPerson() {
		return service.fetchPerson();
	}

	@GetMapping("/{id}")
	public Person fetchById(@PathVariable int id) {
		return service.fetchById(id);
	}

	@GetMapping("/name/{name}")
	public List<Person> fetchByName(@PathVariable String name) {
		return service.fetchByName(name);
	}

	@GetMapping("/number/{number}")
	public List<Person> fetchByName(@PathVariable long number) {
		return service.fetchByNumber(number);
	}

	@PutMapping
	public Person updatePerson(@RequestBody Person person) {
		return service.updatePerson(person);
	}

	@DeleteMapping("/{id}")
	public void updatePerson(@PathVariable int id) {
		service.deletePerson(id);
	}
}
