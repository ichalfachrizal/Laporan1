package praktikum.sembilan.event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CobaEventButton2 extends JFrame {
	JButton tombol;
	
	public CobaEventButton2(){
			super("even di swing");
			setLayout(new FlowLayout());
			setSize(500,300);
			//createLayout();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
	
	/*public void createLayout(){
		tombol = new JButton("klik saya");
		//tombol.addActionListener (new ButtonListener() {
			public void actionPerformed(ActionEvent e) {
				tombol.setText("ok");
			}
		});
		add(tombol);
	}*/
	
	
public static void main(String[] args) {
	new CobaEventButton();
}
}
