import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class DrawingTriangle extends JFrame {
	
	public  DrawingTriangle ()
	{
		setTitle("Triangle");
		setSize(960,980);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.LIGHT_GRAY);
		g.drawLine(150, 350, 500, 350);
		g.setColor(Color.BLUE);
		g.drawLine(150, 350, 330, 200);
		g.setColor(Color.PINK);
		g.drawLine(330, 200, 500, 350);
		
	
	}

	public static void main(String[] args) 
	{
		 DrawingTriangle triangle = new DrawingTriangle();
	}

}
