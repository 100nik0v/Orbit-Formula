package orbit;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Original {
	public static void main (String args[]){
		 EventQueue.invokeLater(() ->
         {
            JFrame frame = new ArtistBob();
            frame.setTitle("Original");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         });
	      }
}
class ArtistBob extends JFrame{
	public ArtistBob () {
		 add(new UberEats());
		 pack();
	}
}
class UberEats extends JComponent{
	Toolkit kit = Toolkit.getDefaultToolkit();
	   Dimension screenSize = kit.getScreenSize();
	   int screenH = screenSize.height;
	   int screenW = screenSize.width;
	   public Dimension getPreferredSize() { return new Dimension(screenW, screenH); }
		//Draw Method:
	   public void paintComponent(Graphics g)
	   {
//		   Scanner in = new Scanner(System.in);
		   Graphics2D g2 = (Graphics2D) g;
//	      System.out.println("Type in the side number:");
//	      int sideNum = Integer.parseInt( in.nextLine());
		  double theta = 0;
		  double k = 2;
		  double decimal = 0.1;
		  while (theta < 100000) {
			  //Calculations:
			  double x = 1;
			  double cosTheta = -(Math.cos(theta)*k*x) + x - (Math.cos(theta*k)*x);
			  double inDegreesCos = Math.toDegrees(cosTheta);
			  double sinTheta = (Math.sin(theta)*k*x) + (-(Math.sin(k*theta)*x));
			  double inDegreesSin = Math.toDegrees(sinTheta);
	      //The Actual Drawing:
			  double radius = 10; 
		  g2.drawOval((int) (inDegreesCos) + screenW/2, (int) (inDegreesSin) + screenH/2, (int) radius, (int) radius);
		  theta++;
		  }
	   }
}
