import java.awt.Color;

import java.awt.Graphics;

import javax.swing.JFrame;

public class FaceArt extends JFrame {
	
	public FaceArt() {
		this.setSize(500,500); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) {
		
		//whole face
		g.setColor(Color.red);
		g.fillOval(50, 50, 400, 400);
				
		//eyes
		g.setColor(Color.black);
		g.fillOval(270, 165, 80, 80);
		g.fillOval(140, 165, 80, 80);
		
		g.setColor(Color.black);
		g.fillOval(175, 290, 150, 50);
		
		//mouth
		g.setColor(Color.red);
		g.fillRect(175, 330, 150, 50);
		g.fillOval(175, 320, 150, 50);
		
		//eyebrow
		g.setColor(Color.black);
		g.fillRect(270, 130, 110, 20);
		g.fillRect(115, 130, 110, 20);
		
	}
	public static void main(String args[]) {
		
		FaceArt objAngryFace = new FaceArt();
		objAngryFace.setVisible(true);
		
	}

}
