package com.oracle.practicecrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oracle.practicecrud.entity.Person;

public interface Repositories extends JpaRepository<Person, Integer> {

	List<Person> findByName(String name);

	List<Person> findByNumber(long number);

}
