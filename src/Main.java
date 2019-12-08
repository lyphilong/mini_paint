import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.geom.*;


public class Main{
	private JFrame frame;
	private ControlPanel cp;	
	private DrawShape shape;
	public Main(){
		shape = new Polygon();
		System.out.println(shape.getLocation());
		shape.setLocation(new Point(5,7));
		System.out.println(shape.getLocation());

		Gui();
	}

	public static void main(String[] args){
		Main m = new Main();
	
	}
	public void Gui(){
		frame = new JFrame("PAINT");	
		frame.setLayout(new BorderLayout());
		frame.setSize(500,500);
		frame.add(new ControlPanel(), BorderLayout.WEST);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public class ControlPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g){
			Graphics2D g2d = (Graphics2D) g;
			shape.paint(g2d);

		}

	}
}
