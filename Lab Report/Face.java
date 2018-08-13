import java.awt.*;

import java.applet.*;

public class Face extends Applet {

	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawOval(60, 60, 200, 200);
		
		g.setColor(Color.BLUE);
		g.fillOval(90, 120, 50, 20);
		g.fillOval(190, 120, 50, 20);

		g.setColor(Color.MAGENTA);
		g.drawLine(165, 125, 165, 175);
		
		
		g.setColor(Color.CYAN);
		g.drawArc(110, 130, 95, 95, 0, -180);
		
		
		
		

	}

	

}
