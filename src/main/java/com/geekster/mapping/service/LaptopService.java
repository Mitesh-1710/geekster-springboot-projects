package com.geekster.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.mapping.model.Laptop;
import com.geekster.mapping.model.Student;
import com.geekster.mapping.repository.LaptopRepository;

@Service
public class LaptopService {

	@Autowired
	private LaptopRepository laptopRepository;
	
	@Autowired
	private StudentService studentService;

	public Laptop createLaptop(Laptop laptop) {
		Student student = studentService.getStudentById(laptop.getStudent().getId().toString());
		laptop.setStudent(student);
		return laptopRepository.save(laptop);
	}

	public List<Laptop> getAllLaptops() {
		return laptopRepository.findAll();
	}

	public Laptop getLaptopById(String id) {
		Optional<Laptop> optionalLaptop = laptopRepository.findById(id);
		Laptop laptop = null;
		if (optionalLaptop.isPresent()) {
			laptop = optionalLaptop.get();
		}
		return laptop;
	}

	public Laptop updateLaptop(String id, Laptop newLaptop) {
		Optional<Laptop> optionalLaptop = laptopRepository.findById(id);
		Laptop laptop = null;
		if (optionalLaptop.isPresent()) {
			laptop = optionalLaptop.get();
			laptop.setName(newLaptop.getName());
			laptop.setBrand(newLaptop.getBrand());
			laptop.setPrice(newLaptop.getPrice());
			laptop.setStudent(newLaptop.getStudent());
			laptopRepository.save(laptop);
		}
		return laptop;
	}

	public void deleteLaptop(String id) {
		laptopRepository.deleteById(id);
	}
}
