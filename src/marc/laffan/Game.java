package marc.laffan;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class Game extends JFrame implements ActionListener{

	// Variables
		final int MAX_INPUT_LENGTH = 20;
		final int INPUT_MODE = 0;
		final int RESULT_MODE = 1;
		final int ERROR_MODE = 2;
		int displayMode;

		boolean clearOnNextDigit, percent;
		double lastNumber;
		String lastOperator;

		private JMenu jmenuFile, jmenuHelp;
		private JMenuItem jmenuitemExit, jmenuitemAbout;
		
		private JLabel jlbOutput;
		private JButton jbnButtons[];
		private JPanel jplMaster;
		private JPanel jplButtons;// container for Jbuttons
		
		 public void paintComponent(Graphics g) {
		        g.drawOval(10, 10, 10, 10);
		    }
		 
		
		Font f12 = new Font("Times New Roman", 0, 12);
		Font f121 = new Font("Times New Roman", 1, 12);
	
		class MyPanel extends JPanel {

			int x;
			int y;
		    public Dimension getPreferredSize() {
		        return new Dimension(250,200);
		    }

		    public void paintComponent(Graphics g) {
		        super.paintComponent(g);       
		        g.fillOval(x, y, 10, 10);
		    }  
		}
		

		MyPanel mainScreen = new MyPanel();
		
	public Game(){
		jmenuFile = new JMenu("File");
		jmenuFile.setFont(f121);
		jmenuFile.setMnemonic(KeyEvent.VK_F);
		
		jmenuitemExit = new JMenuItem("Exit");
		jmenuitemExit.setFont(f12);
		jmenuitemExit.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
		jmenuFile.add(jmenuitemExit);

		jmenuHelp = new JMenu("Help");
		jmenuHelp.setFont(f121);
		jmenuHelp.setMnemonic(KeyEvent.VK_H);

		jmenuitemAbout = new JMenuItem("About Game");
		jmenuitemAbout.setFont(f12);
		jmenuHelp.add(jmenuitemAbout);
	
		
		JMenuBar mb = new JMenuBar();
		mb.add(jmenuFile);
		mb.add(jmenuHelp);
		setJMenuBar(mb);
		
		setBackground(Color.gray);

		jplMaster = new JPanel();
	
		jbnButtons = new JButton[8];
		
		jplButtons = new JPanel();

		jbnButtons[0] = new JButton("Left");
		jbnButtons[1] = new JButton("Right");
		jbnButtons[2] = new JButton("Up");
		jbnButtons[3] = new JButton("Down");
		jbnButtons[4] = new JButton("Start");
		jbnButtons[5] = new JButton("Pause");
		jbnButtons[6] = new JButton("Space");
		jbnButtons[7] = new JButton("Menu");
	
		jplButtons.setLayout(new GridLayout(2, 4));

		for(int i=0; i<=jbnButtons.length -1; i++)		{
			jbnButtons[i].addActionListener(this);
			jplButtons.add(jbnButtons[i]);
		}
			
		
		jplMaster.setLayout(new BorderLayout());
		jplMaster.add(jplButtons, BorderLayout.SOUTH);
		jplMaster.add(mainScreen, BorderLayout.NORTH);

		// Add components to frame
		getContentPane().add(jplMaster, BorderLayout.SOUTH);
		getContentPane().requestFocus();

		
		jmenuitemAbout.addActionListener(this);
		jmenuitemExit.addActionListener(this);

		//add WindowListener for closing frame and ending program
		addWindowListener(new WindowAdapter() {

				public void windowClosed(WindowEvent e)
				{
					System.exit(0);
				}
			}
		);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String args[]) {
		Game calci = new Game();
		calci.setTitle("Java Game");
		calci.pack();
		calci.setSize(750,300);		
		calci.setLocation(400, 250);
		calci.setVisible(true);
		calci.setResizable(false);
	}
	
	public void keyPressed(KeyEvent e) {
	    if(e.getKeyCode() == KeyEvent.VK_F5)
	        System.out.println("F5 pressed");
	}

	public void keyReleased(KeyEvent e) {
	    // TODO Auto-generated method stub

	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jmenuitemAbout){
			JDialog dlgAbout = new JDialog(this, "This is a videogame created by Marc Laffan");
			dlgAbout.setSize(300, 300);
			dlgAbout.setLocation(this.getLocation());
			dlgAbout.setVisible(true);
		}else if(e.getSource() == jmenuitemExit){
			System.exit(0);
		}	
		else if (e.getSource() == jbnButtons[0]){
			mainScreen.x--;
			mainScreen.repaint();
		}
		else if (e.getSource() == jbnButtons[1]){
			mainScreen.x++;
			mainScreen.repaint();
		}
		else if (e.getSource() == jbnButtons[2]){
			mainScreen.y--;
			mainScreen.repaint();
		}
		else if (e.getSource() == jbnButtons[3]){
			mainScreen.y++;
			mainScreen.repaint();
		}
		else if (e.getSource() == jbnButtons[4]){
	
		}
		else if (e.getSource() == jbnButtons[5]){
	
		}
		else if (e.getSource() == jbnButtons[6]){
	
		}
		else if (e.getSource() == jbnButtons[7]){
	
		}
	}
}
