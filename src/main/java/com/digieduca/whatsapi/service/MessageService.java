package com.digieduca.whatsapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digieduca.whatsapi.entities.Message;
import com.digieduca.whatsapi.repository.MessageRepository;

@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;

	public Message saveMessage(Message message) {
		return messageRepository.save(message);
	}

	public Optional<Message> getMessageById(Long id) {
		return messageRepository.findById(id);
	}

	public List<Message> getAllMessages() {
		return messageRepository.findAll();
	}

	public void deleteMessage(Long id) {
		messageRepository.deleteById(id);
	}

}
