package com.example.demo.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedBackDTO {
	
	private Integer fid;
	private Integer rating;
	private String feedback;
	private LocalDate date;
	
	private Integer cid;
	private String cname;
	private String cphone;

}
