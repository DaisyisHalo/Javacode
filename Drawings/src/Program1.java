import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Program1 extends JFrame {
	Program1(){
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
}

	public static void main(String[] args) {
		Program1 one = new Program1();
		one.repaint();

	}
	
	public void paint(Graphics g) {
		g.setColor(new Color(21,137,255));
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.green.darker());
		g.fillRect(200,0, 400, 400);
		g.setColor(Color.green.darker());
		g.fillRect(0, 200, 400, 400);
		g.setColor(new Color(21,137,255));
		g.fillRect(200, 200, 400, 400);
	}
	
	
	

}
