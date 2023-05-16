package com.geekster.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.mapping.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
