package com.nttdata.maven.Invoice;

public class Invoice {
	
	static String partNumber;
	static String partDescription;
	static int quantity;
	static double price;
	static double invoiceAmount;
	
	Invoice(String partNumber, String partDescription, int quantity, double price){
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	
	

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		Invoice.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		Invoice.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		Invoice.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		Invoice.price = price;
	}
	
	void getInvoice () {
		double invoiceAmount;
		if (quantity > 0) {
			invoiceAmount = price * quantity;
		} else {
			quantity = 0;
			invoiceAmount = price * quantity;
		}
		
	}
	
}
