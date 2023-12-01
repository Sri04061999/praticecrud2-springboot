package com.oracle.practicecrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	private long number;
}
