package com.geekster.university.event.management.system.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekster.university.event.management.system.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

	public List<Event> findAllByDate(LocalDate date);

}
