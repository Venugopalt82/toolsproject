package com.testng;

import org.testng.annotations.Test;

public class Groups_Practice {
	
	@Test (groups = "Soap")
	public void lux() {
		System.out.println("Lux");
	}
	
	@Test (groups = "Soap")
	public void lifeboy() {
		System.out.println("Lifeboy");
	}
	
	@Test (groups = "Soap")
	public void mysoresandal() {
		System.out.println("Mysoresandal");
	}
	
	@Test (groups = "Soap")
	public void pears() {
		System.out.println("Pears");
	}
	
	@Test (groups = "Stationary")
	public void book() {
		System.out.println("Book");
	}
	
	@Test (groups = "Stationary")
	public void pen() {
		System.out.println("Pen");
	}
	
	@Test (groups = "Stationary")
	public void pencil() {
		System.out.println("Pencil");
	}
	
	@Test (groups = "Furniture")
	public void table () {
		System.out.println("Table");
	}
	
	@Test (groups = "Furniture")
	public void chair () {
		System.out.println("Chair");
	}
	
	
}
