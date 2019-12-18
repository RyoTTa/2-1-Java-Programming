import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;

public class Shapes extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Random randomNum=new Random();
		
		int i,j;
		int W=getWidth(),H=getHeight();
		
		for(i=0;i<W;i=i+10){
			for(j=0;j<H;j=j+10){
				g.setColor(new Color(1+randomNum.nextInt(255),1+randomNum.nextInt(255),1+randomNum.nextInt(255)));
				g.fillRect(i, j, 10, 10);
			}
		}
	}
}
