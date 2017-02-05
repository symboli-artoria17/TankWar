import java.util.Vector;

public class MyTank extends Tank {
	
	Bullet bullet = null;
	Vector<Bullet> bullets = new Vector<Bullet>();
	
	// constructor
	public MyTank(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void goUp(){
		this.setY(this.getY()-this.getSpeed());
	}
	
	public void goDown(){
		this.setY(this.getY()+this.getSpeed());
	}
	
	public void goLeft(){
		this.setX(this.getX()-this.getSpeed());
	}
	
	public void goRight(){
		this.setX(this.getX()+this.getSpeed());
	}
	
	public void shoot(){
		switch(this.getDirection()){
		case 0:
			bullet = new Bullet(this.getX()+10,this.getY(),0);
			bullets.add(bullet);
			break;
		case 1:
			bullet = new Bullet(this.getX(),this.getY()+10,1);
			bullets.add(bullet);
			break;
		case 2:
			bullet = new Bullet(this.getX()+10,this.getY()+30,2);
			bullets.add(bullet);
			break;
		case 3:			
			bullet = new Bullet(this.getX()+30,this.getY()+10,3);
			bullets.add(bullet);
			break;		
		}
		
		// System.out.println(bullets.size());
		Thread t = new Thread(bullet);
		t.start();
	}
}
