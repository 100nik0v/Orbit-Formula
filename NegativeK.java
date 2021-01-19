package orbit;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class NegativeK {
	public static void main (String args[]){
		 EventQueue.invokeLater(() ->
         {
            JFrame frame = new ArtistJoe();
            frame.setTitle("Inversed Black Hole");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         });
	      }
}
class ArtistJoe extends JFrame{
	public ArtistJoe () {
		 add(new UberE());
		 pack();
	}
}
class UberE extends JComponent{
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
		  double k = -10;
		  double decimal = 0.1;
		  while (theta < 1000000) {
			  //Calculations:
			  double x = 1;
			  double cosTheta = -(Math.cos(theta)*k*x) + x - (Math.cos(theta*k)*x);
			  double inDegreesCos = Math.toDegrees(cosTheta);
			  double sinTheta = (Math.sin(theta)*k*x) + (-(Math.sin(k*theta)*x));
			  double inDegreesSin = Math.toDegrees(sinTheta);
	      //The Actual Drawing:
			  double radius = 1; 
			  double decimalsub = 4;
			  decimalsub /= 2; 
		  g2.drawOval((int) (inDegreesCos) + screenW/2, (int) (inDegreesSin) + screenH/2, (int) radius, (int) radius);
		  theta++;
//		  k -= decimalsub;
		  k -= 0.00001;
		  }
	   }
}
