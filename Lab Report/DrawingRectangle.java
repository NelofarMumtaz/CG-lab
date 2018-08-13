import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class DrawingRectangle extends JFrame {

	public DrawingRectangle() {
		setTitle("Platform");
		setSize(1000,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
 
	public void paint(Graphics g){

		g.setColor(Color.BLUE);
		g.drawLine(98, 200, 350, 200);
		g.setColor(Color.GREEN);
		g.drawLine(98, 200, 98, 300);
		g.setColor(Color.YELLOW);
		g.drawLine(98, 300, 350, 300);
		g.setColor(Color.CYAN);
		g.drawLine(350, 300, 350, 200);
		
	
	}
	public static void main(String[] args) 
	{
		
		DrawingRectangle rectangle = new DrawingRectangle();
	}

	

}
