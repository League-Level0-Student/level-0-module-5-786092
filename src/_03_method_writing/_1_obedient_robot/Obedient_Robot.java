package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	public static void main(String[]args) {
		Robot rob = new Robot();
		rob.setSpeed(30);
		rob.setPenColor(0,0,0);
		rob.penDown();	
		drawSquare(rob);
		drawTriangle(rob);
		drawCircle(rob);
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
