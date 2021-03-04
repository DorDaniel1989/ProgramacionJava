package metodos_de_ordenacion;

public class MetodoBurbuja {
	
	
	public static void main (String[]args) {
		
		int [] array= {4,2,3,4,5,12,4,12,1,4,5,6};
		 burbuja(array);
		
		  
		 //imprimir normal
		 for(int i=0 ; i<=array.length-1 ;i++)	 
			 System.out.print(array[i]+"-");
		 
		 System.out.println();
		 //imprimir a la inversa
		 for(int i=array.length-1 ; i>=0 ;i--)	 
		 System.out.print(array[i]+"-");
		 
		 
	}
	
	
	 public static int[] burbuja(int[] arreglo)
	    {
	      int auxiliar;
	      int[] arregloOrdenado;
	      for(int i = 1; i < arreglo.length; i++)
	      {
	        for(int j = 0;j < arreglo.length-i;j++)
	        {
	          if(arreglo[j] > arreglo[j+1])
	          {
	            auxiliar = arreglo[j];
	            arreglo[j] = arreglo[j+1];
	            arreglo[j+1] = auxiliar;
	          }   
	        }
	      }
	      arregloOrdenado = arreglo;
	      return arregloOrdenado;
	    }
	
	}

