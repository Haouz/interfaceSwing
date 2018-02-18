package interfaceSwing;

import javax.swing.JFrame;

public class Window extends JFrame{

  public Window(int width, int height){
	    this.setTitle("Ma première fenêtre Java");
	    this.setSize(width, height);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	  }
}
