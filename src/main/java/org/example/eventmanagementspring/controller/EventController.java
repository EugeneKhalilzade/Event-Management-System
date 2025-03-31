package org.example.eventmanagementspring.controller;

import org.example.eventmanagementspring.entity.Event;
import org.example.eventmanagementspring.entity.Participant;
import org.example.eventmanagementspring.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable Long id) {
        Optional<Event> event = eventService.getEventById(id);
        return event.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{eventId}/participants")
    public ResponseEntity<Participant> registerParticipant(@PathVariable Long eventId, @RequestBody Participant participant) {
        Participant savedParticipant = eventService.registerParticipant(eventId, participant);
        return ResponseEntity.ok(savedParticipant);
    }
}
