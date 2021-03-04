package metodos_funciones;

public class StringMetodos {

	public static void main(String[]arg) {
		
		
		//length()
		//concat(String s)
		//compareTo(String s)
		//equals(String s)
		//equalsIgnoreCase(String s)
		//trim()
		//toLowerCase()
		//toUpperCase()
		//replace(char c, char newc)
		//replaceAll(String s, String reemplazo)
		//substring(int i, int f)
		//charAt(int i)
		//indexOff(char c)
		//valueOf(int i)
		
		
		String frase="Hola caracola como te va, hola";
		String frase_mod=frase.toLowerCase().replaceAll("o", "*");
		 frase_mod=frase_mod.replaceAll("a", "*");
		 frase_mod=frase_mod.replaceAll("l", "*");
		System.out.println(frase_mod);
				
		
	}
	
}
