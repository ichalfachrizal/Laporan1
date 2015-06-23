package praktikum.sembilan.event;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class CobaEventButton extends JFrame {
	JButton tombol;
	public CobaEventButton(){
			super("even di swing");
			setLayout(new FlowLayout());
			setSize(500,300);
			createLayout();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
	public void createLayout(){
		tombol = new JButton("klik  saya");
		tombol.addActionListener(new ButtonListener(tombol));
		add(tombol);
	}
public static void main(String[] args) {
	new CobaEventButton();
}
}
