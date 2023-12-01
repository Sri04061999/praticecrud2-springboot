package com.oracle.practicecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.practicecrud.dao.PersonDao;
import com.oracle.practicecrud.entity.Person;
import com.oracle.practicecrud.exception.DataNotFound;

@Service
public class PersonService {

	@Autowired
	PersonDao dao;

	public Person savePerson(Person person) {
		return dao.savePerson(person);
	}

	public List<Person> fetchPerson() {
		return dao.fetchPerson();
	}

	public Person fetchById(int id) {
		if (dao.fetchById(id) == null) {
			throw new DataNotFound();
		} else {
			return dao.fetchById(id);
		}
	}

	public List<Person> fetchByName(String name) {
		return dao.fetchByName(name);
	}

	public List<Person> fetchByNumber(long number) {
		return dao.fetchByNumber(number);
	}

	public Person updatePerson(Person person) {
		return dao.updatePerson(person);
	}

	public void deletePerson(int id) {
		dao.deletePerson(id);
	}

}
