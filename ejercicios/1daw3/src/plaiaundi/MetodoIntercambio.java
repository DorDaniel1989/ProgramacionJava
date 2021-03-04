package plaiaundi;


public class MetodoIntercambio {

	
	public static void main (String[]args) {
		
		int []num= {15, 32, 7, 23, 19, 4, 28, 1 , 18, 5};
		int i, j, aux;
		for(i=0; i<9;i++)
			for(j=i+1;j<10;j++)
				if (num[i] >num[j]) {
					aux=num[i];
					num[i]=num[j];
					num[j]=aux;
				}
	for(i=0 ;i<10;i++) {
		System.out.println("|"+num[i]);
	}
	System.out.println("|");
	}
	
	
}
