package com.example.Spring1;

public class Laptop implements Computer{
  public Laptop() {
	 // System.out.println("Laptop object created successfully");
  }
  @Override
  public void compile() {
	  System.out.println("Compiling in laptop!!");
  }
}
