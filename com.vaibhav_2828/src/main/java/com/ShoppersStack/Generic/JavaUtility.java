	package com.ShoppersStack.Generic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	
	public int generateRandomNumber(){
		Random r=new Random();
		int value=r.nextInt();
		return value;
		
	}
	public String localDate() {
		return LocalDate.now().toString().replace("-","");
	}
	public String localDateTime() {
		return LocalDateTime.now().toString().replace("-","").replace(":","").replace(".","");
	}
	
}
