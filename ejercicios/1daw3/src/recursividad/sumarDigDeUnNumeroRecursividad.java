package recursividad;

public class sumarDigDeUnNumeroRecursividad {

	public static void main (String[]arg) {
		int numero=1234;
		int resul;
		
		resul=SumarDigitos(numero);
		System.out.println(resul);
	}	
		
	
	
    static int resultado;
	
	public static int SumarDigitos(int num) {
		
		if (num<10)
			return num;
		else
		 return resultado+(num%10)+SumarDigitos(num/10);
	}
	
	
	
	
	
	
}
