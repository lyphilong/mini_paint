import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class draw {
	private JFrame mainFrame;
	//Contructor
	public draw(){
		Gui();
	}
	

	//The pop up menu when cliked right button of mouse
	class PopUpDemo extends JPopupMenu {
	    //TODO: Need add spec in here
	    JMenuItem anItem;
	    public PopUpDemo() {
		anItem = new JMenuItem("Click Me!");
		add(anItem);
	    }
	}

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
		System.out.println("hello");
		
	    }
	private void Gui(){
		mainFrame = new JFrame("Frame");	
		mainFrame.setSize(600,500);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.addMouseListener(new PopClickListener());
		mainFrame.add(new ControlPanel(), BorderLayout.WEST);
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
	public class ControlPanel extends JPanel{
		//TODO: Control which will draw
		public ControlPanel(){
		this.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		JButton undo = new JButton("undo");
		JButton clear= new JButton("clear");

		//Set size of button
		undo.setPreferredSize(new Dimension(140,140));	
		clear.setPreferredSize(new Dimension(140,140));	
		
		p.add(undo);
		p.add(clear);
		p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
		this.add(p, BorderLayout.CENTER);
		}
	}
}

