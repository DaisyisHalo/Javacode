import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Program2 extends JFrame{
	Program2(){
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}

	public static void main(String[] args) {
		Program2 two = new Program2();
		two.repaint();
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(7f));
		
		g2d.draw(new Line2D.Float(50,0,50,200));
		g2d.draw(new Line2D.Float(150,0,150,200));
		
		g2d.setColor(Color.RED);
		g2d.draw(new Line2D.Float(0,50,200,50));
		g2d.draw(new Line2D.Float(0,150,200,150));
		
		
	}

}
