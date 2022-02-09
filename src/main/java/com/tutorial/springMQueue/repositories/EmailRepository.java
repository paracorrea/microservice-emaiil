package com.tutorial.springMQueue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.springMQueue.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{

	
}
