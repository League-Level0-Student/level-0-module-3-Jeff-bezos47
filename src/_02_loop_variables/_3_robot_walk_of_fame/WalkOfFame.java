
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
rob.setX(50);
		// 2. Make the robot draw a star shape. Hint: angle=144.
rob.setSpeed(200);
rob.penDown();
rob.setAngle(90);
//rob.move(100);
//rob.turn(144);
//rob.move(100);
//rob.turn(144);
//rob.move(150);
//rob.turn(144);
//rob.move(150);
//rob.turn(144);
//rob.move(150);
for(int tni=0; tni<10; tni++) {
for(int robbot = 0; robbot<6; robbot++) {
	rob.move(100);
	rob.turn(144);
	
	
	
}

rob.penUp();
rob.setAngle(90);
rob.move(50);
rob.penDown();

}
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
