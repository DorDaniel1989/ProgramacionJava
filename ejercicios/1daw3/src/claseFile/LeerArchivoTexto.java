package claseFile;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

public class LeerArchivoTexto {

	public static void main(String[]args) {
		
		FileReader fr=null;
		String ruta ="C:/PruebasFile/prueba.txt";
        
		try {
			fr =new FileReader(ruta);
			@SuppressWarnings("resource")
			BufferedReader entrada =new BufferedReader(fr);
			String cadena =entrada.readLine();
			while(cadena !=null) {
				JOptionPane.showMessageDialog(null,cadena);
				cadena =entrada.readLine();
			}
			
		}catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(fr !=null) {
					fr.close();
				}
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		
		
		
	}
	
}
