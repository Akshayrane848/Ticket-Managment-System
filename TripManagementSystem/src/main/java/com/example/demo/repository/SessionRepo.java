package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserSession;

@Repository
public interface SessionRepo extends JpaRepository<UserSession, Integer>{

	public UserSession findByUuid(String uuid);
}
