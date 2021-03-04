package plaiaundi;


public class matrizTraspuesta {
	
	public static void main(String[]arg) {
		//AHORRAMOS TIEMPO DE PROGRAMA METIENDO AQUI LOS VALORES EN VEZ DE PEDIRSELOS AL USUARIO
	int [][] matrizIntro = 
		         { {1,  2,  3,  4,  5},
		           {6,  7,  8,  9,  10},
	               {11, 12, 13, 14, 15},
	               {16, 17, 18, 19, 20},
	               {21, 22, 23, 24, 25},
	               {26, 27, 28, 29, 30},
	               {31, 32, 33, 34, 35},
	               {36, 37, 38, 39, 40},
	               {41, 42, 43, 44, 45},
	               {46, 47, 48, 49, 50}};
	 
	int [][] matrizTras = new int [5][10];    
	int x=0, k=0;
	
	//PASAMOS LOS VALORES DE LA MATRIZ INTRODUCIDA A LA TRASPUESTA
	 for(int j=0;  j<5; j++) {
		 x= 0;
		 for(int i=0; i<10;  i++) {
			 if(x<10) {
			 matrizTras[k][x]= matrizIntro[i][j];
			 System.out.println( matrizTras[k][x]);
			 x++;} 
				 
			
		 }
		
		     k++;
 	 }   
	 //IMPRIMIMOS LA MATRIZ ORIGINAL
	for (int i=0; i<10; i++) {
		for( int j=0; j<5 ; j++) {
			
			System.out.print("[" + matrizIntro[i][j]+"]");
		}
		System.out.println();
		
	}
	
	//IMPRIMIMOS LA MATRIZ TRASPUESTA
	for (int i=0; i<5; i++) {
		for( int j=0; j<10 ; j++) {
			
			System.out.print("[" + matrizTras[i][j]+"]");
		}
		System.out.println();
		
	}
	
	}} 
	                

	