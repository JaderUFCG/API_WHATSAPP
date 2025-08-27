package com.digieduca.whatsapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digieduca.whatsapi.entities.Message;
import com.digieduca.whatsapi.service.MessageService;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

	@Autowired
	MessageService service;

	@PostMapping
	public ResponseEntity<Message> createMessage(@RequestBody Message message) {
		
		Message savedMessage = service.saveMessage(message);
		return new ResponseEntity<>(savedMessage, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public Optional<Message> getMessage(@PathVariable Long id) {
		return service.getMessageById(id);
	}

	@GetMapping
	public List<Message> getAllMessage() {
		return service.getAllMessages();
	}

	@DeleteMapping("/{id}")
	public void deleteMessage(@PathVariable Long id) {
		service.deleteMessage(id);
	}

}
