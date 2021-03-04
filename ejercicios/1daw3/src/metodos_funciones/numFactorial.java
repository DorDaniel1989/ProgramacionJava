package metodos_funciones;
import javax.swing.JOptionPane;
public class numFactorial{

static int[] fact(int n) {
    int[] resultado = new int[100]; //creamos un array de 100 posiciones
    resultado[0] = 1;
    for (int i = 1; i <= n; ++i) {
        int llevada = 0;
        for (int j = 0; j < resultado.length; ++j) {
            int aux = resultado[j] * i + llevada;
            resultado[j] = aux % 10;
            llevada = aux / 10;
        }
    }
    return resultado;
}


public static void main (String[]arg) {
	int numero=0;
	
	//nos aseguramos que meta el rango de valores que queremos y capturamos excepciones 
	//como la de salir por la "x" del JOptionPanel o se mete un String
	do {
	try {
		numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un numero entre positivo hasta 50"));
		
	}catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Vuelve a intentarlo");
		
	}
	}while(numero>50 || numero<=0);
	
	int[] result = fact(numero);
	//guardamos la longitud del array
	int i = result.length - 1;
	//quitamos los primeros 0s del array
	while (i > 0 && result[i] == 0)
	    --i;
	//imprimimos al reves el resultado
	while (i >= 0)
	    System.out.print(result[i--]);
	System.out.println();
	
}
}
