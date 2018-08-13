import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;


public class EmojjeeFace extends Applet {

	public void paint(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.drawOval(60, 60, 200, 200);
		g.setColor(Color.YELLOW);
		g.fillOval(60,60,200,200);
		g.setColor(Color.BLACK);
		g.fillOval(100, 100, 40, 40);
		g.fillOval(190, 100, 40, 40);
		g.setColor(Color.BLACK);
		g.drawLine(130,190,190,190);
		
		g.setColor(Color.yellow);
		g.fillOval(250, 200, 350, 350);
		g.setColor(Color.BLACK);
		g.drawOval(250,200,350,350);		
		
		g.setColor(Color.black);
		g.fillRect(310,290,80,8);
		
		g.setColor(Color.black);
		g.fillRect(460,290,80,8);
		
		g.setColor(Color.black);
		g.fillRect(355,460,150,8);
		
		
	}
	public static void main(String[] args) 
	{
		EmojjeeFace face = new EmojjeeFace();
	}


	}

