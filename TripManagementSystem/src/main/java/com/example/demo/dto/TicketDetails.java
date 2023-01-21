package com.example.demo.dto;

import java.time.LocalDateTime;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.example.demo.enums.BookingType;
import com.example.demo.enums.PackageType;
import com.example.demo.enums.TicketStatus;
import com.example.demo.model.PaymentDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDetails {

    private Integer ticketId;
	
	private String packageName;
	
	private PackageType pacakageType;
	
    @Enumerated(EnumType.STRING)
	private TicketStatus status;
    
    private BookingType bookingType;
    
    private Integer noOfPerson;
    
    private String customerName;
    
    private LocalDateTime bookingDateTime;
    
    private String customerEmail;
    
    private String customerMobile;
    
    private PaymentDetails payment;
}
