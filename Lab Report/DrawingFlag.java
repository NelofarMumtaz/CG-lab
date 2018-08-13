import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Graphics;



public class DrawingFlag {

 
	static void drawFlag(Graphics g)
	{
	  g.setColor(Color.yellow);
	  g.fillRect(0,0,150,30);
	} 




	  public static void main(String argv []){
	    BufferedImage image = new BufferedImage(150,90, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g = image.createGraphics();
	    drawFlag(g);
	    g.dispose();
	    try {
	        File out = new File("flag.png");
	        ImageIO.write(image, "png", out);
	    }catch(Exception e){
	     System.err.println(e);
	    }
	  }
	}
 

