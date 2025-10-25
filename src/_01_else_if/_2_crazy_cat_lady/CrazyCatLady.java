
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String something = JOptionPane.showInputDialog("how many cats do you have");
		// 2. Convert their answer into an int
		int cat = Integer.parseInt(something);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if(cat >= 3) {
			JOptionPane.showMessageDialog(null,"You are a crazy cat lady");
		
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		} else	if(cat > 0) {
			playVideo("https://www.youtube.com/shorts/Vj3bhVdtg1w");
		}
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		if(cat == 0) {
			playVideo("https://www.google.com/search?q=frog+sitting+on+a+bench+like+a+human&rlz=1C5CHFA_enUS1012US1012&oq=frog+&aqs=chrome.2.69i57j0i67i512i650j69i59j0i67i512i650l4j69i61.3479j0j7&sourceid=chrome&ie=UTF-8#fpstate=ive&vld=cid:5b8553ea,vid:oj_yLBltPE8,st:0");
		}
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

