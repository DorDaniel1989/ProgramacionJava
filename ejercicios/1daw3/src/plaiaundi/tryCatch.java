package plaiaundi;
import javax.swing.JOptionPane;
public class tryCatch {

	public static void main(String[]arg) {
		
		
		
		int []array= {1,2,3,4,5};
		try {
			int posicion=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la posicion"));
			System.out.println(array[posicion]);
		}catch(RuntimeException e) {
			JOptionPane.showInternalMessageDialog(null,"La has liado");
			System.out.println("ERROR-->"+e.getMessage());
		 // e.printStackTrace();
		}	
		
		
		
		 Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la posicion"));
		
		
		JOptionPane.showInternalMessageDialog(null,"A otra cosa mariposa");
		
			
			
		
			
			
			
		
		
		
		
	}
	
}
