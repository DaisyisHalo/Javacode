import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class ProgramBonus extends JFrame{
	ProgramBonus(){
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
}

	public static void main(String[] args) {
		ProgramBonus bonus = new ProgramBonus();
		bonus.repaint();
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(6f));
		g2d.setColor(Color.ORANGE);
		g2d.drawOval(75,75,250,250);
		
		g2d.setColor(Color.GREEN.darker());
		g2d.fillOval(150,120,30,30);
		g2d.fillOval(230,120,30,30);
		
		g2d.setColor(Color.MAGENTA);
		int[]x= {200,160,230};
		int[]y= {180,235,235};
		g2d.fillPolygon(x,y,3);
		
		g2d.setColor(Color.RED);
		g.drawArc(120, 140, 160, 160,  -30, -120);
	}

}
