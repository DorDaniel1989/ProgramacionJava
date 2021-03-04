package trabajos_entregar;

import javax.swing.JOptionPane;

public class cuadradoMagico {

	// Creamos el array correspondiente al numero indicado por el ususario
	public static void main(String[] arg) {

		int n; 
		
		do {
		   n= Integer.parseInt(JOptionPane.showInputDialog(null,
				"Introduzca el orden del cuadrado,\n este debe de ser un numero impar menor de 16 "));
		    if((n<=0) ||(n>15) || ((n % 2) == 0))
		    	JOptionPane.showMessageDialog(null, "Vuelva a intentarlo ");
		 
		}while((n<=0)||( n>15) || ((n % 2 ) == 0));
		
		int[][] cuadradoMagico = new int[n][n];
		// Buscamos el comienzo por donde queremos introducir los numeros
		int i = 0, j = (n - 1) / 2;
		int x = 1;

		cuadradoMagico[i][j] = x;
		// Gardamos las posiciones donde actualmente se encuentra el indice en el momento
		int FilaA=i;
		int ColumnaA=j;
		
		// Este bucle estara funcionando hasta que hayamos completado todos las posiciones de nuestro array 
		// con numeros consecutivos ascendentes 
		
		for(x=2; x <= n*n ; x++) {
			
			i--;
			j++;
			
			if(i < 0) //si nos salimos de la fila 
				i= n - 1;
		    if(j > n-1) //si nos salimos de la columna
		    	j= 0;
		    if(cuadradoMagico[i][j] == 0) // si la posicion esta libre
		    	cuadradoMagico[i][j] = x;
		    else {           //si la posicion esta ocupada entonces recuperamos la posicion de la fila y le sumamos uno
		    	             // para posicionarnos debajo del numero actual
		    	i=FilaA +1;
		    	j=ColumnaA;
		    	cuadradoMagico[i][j]= x;
		    }	
		    //Guardamos otra vez la posicion de partida del indice
		    
		    FilaA = i;
		    ColumnaA = j;
		    
		}
		int orden=0;
		j=0;
		for (i = 0; i < n; i++) {
			orden=orden+cuadradoMagico[i][j];
		}
		
			
	 //Mostramos el array
			
		
		for (i = 0; i < n; i++) {
			  for (j = 0; j < n; j++) {
				System.out.print("|" + cuadradoMagico[i][j] + "|");
					       }
						System.out.println("");
				       }
		JOptionPane.showMessageDialog(null,"El orden de tu cuadrado magico es : "+orden);
 }
}

		
