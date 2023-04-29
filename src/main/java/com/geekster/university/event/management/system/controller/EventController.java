package com.geekster.university.event.management.system.controller;

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

import com.geekster.university.event.management.system.constants.ApiPath;
import com.geekster.university.event.management.system.model.Event;
import com.geekster.university.event.management.system.service.EventService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ApiPath.BASE_API)
public class EventController {

	@Autowired
	private EventService eventService;

	@PostMapping(ApiPath.EVENT_API)
	public String addEvent(@Valid @RequestBody Event event) {
		return eventService.addEvent(event);
	}

	@PutMapping(ApiPath.EVENT_API_EVENT_ID_PATH_VARIABLE)
	public String updateEventById(@PathVariable Integer eventId, @Valid @RequestBody Event event) {
		return eventService.updateEventById(eventId, event);
	}

	@DeleteMapping(ApiPath.EVENT_API_EVENT_ID_PATH_VARIABLE)
	public String deleteEventById(@PathVariable Integer eventId) {
		return eventService.deleteEventById(eventId);
	}

	@GetMapping(ApiPath.EVENT_API_DATE_PATH_VARIABLE)
	public List<Event> getAllEventsByDate(@PathVariable String date) {
		return eventService.getAllEventsByDate(date);
	}

}
