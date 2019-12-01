import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class draw {
	private JFrame mainFrame;
	//Contructor
	public draw(){
		Gui();
	}

	public static void main(String[] args) {
		draw d = new draw();
		System.out.println("hello");
		
	    }
	private void Gui(){
		mainFrame = new JFrame("Frame");	
		mainFrame.setSize(600,500);
		mainFrame.setLayout(new GridLayout(1,2));
		createPanel(1);
		createPanel(2);
 	    	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}

	private void createPanel(int x){
		JPanel panel = new JPanel();
		mainFrame.add(panel);
		JButton button = new JButton("button 1");
		JButton button1 = new JButton("button 2");
		button.addActionListener(new ActionListener(){
			@Override
            		public void actionPerformed(ActionEvent arg0) {
				System.out.println("hello");
			}
		});
		panel.add(button);
		panel.add(button1);

	}

}

