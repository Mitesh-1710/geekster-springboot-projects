package com.geekster.mapping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",nullable=false)
    private Long id;
    
    @Column(name="title",nullable=false)
    private String title;
    
    @Column(name="author",nullable=false)
    private String author;
    
    @Column(name="description",nullable=false)
    private String description;
    
    @Column(name="price",nullable=false)
    private String price;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName="id")
    private Student student;


}
