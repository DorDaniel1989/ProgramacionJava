package recursividad;


public class PalabraInvertRecur {

	static String resultado="";
	public static String invertirPalRecur(String palabra) {
		
		if (palabra == "" )
		   return "";
		if(palabra.length()==1)
	       return resultado + palabra.charAt(0);
		else
		   return resultado + palabra.charAt(palabra.length()-1) + invertirPalRecur(palabra.substring(0 , palabra.length()-1));
	}
	
	
	
	
	public static void main (String[]arg) {
		
		String resul="";
		String palabra="Hola";
		
		resul=invertirPalRecur(palabra);
		
		System.out.println(resul);
		
	}
	
}
