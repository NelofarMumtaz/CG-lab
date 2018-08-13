import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;


public class drawinglines extends JFrame {


	public drawinglines()
	{
		setTitle("LineDraw");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		 //horizontal line
		g.setColor(Color.RED);
		g.drawLine(100, 600, 600, 600);
		
		//diagonal line 
		g.setColor(Color.green);
		g.drawLine(100, 100, 600, 600);
		
		 //diagonal line 
		g.setColor(Color.BLUE);
		g.drawLine(100, 100, 100, 600);
		
	}
	
	
	public static void main(String[] args) {
		drawinglines line = new drawinglines();
	}
}
	
