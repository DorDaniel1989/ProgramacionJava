package recursividad;

public class NumerosEnOrdenCrecienteRecursivo {

	public static void main(String[]args) {
		
		String numeroO = "123456789";
        String numeroD = "1321457574";		
        boolean resul=false;
        
        resul=OrdenCreciente(numeroO);
        
        if(resul==false)
        System.out.println("No esta ordenado");
        else
        System.out.println("Esta ordenado");
        
        
        resul=OrdenCreciente(numeroD);
        
          if(resul==false)
            System.out.println("No esta ordenado");
            else
            System.out.println("Esta ordenado");
	
	}
	
	static boolean ordenado=false;
	public static boolean OrdenCreciente( String num) {
		
		if(num.length()==1) {
			ordenado=true;
            return ordenado;
            }	
		
		if(num.charAt(0)>num.charAt(1)) {
			ordenado=false;
		    return ordenado;
		    }
        else
        	 return OrdenCreciente(num.substring(1, num.length())) ;
	}
	
}
