package com.interestCalculatorApplication;

import java.util.Scanner;

import com.interestCalculatorApplication.bankClass.AxisBank;
import com.interestCalculatorApplication.bankClass.HdfcBank;
import com.interestCalculatorApplication.bankClass.IciciBank;
import com.interestCalculatorApplication.bankClass.SbiBank;
import com.interestCalculatorApplication.si.service.SiCalculator;

public class InterestCalculatorApplicationMain {

	public static void main(String[] args) {
		System.out.println("Hello Welcome to Simple Interest Calculator Application");
		System.out.println("Enter input in format:");
		System.out.println("BankName Amount months");
		
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();

		String[] inputs = input.split(" ");
		if (inputs.length == 3) {
			String bankName = inputs[0];

			double amount = Double.parseDouble(inputs[1]);
			double month = Double.parseDouble(inputs[2]);

			SiCalculator si = null;
			try {
				switch (bankName.toLowerCase()) {
				
				case ("hdfcbank"):
					si = new HdfcBank();
					break;

				case ("icicibank"):
					si = new IciciBank();
					break;

				case ("axisbank"):
					si = new AxisBank();
					break;
					
				case ("sbibank"):
					si = new SbiBank();
					break;
					
				default:
					System.out.println("Bank not found");
					System.exit(0);
				}
				scn.close();
			System.out.println("Your Annual interest will be:");	
			System.out.println(si.interest(amount, month));
			} 
			catch (Exception ex) {

			}
			
			
		}
		else {
			System.out.println("Entered input is not in correct format");
		}

	}

}
