import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.geom.*;

public class draw {
	private JFrame mainFrame;
	private draw.DrawPanel dp = new DrawPanel();
	//private draw.ControlPanel cp = new ControlPanel(dp);	
	//Contructor
	public draw(){
		Gui();
	}
	

	//The pop up menu when cliked right button of mouse
	class PopUpDemo extends JPopupMenu {
	    //TODO: Need add spec in here
	    JMenuItem color;
	    JMenuItem delete;
	    public PopUpDemo() {
		color = new JMenuItem("Color");
		delete = new JMenuItem("Delete");
		add(color);
		add(delete);
	    }
	}

	//TODO: Add more action in th PopUp
	class PopClickListener extends MouseAdapter {
	    public void mousePressed(MouseEvent e) {
		if (e.isPopupTrigger())
		    doPop(e);
	    }

	    public void mouseReleased(MouseEvent e) {
		if (e.isPopupTrigger())
		    doPop(e);
	    }

	    private void doPop(MouseEvent e) {
		PopUpDemo menu = new PopUpDemo();
		menu.show(e.getComponent(), e.getX(), e.getY());
	    }
	}

	public static void main(String[] args) {
		draw d = new draw();
		
	    }
	private void Gui(){
		mainFrame = new JFrame("Frame");	
		mainFrame.setSize(1600,1500);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.addMouseListener(new PopClickListener());
		//TODO: Set to 2 class
		mainFrame.add(new ControlPanel(), BorderLayout.WEST);
		dp.setSize(1500,1500);
		dp.setLayout(new GridLayout());
		dp.setVisible(true);
		dp.setBackground(Color.GREEN);
		mainFrame.add(dp);
 	    	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
//		mainFrame.pack();
	}

	public class ControlPanel extends JPanel{
		//TODO: Control which will draw
		public ControlPanel(){
		this.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		//TODO: Need the same size on button
		JButton undo = new JButton("undo");
		JButton clear= new JButton("clear");

		//Set size of button
		undo.setSize(140,140);	
		clear.setSize(140,140);	
		
		p.add(undo);
		p.add(clear);
		p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
		this.add(p, BorderLayout.CENTER);
		}
	}


	public class Rect{
		private float width;
		private float height;	

		public Rect(){
			width = 150;
			height = 150;
		}

		public void draw(Graphics2D g){
			g.drawRect(150,150,150,150);
		}
	}


	public class DrawPanel extends JPanel{
		public DrawPanel(){
		}
		@Override
		public Dimension getPreferredSize(){
			return new Dimension(500,500);
		}
		
		//TODO: Add shape to draw n here
		@Override 
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g.create();

			//g2d.drawRect(150,150,150,150);
			g2d.dispose();
		}
	}
}

