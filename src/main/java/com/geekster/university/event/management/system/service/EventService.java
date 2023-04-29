package com.geekster.university.event.management.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.geekster.university.event.management.system.model.Event;

@Service
public interface EventService {

	public String addEvent(Event event);

	public String updateEventById(Integer eventId, Event event);

	public String deleteEventById(Integer eventId);

	public List<Event> getAllEventsByDate(String date);

}
