package praktikum.sembilan.event;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CobaEventTextField extends JFrame {
	JTextField textField;
	JTextField textFieldDua;
	
	public CobaEventTextField() {
		super("even di swing");
		setLayout(new FlowLayout());
		setSize(500,300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void createLayout() {
		textField=new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent even) {
				textFieldDua.setText(textField.getText());
			}
		});
		textField.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent event) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent event) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent event) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent event) {
				// TODO Auto-generated method stub
				textFieldDua.setText("even mouse entered");
			}
			
			@Override
			public void mouseClicked(MouseEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		textField.setColumns(20);
		add(textField);
		textFieldDua = new JTextField();
		textFieldDua.setColumns(20);
		add(textFieldDua);
	}
	public static void main (String args[]) {
		new CobaEventTextField();
	}
}
