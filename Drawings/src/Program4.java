import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Program4 extends JFrame{
	Program4(){
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
}

	public static void main(String[] args) {
		Program4 four = new Program4();
		four.repaint();
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		int x = 15;
		final int y= 40;
		for(int i= 0; i < 4; i++) {
			g.setColor(new Color(20,137,255));
			g.fillOval(x, 60, y, y);
			x = x+y+5;
			g.setColor(Color.yellow);
			g.fillOval(x, 60, y, y);
			x = x+y+5;
		}
	}

}
