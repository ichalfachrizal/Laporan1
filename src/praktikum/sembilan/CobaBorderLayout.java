package praktikum.sembilan;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class CobaBorderLayout extends JFrame {
	public CobaBorderLayout(){
		super("coba border layout");
		setSize(500,300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void createLayout(){
		add(BorderLayout.NORTH,new JButton("North"));
		add(BorderLayout.SOUTH,new JButton("South"));
		add(BorderLayout.EAST,new JButton("East"));
		add(BorderLayout.WEST,new JButton("west"));
		add(BorderLayout.CENTER,new JButton("center"));		
	}
	public static void main(String[] args) {
		new CobaBorderLayout();
	}
}
