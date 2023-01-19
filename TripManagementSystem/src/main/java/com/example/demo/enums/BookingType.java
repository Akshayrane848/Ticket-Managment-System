package com.example.demo.enums;

public enum BookingType {

	DIRECT("Direct"),
	INDIRECT("Indirect");
	
	private String type;
	 
    private BookingType(String type) {
		this.type = type;
	}
 
    public String getBookingType() {
        return type;
    }
}
