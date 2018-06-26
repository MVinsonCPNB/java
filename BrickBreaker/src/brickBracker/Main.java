package brickBracker;
import javax.swing.JFrame;

// start here: https://youtu.be/K9qMm3JbOH0?t=26m56s

public class Main {

	public static void main(String[] args) {
		
		//create a working frame
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10, 10, 694, 600);
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
	}

}
