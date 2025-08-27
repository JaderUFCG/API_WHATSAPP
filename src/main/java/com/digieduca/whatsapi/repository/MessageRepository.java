package com.digieduca.whatsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digieduca.whatsapi.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{

}
