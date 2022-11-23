package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Pratice {
	
	@Test
	public void lux() {
		System.out.println("Lux");
	}
	
	@Test (enabled = false)
	public void lifeboy() {
		System.out.println("Lifeboy");
	}
	
	@Ignore
	@Test
	public void mysoresandal() {
		System.out.println("Mysoresandal");
	}
	
	@Test
	public void pears() {
		System.out.println("Pears");
	}

}
