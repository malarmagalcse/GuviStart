import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.border.*;
import javax.swing.*;



	public class GameFrame extends JFrame {
	
	   private Movement movement1 = new Movement();
	   private Mouse mousemovement1 = new Mouse();
	
	public GameFrame() {
		
	super("Snake Game"); //Name of the JFrame

	
	
   //adding the key listener
	 this.addKeyListener(movement1);

			Image img = Toolkit.getDefaultToolkit().getImage("C:/Documents and Settings/Administrator/My Documents/My Pictures/snakelogo.GIF");
			  setIconImage(img);   //Image on top left corner
			  
	  
			  
			  
			  Dimension screenSize =			//Location of Frame on the Screen												
				  Toolkit.getDefaultToolkit().getScreenSize();
			   Dimension frameSize = getSize();
			   int x = (screenSize.width - frameSize.width) / 4;	
			   int y = (screenSize.height - frameSize.height) / 5;
			   setLocation(x, y);

			   JPanel jpanel_0 = new JPanel();
			   jpanel_0.setBackground(Color.cyan);
			   jpanel_0.add(new JLabel("Snake Game"));

			  
			   Container cp = getContentPane();
			   cp.add(jpanel_0,BorderLayout.CENTER);
			 

			   setSize(600, 450);
			   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
			   
			   
			 setVisible(true); //visibility of JFrame
			  
	}
	
			  public static void main(String[] args) {
				  new GameFrame();
				  
				  
				
				  Snake snake1 = new Snake();
				  
				  
				  
				  
				  
		 
		   }
			  
		}
