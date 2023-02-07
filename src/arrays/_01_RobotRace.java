package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Random ran = new Random();
	//2. create an array of 5 robots.
		Robot[] robotArray = new Robot[6];
	//3. use a for loop to initialize the robots.
		for(int i = 0; i < robotArray.length; i++) {
			Robot rob = new Robot();
			rob.setX(100 + i*150);
			rob.setY(500);
			rob.penUp();
			rob.setSpeed(1000);
			robotArray[i] = rob;

		}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		boolean unfinished = true;
		while(unfinished) {
			for(int j = 0; j<robotArray.length; j++) {
				robotArray[j].move(ran.nextInt(50));
				if(robotArray[j].getY()<=0) {
					JOptionPane.showMessageDialog(null, "Robot " + (j+1) + " won!");
					unfinished = false;
					break;
				}
			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
		
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
		
	}
}
