package praktikum.sembilan;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CobaGUI {
	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame("halo swing");
		JLabel label = new JLabel("tes label");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,100);
		frame.setVisible(true);
	}
}
