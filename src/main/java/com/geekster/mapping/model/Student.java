package com.geekster.mapping.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "age", nullable = false)
	private String age;

	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

	@Column(name = "branch", nullable = false)
	private String branch;

	@Column(name = "department", nullable = false)
	private String department;

	@Embedded
	private Address address;

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Book> books = new ArrayList<>();

	@ManyToMany(mappedBy = "studentList")
	private List<Course> courses = new ArrayList<>();

	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	private Laptop laptop;

}