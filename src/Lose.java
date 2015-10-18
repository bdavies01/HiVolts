import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lose extends JFrame{
	public Lose() {
		JLabel label = new JLabel();
		label.setText("Lost.");
		this.add(label);
		setSize(650, 650);
		setVisible(true);
	}
}
