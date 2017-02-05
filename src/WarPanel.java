import javax.swing.JFrame;

/**
 * 
 * @author gjm19_000
 *	WarPanel is used to initialization
 *	Create frame and add new panels in
 *
 */
public class WarPanel extends JFrame {
	
	MyPanel mp;
	
	public WarPanel(){
		mp = new MyPanel();
		
		this.add(mp);
		this.setSize(400,300);
		this.setLocationRelativeTo(null); // set the panel at the center
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String args[]){
		WarPanel wp = new WarPanel();
	}
}
