package com.nttdata.maven.UMLConceptualModel;

public class OrderItem {
	private String upc;
	private int quantity;
	private int price;
	
	void getCost() {
		double cost = quantity * price;
		System.out.println(cost);
	}
}
