package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Story {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String something = JOptionPane.showInputDialog("you approach the dungeon. a. go inside b. turn around");
		if (something.equals("a")) {
			JOptionPane.showMessageDialog(null,	"you walk into the dungeon and get crushed by a large boulder. you die.");
		} else if (something.equals("b")) {
			String pie = JOptionPane.showInputDialog("You tun around, the floor opens beneath you and you fall into a different dungeon. Do you, a. try to get out or b. press further on");

			if (pie.equals("a")) {
				JOptionPane.showMessageDialog(null,	"You manage to get out after several hours of trying, but you slip and fall back in. death by skill issue.");
			}else if(pie.equals("b")) {
				JOptionPane.showMessageDialog(null, "You walk further in the dungeon just to find a blank wall. it falls over and crushes you dead. you die.");
						
			}else if(pie.equals("c")) {
				JOptionPane.showMessageDialog(null,	"You smart little boy... There is an exit, you walk out just to fall into a pit of lava. you die.");
			}
			else {
				JOptionPane.showMessageDialog(null,	"You find a random exat cuz you are big brain, then have a massive heart attack and die"
						+ "");
			}
			 
		}

	}
}
