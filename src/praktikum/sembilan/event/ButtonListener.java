package praktikum.sembilan.event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ButtonListener implements ActionListener {
	JButton tombol;
	public ButtonListener(JButton tombol) {
		this.tombol = tombol;
	}
	public void actionPerformed(ActionEvent even) {
		tombol.setText("ok");
	}
}
