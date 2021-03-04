package swing;
import java.awt.Frame;

import javax.swing.*;
public class creandoMarcos {

	public static void main(String[]args) {
		
		
		miMarco marco1=new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
	}
}

class miMarco extends JFrame{
	
	public miMarco() {
		setSize(500,300);
		setLocation(700,400);
		//setBounds(x ,y, ancho, largo);
		
		
		
		
		setTitle("Mi primer marco swing");
		//setResizable(false);
		//Los dos de abajo son lo mismo
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		//setExtendedState(6);
	}
}