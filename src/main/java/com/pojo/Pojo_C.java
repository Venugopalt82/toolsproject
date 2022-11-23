package com.pojo;

public class Pojo_C {
	public static void main(String[] args) {
		Pojo_A b = new Pojo_A();
		
		int id = b.getId();
		System.out.println(id);
		
		b.setId(100);
		int id2 = b.getId();
		System.out.println(id2);
		
		
	}

}
