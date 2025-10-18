
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		// 2. Make the robot draw a shape (this will take more than one line of code)
		// 3. Set the pen width to 10
		// 4. Ask the 67 user what color pen they would like the robot to draw with
		// 5. Use an if/else statement to set the pen color that the user requested
		// 6. If the user doesn't enter anything, choose a random color
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them
		for(int sixseven=0;sixseven<7;sixseven++) {
		Robot rob = new Robot();
		rob.penDown();
		String something = JOptionPane.showInputDialog("What color should rob draw with");
		if (something.equals("red")) {
			rob.setPenColor(Color.red);
		} else if (something.equals("orange")) {
			rob.setPenColor(245, 94, 29);
		} else if (something.equals("yellow")) {
			rob.setPenColor(245, 198, 29);
		} else if (something.equals("green")) {
			rob.setPenColor(62, 201, 34);
		} else if (something.equals("blue")) {
			rob.setPenColor(41, 47, 227);
		} else if (something.equals("purple")) {
			rob.setPenColor(143, 41, 227);
		} else {
			rob.setRandomPenColor();
		}
		rob.setSpeed(5);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		}
	}
}
