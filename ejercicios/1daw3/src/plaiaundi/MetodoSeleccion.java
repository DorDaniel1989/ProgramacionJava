package plaiaundi;


public class MetodoSeleccion {



	
	public static void main (String[]args) {
		
		int []num= {15, 32, 7, 23, 19, 4, 28, 1 , 18, 5};
		int i, j, menor, pos, aux;
		
		for(i=0 ; i < 9; i++) {
			menor = num[i];
		      pos=i;
				for(j=i+1;j < 10;j++) {
					if(num[j] < menor) {
						menor=num[j];
						pos=j;
					}
				}
				aux=num[i];
				num[i]=menor;
				num[pos]=aux;
	 }
				for(i=0 ;i<10;i++) {
		System.out.println("|"+num[i]);
	}
	System.out.println("|");
	}
	
	
}


