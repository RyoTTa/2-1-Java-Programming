import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawPanel extends JPanel{
	
	public DrawPanel(){
		setBackground(Color.WHITE);
	}
	public void paintComponent(Graphics g){
		 super.paintComponent(g);
		 
		 MyFillOval.draw(g,0,0,400,400);
		 MyFillRect.draw(g,200,0,400,400);
		 MyDrawLine.draw(g,0,200,200,400);
		 MyFillArc.draw(g,200,200,200,200,30,300);
	}
	public static void main(String[] args){
		
		DrawPanel panel=new DrawPanel();
		JFrame application=new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 400);
		application.setVisible(true);
	}
}
class MyFillOval{
	public static void draw(Graphics g,int x,int y, int width,int height){
		
		g.fillOval(x,y , width/2, height/2);
	}
}
class MyFillRect{
	public static void draw(Graphics g,int x,int y, int width,int height){
		
		g.setColor(Color.orange);
		g.fillRect(x,y , width/2, height/2);

	}
}
class MyDrawLine{
	public static void draw(Graphics g,int x,int y, int width,int height){
		
		g.setColor(Color.red);
		g.drawLine(x,y , width, height);

	}
}
class MyFillArc{
	public static void draw(Graphics g,int x,int y, int width,int height,int a,int b){
		
		g.setColor(Color.blue);
		g.fillArc(x, y, width, height, a, b);

	}
}