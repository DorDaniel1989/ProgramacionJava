package claseFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class Ejercicio {

    public static void main(String[] args) {
        FileReader fr = null;
        String ruta = "C:/PruebasFile/prueba1.txt";
        int frases = 0, palabras = 0, fraseLarg = 0;

        try {
            fr = new FileReader(ruta);
            @SuppressWarnings("resource")
			BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();
            while(cadena != null) {
                for(int i = 0; i < cadena.length(); i++) {
                    if((cadena.charAt(i) == ' ' && cadena.charAt(i - 1) != ' ') 
                    	|| (cadena.charAt(i) == '.' && cadena.charAt(i - 1) != ' ' && i == (cadena.length() - 1))) {
                        palabras ++;
                    }
                    if(palabras >= 1 && cadena.charAt(i) == '.') {
                        frases ++;
                        if(palabras > fraseLarg) {
                            fraseLarg = palabras;
                        }
                        palabras = 0;
                    }
                }

                cadena = entrada.readLine();
            }
        }catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if(fr != null) {
                    fr.close();
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Nº de frases: " + frases +
                                                "\nLa frase con más palabras tiene: " + fraseLarg + " palabras");
        }
    }

}