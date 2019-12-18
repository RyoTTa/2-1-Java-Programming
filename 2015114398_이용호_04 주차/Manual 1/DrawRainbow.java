import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawRainbow extends JPanel{

	private final static Color VIOLET=new Color(128,0,128);
	private final static Color INDIGO=new Color(75,0,130);
	
	private Color[] colors={Color.WHITE,Color.WHITE,VIOLET,INDIGO,Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED};
	
	public DrawRainbow(){
		setBackground(Color.WHITE);
	}
	public void paintComponent(Graphics g){
		 super.paintComponent(g);
		 
		 int radius=20;
		 
		 int centerX=getWidth()/2;
		 int centerY=getHeight()-10;
		 int centerX2=getWidth()/2;
		 int centerY2=getHeight();
		 
		 for(int counter=colors.length;counter>0;counter--){
			 g.setColor(colors[counter-1]);
			 
			 g.fillArc(centerX-counter*radius,centerY-counter*radius,counter*radius*2,counter*radius*2,0,180);
			 g.fillArc(centerX-counter*radius,-counter*radius+10,counter*radius*2,counter*radius*2,0,-180);
		 }
	}
	
	public static void main(String[] args){
		
		DrawRainbow panel=new DrawRainbow();
		JFrame application=new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 400);
		application.setVisible(true);
	}
}
