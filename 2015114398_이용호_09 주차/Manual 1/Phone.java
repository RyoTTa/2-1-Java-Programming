import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Phone {

	public static void main(String[] args)
	{
		MyPhone p=new MyPhone();
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setSize(210,300);
		p.setVisible(true);
	}
}

class MyPhone extends JFrame{

	private JPanel lcdPanel;
	private JTextArea lcdJTextArea;
	private String lcdOutput = "";
	
	private JPanel keyPanel;
	private JButton keyJButtons[]=new JButton[15];
	
	private GridLayout grid1, grid2;
	private Container container;
	private String[] input={"Send","Clear","End","1","2","3","4","5","6","7","8","9","*","0","#"};
	
	public MyPhone() {
		super("PhoneTest");
		int i=0;
		
		for(i=0;i<15;i++){
			keyJButtons[i]=new JButton(input[i]);
		}
		container=getContentPane();

		lcdPanel=new JPanel();
		keyPanel=new JPanel();
		
		grid1=new GridLayout(5, 3);
		grid2=new GridLayout(2, 1);
		
		lcdJTextArea = new JTextArea(30,17);
		container.setLayout(grid2);
		lcdPanel.setLayout(new FlowLayout());
		lcdPanel.setBackground(Color.white);
		lcdPanel.add(lcdJTextArea);

		container.add(lcdPanel);
		
		keyPanel.setLayout(grid1);
		for (i=0;i<15;i++){
			keyPanel.add(keyJButtons[i]);
		}
		container.add(keyPanel);

		ButtonHandler handler = new ButtonHandler();
		for (i=0;i<15;i++){
			keyJButtons[i].addActionListener(handler);
		}
	}

private class ButtonHandler implements ActionListener{

	public void actionPerformed(ActionEvent event){
			
		if (event.getSource() == keyJButtons[0]){
			lcdOutput=lcdOutput.format(lcdOutput+"\n%s\n","전화 거는 중 ...");
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[1]) {
			lcdOutput=lcdOutput.substring(0, lcdOutput.length()-1);
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[2]) {
			lcdOutput="";
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[3]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%d",1);
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[4]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%d",2);
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[5]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%d",3);
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[6]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%d",4);
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[7]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%d",5);
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[8]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%d",6);
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[9]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%d",7);
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[10]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%d",8);
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[11]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%d",9);
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[12]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%c",'*');
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[13]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%d",0);
			lcdJTextArea.setText(lcdOutput);
		}
		else if (event.getSource() == keyJButtons[14]) {
			lcdOutput=lcdOutput.format(lcdOutput+"%c",'#');
			lcdJTextArea.setText(lcdOutput);
		}
		}
	}
}


