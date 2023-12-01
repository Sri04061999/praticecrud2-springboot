package com.oracle.practicecrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oracle.practicecrud.entity.Person;
import com.oracle.practicecrud.exception.DataNotFound;
import com.oracle.practicecrud.repository.Repositories;

@Repository
public class PersonDao {

	@Autowired
	Repositories repositories;

	public Person savePerson(Person person) {

		return repositories.save(person);
	}

	public List<Person> fetchPerson() {
		return repositories.findAll();
	}

	public Person fetchById(int id) {
		if (repositories.findById(id) == null) {
			throw new DataNotFound();
		} else {
			return repositories.findById(id).orElse(null);
		}
	}

	public List<Person> fetchByName(String name) {
		return repositories.findByName(name);
	}

	public List<Person> fetchByNumber(long number) {
		return repositories.findByNumber(number);
	}

	public Person updatePerson(Person person) {
		return repositories.save(person);
	}

	public void deletePerson(int id) {
		repositories.deleteById(id);
	}
}
