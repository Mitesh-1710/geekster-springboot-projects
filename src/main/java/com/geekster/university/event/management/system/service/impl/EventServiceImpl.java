package com.geekster.university.event.management.system.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.university.event.management.system.constants.UniversityEventManagementSystemConstants;
import com.geekster.university.event.management.system.model.Event;
import com.geekster.university.event.management.system.repository.EventRepository;
import com.geekster.university.event.management.system.service.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository eventRepository;

	@Override
	public String addEvent(Event event) {
		eventRepository.save(event);
		return UniversityEventManagementSystemConstants.EVENT_CREATE_RESPONSE;
	}

	@Override
	public String updateEventById(Integer eventId, Event event) {
		Optional<Event> optionalEvent = eventRepository.findById(eventId);
		String response = null;
		if (optionalEvent.isPresent()) {
			eventRepository.save(optionalEvent.get());
			response = UniversityEventManagementSystemConstants.EVENT_UPDATE_RESPONSE;
		} else {
			response = UniversityEventManagementSystemConstants.INVALID_EVENT_ID_RESPONSE;
		}
		return response;
	}

	@Override
	public String deleteEventById(Integer eventId) {
		Optional<Event> optionalEvent = eventRepository.findById(eventId);
		String response = null;
		if (optionalEvent.isPresent()) {
			eventRepository.deleteById(eventId);
			response = UniversityEventManagementSystemConstants.EVENT_DELETE_RESPONSE;
		} else {
			response = UniversityEventManagementSystemConstants.INVALID_EVENT_ID_RESPONSE;
		}
		return response;
	}

	@Override
	public List<Event> getAllEventsByDate(String date) {
		LocalDate parsedDate = LocalDate.parse(date);
		return eventRepository.findAllByDate(parsedDate);
	}

}
