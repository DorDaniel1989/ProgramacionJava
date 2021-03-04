package swing;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.*;


public class creandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marcoCentrado marco= new marcoCentrado();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	}

	  class marcoCentrado extends JFrame{
		
		public marcoCentrado() {

			Toolkit mipantalla=Toolkit.getDefaultToolkit();
			
			Dimension tamanoPantalla=mipantalla.getScreenSize();
			
			int alturaPantalla=tamanoPantalla.height;
			int anchoPantalla=tamanoPantalla.width;
			setSize(anchoPantalla/2, alturaPantalla/2);
			setLocation(anchoPantalla/4, alturaPantalla/4);
			setTitle("Marco con texto");
			Lamina milamina=new Lamina();
	     	add(milamina);
		
			
		}
	}	
		
	  class Lamina extends JPanel{
		  
		  public void paintComponent(Graphics g) {
			  
			  super.paintComponent(g);
			  g.drawString("Estamos aprendiendo Swing", 300, 200);
			//  g.drawRect(290, 180, 200, 25);
			  g.drawArc(50, 100, 100, 200, 120, 150);
		  }
		  
	  }
	

