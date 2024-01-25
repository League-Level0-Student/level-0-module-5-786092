package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_Not {
	public static void main(String[]args) {
		String question = JOptionPane.showInputDialog("Enter a number:");
		int prime = Integer.parseInt(question);
		boolean isprime = true;
		for(int i=2; i<prime; i++) {
			if(prime%i==0) {
				isprime = false;
			    break;
			}
		}
		if(isprime) {
			JOptionPane.showMessageDialog(null, "The number is prime");
		}
		else {
			JOptionPane.showMessageDialog(null, "The number is not prime");
		}
	}
}
