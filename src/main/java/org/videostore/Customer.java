package org.videostore;

import java.util.Vector;

public class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<Rental>();
	
	public Customer (String name){
		this.name = name;
	}
	
	public void addRental(Rental arg) {
		rentals.addElement(arg);
	}
	
	public String getName (){
		return name;
	}
	
	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";
		for (Rental rental : rentals) {
			frequentRenterPoints += getFrequentRenterPoints(rental);
			//show figures for this rental
			result += "\t" + rental.getMovie().getTitle()+ "\t"
					+ String.valueOf(rental.getCharge()) + "\n";
			totalAmount += rental.getCharge();
		}
		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)
		+ " frequent renter points";
		return result;
	}
	
	private int getFrequentRenterPoints (Rental rental) {
		return rental.getFrequentRenterPoints();
	}
}
