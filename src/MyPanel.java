import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	MyTank mt;
	
	public MyPanel(){
		mt = new MyTank(100,100);
	}
	
	public void paint(Graphics g){
		// Graphics g is the painter
		
		super.paint(g);
		
		// draw the background (a rectangle)
		g.fillRect(0, 0, 400, 300);
		
	}
	
	public void drawTank(int x, int y, Graphics g, int direction, int type){
		switch(type){
		case 0: // 0 means my tank
			g.setColor(Color.yellow);
			break;
		case 1: // enemy tanks
			g.setColor(Color.green);
			break;
		}
	}
}
