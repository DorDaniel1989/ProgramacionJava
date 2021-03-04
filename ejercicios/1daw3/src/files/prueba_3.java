package files;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import javax.swing.*;

public class prueba_3 {
    
	public static void main(String[]arg) {
		 FileReader fr =null;
         String ruta = "C:/prueba/prueba.txt";
		 
         try {
			fr=new FileReader(ruta);
			BufferedReader entrada =new BufferedReader (fr);
			String cadena = entrada.readLine();
			while(cadena !=null) {
				JOptionPane.showMessageDialog(null,cadena);
				cadena= entrada.readLine();
				
			}
			
			
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if (fr !=null)
					fr.close();
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
}
