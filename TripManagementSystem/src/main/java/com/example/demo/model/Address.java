package com.example.demo.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.example.demo.enums.CountryEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

	private String city;
	private String pincode;
	private String state;
	
	@Enumerated(EnumType.STRING)
	private CountryEnum country;	
}
