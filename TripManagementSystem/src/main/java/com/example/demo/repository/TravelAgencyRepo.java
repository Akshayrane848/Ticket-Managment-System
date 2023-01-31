package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TravelAgency;

@Repository
public interface TravelAgencyRepo extends JpaRepository<TravelAgency, Integer>{

	public TravelAgency findByTravelMobile(String travelMobile);
}
