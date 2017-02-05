import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener{
	
	MyTank mt;
	private int EnemyNumber = 3;
	
	// Vector is synchronized. Enemy is not. 
	private Vector<EnemyTank> enemies = new Vector<EnemyTank>();
	
	public MyPanel(){
		
		// generate player's tank
		mt = new MyTank(140,232);
		
		// generate enemies' tank
		for (int i=0;i<EnemyNumber;i++){
			enemies.add(new EnemyTank(i*181+5,0));
		}
	}
	
	public void paint(Graphics g){
		// Graphics g is the painter
		
		super.paint(g);
		
		// draw the background (a rectangle)
		g.fillRect(0, 0, 400, 300);
		this.drawTank(mt.getX(), mt.getY(), g, mt.getDirection(), 0);
		for (int i=0; i<EnemyNumber; i++){
			this.drawTank(enemies.get(i).getX(), enemies.get(i).getY(), g, 2, 1);
		}
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
		
		switch(direction)
		{
		case 0: // up
			g.fill3DRect(x, y, 5, 30,false);
			g.fill3DRect(x+15,y , 5, 30,false);
			g.fill3DRect(x+5,y+5 , 10, 20,false);
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y-3);
			break;
		case 1: // left
			g.fill3DRect(x, y, 30, 5,false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false);
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x-3, y+10);
			break;
		case 2: // down
			g.fill3DRect(x, y, 5, 30,false);
			g.fill3DRect(x+15,y , 5, 30,false);
			g.fill3DRect(x+5,y+5 , 10, 20,false);
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y+33);
			break;
		case 3: // right
			g.fill3DRect(x, y, 30, 5,false);
			g.fill3DRect(x, y+15, 30, 5, false);
			g.fill3DRect(x+5, y+5, 20, 10, false);
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x+33, y+10);
			break;			
		}
		this.repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		/*
		 *  WASD up, down, left, right
		 */
		if(e.getKeyCode()==KeyEvent.VK_W){
			this.mt.setDirection(0);
			this.mt.goUp();	
		}else if(e.getKeyCode()==KeyEvent.VK_A){
			this.mt.setDirection(1);
			this.mt.goLeft();
		}else if(e.getKeyCode()==KeyEvent.VK_S){
			this.mt.setDirection(2);
			this.mt.goDown();
		}else if(e.getKeyCode()==KeyEvent.VK_D){
			this.mt.setDirection(3);
			this.mt.goRight();
		}
		
		if (e.getKeyCode() == KeyEvent.VK_J){
			this.mt.shoot();
		}
		
		
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
}
