package claseFile;

public class formateandoConPrintf {

	public static void main(String[]args) {
		
		
		System.out.printf("%-25s %-30s  /%4.2f€\n","Hola que tal","Muy bien y tu?" , 25.00);
		System.out.printf("%-25s %-30s  /%4.2f€\n","Hola que t ","Muy bien tu?" , 25.45);
		System.out.printf("%-25s %-30s  +%2.2f€\n","Hola que","Muy bien y?" , 25.34);
		System.out.printf("%-25s %-30s  +%4.2f€\n","Hola qu","Muy y ?" , 25.21);
		
		
		
		int redondeoAleatorio=(int) Math.floor( Math.random()*10);
		
		System.out.println(redondeoAleatorio);
		
		
		
	}
	
	
	
}
