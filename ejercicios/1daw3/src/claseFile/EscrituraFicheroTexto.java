package claseFile;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.*;

public class EscrituraFicheroTexto {

	public static void main(String[]args) {
		
		String frase;
		PrintWriter salida =null;
		
		try {
			salida= new PrintWriter ("C:/PruebasFile/prueba.txt");
			frase=JOptionPane.showInputDialog("Introduce un texto");
			
			while (!frase.equalsIgnoreCase("FIN")) {
			salida.println(frase);
			frase=JOptionPane.showInputDialog("Introduce un texto");
	     	}
	   	salida.flush();
		
		
	}catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	}finally {
		salida.close();
	}
	
}
}