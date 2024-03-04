package com.tutorial.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	 @Autowired
	 Cpu compute;
  public void compile() {
	 compute.processing();
	  //System.out.println("Compiling....");
  }
}
