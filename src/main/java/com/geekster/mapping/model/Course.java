package com.geekster.mapping.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",nullable=false)
    private Long id;
    
    @Column(name="title",nullable=false)
    private String title;
    
    @Column(name="description",nullable=false)
    private String description;
    
    @Column(name="duration",nullable=false)
    private String duration;

    @ManyToMany
    @JoinTable(name = "course_student",
            joinColumns = @JoinColumn(name = "course_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName="id"))
    private List<Student> studentList = new ArrayList<>();


}

