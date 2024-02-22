package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skills_Practice {
	public static void main(String[]args) {
		Skills_Practice skills = new Skills_Practice();
		skills.skills1();
		skills.skills2();
		skills.skills3();
		skills.skills4();
		skills.skills5();
	}
	public void skills1() {
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int cents = Integer.parseInt(dimes)*10;
		JOptionPane.showMessageDialog(null, cents);
		String inch = JOptionPane.showInputDialog("How tall are you in inches?");
		int inches = Integer.parseInt(inch);
		if(inches<36) {
			JOptionPane.showMessageDialog(null, "You need to eat your Wheaties");
		}
	}
	public void skills2() {
		for(int i=1; i<31; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
	public void skills3() {
		Random rand= new Random();
		int num1 = rand.nextInt(20);
		int num2 = rand.nextInt(10);
		int result =  num1 - num2;
		System.out.println(num1 +" - " + num2 + " = " + result);
	}
	public void skills4() {
		String city = JOptionPane.showInputDialog("Which city do you live in?");
		if(city.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest City");
		}
		else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego");
		}
		int cars = 2;
		if(cars==0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation");
		}
		else if(cars==1) {
			JOptionPane.showMessageDialog(null, "You have a 2019 Toyota Camry");
		}
		else {
			JOptionPane.showMessageDialog(null, cars*4);
		}
	}
	public void skills5() {
		String school = JOptionPane.showInputDialog("What school do you go to");
		JOptionPane.showMessageDialog(null, school + " is a great school.");
	}
}
