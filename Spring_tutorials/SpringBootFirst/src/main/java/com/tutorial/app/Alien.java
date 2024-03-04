package com.tutorial.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	@Autowired  // we are building wiring or connection b/w these alien and laptop using 
	// this annotation (important concept)
	Laptop laptop;
    public void coding() {
    	laptop.compile();
    	//System.out.println("Coding");
    }
}
