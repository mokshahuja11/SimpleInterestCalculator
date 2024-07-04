package com.interestCalculatorApplication.si.service;

public abstract class SiCalculator {
	
	public abstract double getInterestRate();

	
	public double interest (double amount, double months) {
		double interest;
		interest=(amount*months*getInterestRate())/100;
		return  interest;
	}
	
	
}
