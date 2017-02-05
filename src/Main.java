import javax.swing.JFrame;

/**
 * 
 * @author gjm19_000
 *	Main is used to initialization
 *	Create frame and add new panels in
 *
 */
public class Main extends JFrame {
	
	MyPanel mp;
	
	public Main(){
		mp = new MyPanel();
		
		this.add(mp);
		this.addKeyListener(mp); // key listener
		
		this.setSize(400,300);
		this.setLocationRelativeTo(null); // set the panel at the center
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		Thread t = new Thread(mp);
		t.start();
	}
	
	public static void main(String args[]){
		Main wp = new Main();
	}
}
