import java.awt.*;
import javax.swing.*;

public class Flag extends JPanel {


	  public void paintComponent(Graphics g) {

	  g.setColor(Color.black);
	  g.fillRect(50,100, 350,100);
	  g.setColor(Color.red);
	  g.fillRect(50,200, 350,100);
	  g.setColor(Color.yellow);
	  g.fillRect(50,300, 350,100);

}

public static void main(String[] args) {
  JFrame.setDefaultLookAndFeelDecorated(true);
  JFrame frame = new JFrame("Draw Rectangle");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setBackground(Color.white);
  frame.setSize(250, 200);

  Flag panel = new  Flag();

   frame.add(panel);

  frame.setVisible(true);
}

	}

