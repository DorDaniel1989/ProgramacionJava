package trabajos_entregar;

import javax.swing.JOptionPane;

public class Examen2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//int[][] tabla= {{18,9,43},{9,20,12},{7,19,4},{6,3,9}};
		
		int i= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca las filas del array"));
		int j= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca las columnas del array"));
		int[][] tabla= new int[i][j];
		
		
		int numero=9;
		
		boolean [] resul;
		
		resul=estaNum(tabla,numero);
		
		
			
		}
		
	

	
	static boolean[] resultado;
	static int indice=0;
	public static boolean[] estaNum(int[][] tabla, int num) {
		
		for(int i=0; i<tabla.length;i++)
			for(int j=0; j<tabla[0].length;j++) {
				if( tabla[i][j]==num)
					resultado[i]=true;
				else	
					resultado[i]=false;
				indice++;
			}
		
		return resultado;
	}
	
	
}
