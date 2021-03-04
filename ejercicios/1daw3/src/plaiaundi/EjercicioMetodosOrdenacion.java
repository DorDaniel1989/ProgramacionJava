
package plaiaundi;

public class EjercicioMetodosOrdenacion {

	public static void main(String[] args) {
		
		int[] array1 = {1,3,2,77,44,22,44,12,-6,7,-3, 88};
		int[] array2 = {15, 32, 7, 23, 19, 4, 28, 1, 18, 5};
		int i, j, aux;
		
		// 1. Mostrar <array1>
		printArray("El array 1 es:", array1);
		// 2. Mostrar <array2>
		printArray("El array 2 es:", array2);
		
		
		// 3. Mostrar <array1> ordenado de forma ascendente utilizando metodo de ordenacion por intercambio
		System.out.println("\nEl array 1 ordenado de forma ascendente es:");
		for(i=0;i<array1.length-1;i++) {
			for (j=i+1;j<array1.length;j++) {
				if (array1[j]<array1[i]){
					aux=array1[i];
					array1[i]=array1[j];
					array1[j]=aux;
				}
			}
		}
		for (i = 0; i < 10; i++) {
			System.out.print(array1[i]);
			if(i != array1.length - 1) {
				System.out.print("|");
			}
		}
		
		
		// 4. Mostrar <array2> ordenado de forma ascendente utilizando metodo de ordenacion por intercambio
		System.out.println("\nEl array 2 ordenado de forma ascendente es:");
		for(i=0;i<array2.length-1;i++) {
			for (j=i+1;j<array2.length;j++) {
				if (array2[j]<array2[i]){
					aux=array2[i];
					array2[i]=array2[j];
					array2[j]=aux;
				}
			}
		}
		for (i = 0; i < 10; i++) {
			System.out.print(array2[i]);
			if(i != array2.length - 1) {
				System.out.print("|");
			}
		}
		
		//TODO 5. Mostrar <array1> ordenado de forma descendente utilizando metodo de ordenacion por intercambio
		//TODO 6. Mostrar <array2> ordenado de forma descendente utilizando metodo de ordenacion por intercambio
		
		//TODO 7. Mostrar <array1> ordenado de forma ascendente utilizando metodo de ordenacion por seleccion
		//TODO 8. Mostrar <array2> ordenado de forma ascendente utilizando metodo de ordenacion por seleccion

		//TODO 9. Mostrar <array1> ordenado de forma descendente utilizando metodo de ordenacion por seleccion
		//TODO 10. Mostrar <array2> ordenado de forma descendente utilizando metodo de ordenacion por seleccion

		//TODO 11. Mostrar <array1> ordenado de forma ascendente utilizando metodo de ordenacion por burbuja
		//TODO 12. Mostrar <array2> ordenado de forma ascendente utilizando metodo de ordenacion por burbuja

		//TODO 13. Mostrar <array1> ordenado de forma descendente utilizando metodo de ordenacion por burbuja
		//TODO 14. Mostrar <array2> ordenado de forma descendente utilizando metodo de ordenacion por burbuja


	}
	
	public static void printArray(String msg, int[] ar) {
		System.out.println(msg);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]);
			if(i != ar.length - 1) {
				System.out.print("|");
			}
			if(i == ar.length - 1) {
				System.out.println();
			}
		}
	}
}
