package praktikum.sembilan;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class CobaGridLayout extends JFrame {
	public CobaGridLayout(){
		super("coba borderlayout");
		setLayout(new GridLayout(7,3));
		setSize(500,300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void createLayout(){
		for (int i=0; i<20; i++)
			add(new JButton("tombol " + i));
	}
	public static void main(String[] args){
		new CobaGridLayout();
	}
}
