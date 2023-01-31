package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.enums.PackageType;
import com.example.demo.model.TripPackage;

@Repository
public interface PackageRepo extends JpaRepository<TripPackage, Integer>{

	
	   public List<TripPackage>  findByPackageType(PackageType packageType);
	
	   public List<TripPackage> findBypackageCostBetween(Double minPrice, Double maxPrice);
	
}
