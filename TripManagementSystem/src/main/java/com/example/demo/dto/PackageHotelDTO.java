package com.example.demo.dto;

import java.util.Set;

import com.example.demo.model.TripPackage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PackageHotelDTO {

    private TripPackage tripPackage;
	
	private Set<Integer> hidSet;
	
	private Set<Integer> ridSet;
}
