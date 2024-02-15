package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	public static void main(String[]args) {
		Robot rob = new Robot();
		rob.setSpeed(30);
		rob.setPenColor(0,0,0);
		rob.penDown();
		String shape = JOptionPane.showInputDialog("What shape do you want to draw?");
		String color = JOptionPane.showInputDialog("What color do you want the shape?");
		if(color.equals("red")) {
			rob.setPenColor(Color.RED);
		}
		else if(color.equals("green")) {
			rob.setPenColor(Color.GREEN);
		}
		else if(color.equals("blue")) {
			rob.setPenColor(Color.BLUE);
		}
		else if(color.equals("black")) {
			rob.setPenColor(Color.BLACK);
		}
		else {
			rob.setRandomPenColor();
		}
		if(shape.equals("Square")) {
			drawSquare(rob);
		}
		else if(shape.equals("Triangle")) {
			drawTriangle(rob);
		}
		else {
			drawCircle(rob);
		}	
		rob.hide();
	}
	public static void drawSquare(Robot rob) {
		for(int i=0; i<4; i++) {
			rob.move(60);
			rob.turn(90);
		}
	}
	public static void drawTriangle(Robot rob) {
		for(int i=0; i<3; i++) {
			rob.move(60);
			rob.turn(120);
		}
	}
	public static void drawCircle(Robot rob) {
		for(int i=0; i<180; i++) {
			rob.move(1);
			rob.turn(2);
		}
	}
}
