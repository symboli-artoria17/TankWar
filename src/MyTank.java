
public class MyTank extends Tank {

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
			
		}
	}
}
