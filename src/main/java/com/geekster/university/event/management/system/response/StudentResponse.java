package com.geekster.university.event.management.system.response;

import com.geekster.university.event.management.system.model.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {

	private String response;
	private Student student;
	
}
