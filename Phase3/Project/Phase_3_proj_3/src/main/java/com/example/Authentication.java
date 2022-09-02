package com.example;
public class Authentication {
	
	String username="Riyana";
	String password="6095";
	public boolean Validate(String username, String Password)
	{
		if(username.equals("Riyana") && Password.equals("6095")) {
			System.out.println("Validated successfully");
			return true;
		}
		
		else {
			System.out.println("Username and password doesn't match");
		    return false;
		}
	}

}
