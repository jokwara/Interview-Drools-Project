package net.oak.softsys.model.domain;


public class Product { 
	
	private String productName;
	private double interestRate;
	private boolean disqualified; 
	private static final double FIXED_INTEREST_RATE = 5.0;
	
	public Product() {
		
	}
	
	public Product(String productName, double interestRate, boolean disqualified) {
		super();
		this.productName = productName;
		this.interestRate = interestRate;
		this.disqualified = disqualified;
	}

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public boolean isDisqualified() {
		return disqualified;
	}

	public void setDisqualified(boolean disqualified) {
		this.disqualified = disqualified;
	}

	public static double getFixedInterestRate() {
		return FIXED_INTEREST_RATE;
	} 
}
