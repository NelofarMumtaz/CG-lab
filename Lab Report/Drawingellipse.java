import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Drawingellipse extends JFrame {
		
		public Drawingellipse() {
			setTitle("EllipseDraw");
			setSize(960,960);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		public void paint(Graphics g)
		{
			g.setColor(Color.ORANGE);
			g.drawOval(200, 300, 200, 100);
		

		}
		public static void main(String[] args) 
		{
			Drawingellipse ellipse = new Drawingellipse();
		}

}
	