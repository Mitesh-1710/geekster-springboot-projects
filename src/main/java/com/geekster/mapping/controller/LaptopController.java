package com.geekster.mapping.controller;

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

import com.geekster.mapping.model.Laptop;
import com.geekster.mapping.service.LaptopService;

@RestController
@RequestMapping("api/v1/mapping")
public class LaptopController {

	@Autowired
	private LaptopService laptopService;

	@PostMapping("/laptop")
	public Laptop createLaptop(@RequestBody Laptop laptop) {
		return laptopService.createLaptop(laptop);
	}

	@GetMapping("/laptops")
	public List<Laptop> getAllLaptops() {
		return laptopService.getAllLaptops();
	}

	@GetMapping("/laptop/{id}")
	public Laptop getLaptopById(@PathVariable String id) {
		return laptopService.getLaptopById(id);
	}

	@PutMapping("/laptop/{id}")
	public void updateLaptop(@PathVariable String id, @RequestBody Laptop laptop) {
		laptopService.updateLaptop(id, laptop);
	}

	@DeleteMapping("/laptop/{id}")
	public void deleteLaptop(@PathVariable String id) {
		laptopService.deleteLaptop(id);
	}
}
