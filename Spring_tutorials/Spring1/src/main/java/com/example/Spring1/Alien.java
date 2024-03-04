package com.example.Spring1;

import org.springframework.stereotype.Component;

@Component
public class Alien{
	private int age;
	private Computer com;
	// age=21; explicitly setting this, by hardcoding, but another way is to by using property tag in xml files, while making 
	// beans, which inturn uses setter method, that's why setter injection
   public Alien() {
	   //System.out.println("object created successfully!");
   }
   
   public Alien(int age,Computer com) {
	   //System.out.println("Para const called!");
	   this.age=age;
	   this.com=com;
   }
   
   public int getAge() {
	return age;
}

   public void setAge(int age) {
	//System.out.println("Setter method called!");
	this.age = age;
}


public Computer getCom() {
	return com;
}

public void setCom(Computer com) {
	this.com = com;
}

public void coding() {
	   System.out.println("Alien is coding!");
	   com.compile();
	   
   }
}
