
public class Bullet implements Runnable {
	private int x,y,direction;
	private int speed = 2;
	private boolean active = true;
	
	public Bullet(int x, int y, int direction){
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	@Override
	public void run() {
		while(true){
			
			// Here is a dead loop, we need make them sleep otherwise the memory will explode lol
			try{
				Thread.sleep(50);
			} catch(Exception e){
				e.printStackTrace(System.out);;
			}
			
			// Move the bullet
			switch(this.getDirection()){
			case 0:
				this.setY(this.getY()-speed);
				break;
			case 1:
				this.setX(this.getX()-speed);
				break;
			case 2:
				this.setY(this.getY()+speed);
				break;
			case 3:
				this.setX(this.getX()+speed);
				break;
			}
			
			if (x<0||x>400||y<0||y>300){
				this.active = false;
				break;
			}
		}
		
	}
}
