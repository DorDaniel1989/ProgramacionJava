package claseFile;

import java.io.PrintWriter;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class SobreEscrituraFicheroTexto {

	public static void main(String[]args) {
		
	
	
	String frase;
	String ruta= "C:/PruebasFile/prueba.txt";
	
	
	try {
		FileWriter fw= new FileWriter(ruta,true);
		@SuppressWarnings("resource")
		PrintWriter salida=new PrintWriter (fw);
		frase =JOptionPane.showInputDialog("Introduce un texto");
		while(!frase.equalsIgnoreCase("FIN")) {
			salida.println(frase);
			frase=JOptionPane.showInputDialog("Introduce un texto");
		}
		salida.flush();
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}
	
	}
}