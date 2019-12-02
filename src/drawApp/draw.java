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
		public ControlPanel(){
			JLabel label = new JLabel("Control Panel");
			this.add(label);
			this.setBackground(Color.LIGHT_GRAY);
			this.add(new JButton("b1"));
			this.add(new JButton("b2"));
			this.add(new JButton("b3"));
			this.add(new JButton("b4"));
			this.setAlignmentX(Component.CENTER_ALIGNMENT);
			this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		}
	}
}

