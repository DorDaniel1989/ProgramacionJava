package metodos_funciones;
import java.text.Normalizer;
import javax.swing.JOptionPane;

public class RecursosVistos {
	
	public static void main(String[] args) {

		int[] lista={1,9,65,4,28,7,33,23,10,4,11,26,42,93,44};
		System.out.println(media(lista));
		
		//----------------------------------------------------------------------------------------------
		String salir;
		do {
			
			salir=JOptionPane.showInputDialog("¿Quieres volver a hacer otra operación? \nSi | No");
		}while(salir.equalsIgnoreCase("si") || salir.equalsIgnoreCase("s"));
		
		
		//----------------------------------------------------------------------------------------------
		
		
		try {
			
		}catch(RuntimeException e) {
			System.out.println("Se ha producido un error en tiempo de ejecucion");
			e.printStackTrace();
		}
		//----------------------------------------------------------------------------------------------
		
		
		
		
		
		//PARA QUITAR LOS ACENTOS DE UN STRING (Cuidado!, quita tambien la virgulilla de la ñ)
		//------------------------------------------------
		String frase="Los Gómez y las cigúeñas son aves";
		String cadenaNormalize = Normalizer.normalize(frase, Normalizer.Form.NFD);   
		String sinAcentos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
		System.out.println(sinAcentos);
		//------------------------------------------------

		
	
		
	}//--->FIN DEL MAIN

	
	
	
	//CALCULO RECURSIVO POTENCIA
	//---------------------------------------------------
	public static int getPotencia(int b, int e) {
		if(e>0) {
			return b * getPotencia(b, e-1);
		}else return 1;
	}
	//---------------------------------------------------

	
	

	//OBTENER LA LONGITUD DE UNA CIFRA
	//---------------------------------------
	int b=Integer.toString(165467).length();
	//---------------------------------------
	
	
	
	
	//FUNCIÓN PARA CALCULAR LA MEDIA DE LOS VALORES DE UN ARRAY
	//------------------------------------------------
	static double mcount=0;
	public static double media(int[] valores) {
        // Completa lo que se te pide en el enunciado 
        for(int i=1;i<valores.length;i++){
            mcount=mcount+valores[i];
        }
        mcount=mcount/valores.length;
        return mcount;
    }
	//------------------------------------------------
}
