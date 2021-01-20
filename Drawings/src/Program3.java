import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Program3 extends JFrame {
	Program3(){
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}

	public static void main(String[] args) {
		Program3 three = new Program3();
		three.repaint();
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke (6f));
		g.setColor(Color.PINK.darker());
		int [] x = {200,57,112,288,343};
		int [] y = {50,154,321,321,154};
		g2d.drawPolygon(x,y,5);
	}

}
