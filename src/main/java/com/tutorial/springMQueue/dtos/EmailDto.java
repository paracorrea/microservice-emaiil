package com.tutorial.springMQueue.dtos;



import javax.validation.constraints.Email;

import lombok.Data;

@Data
public class EmailDto {
	
	
	
	private String ownerRef;
	
	@Email
	private String emailFrom;
	
	@Email
	private String emailTo;
	
	private String subject;
	
	private String text;
	
}
