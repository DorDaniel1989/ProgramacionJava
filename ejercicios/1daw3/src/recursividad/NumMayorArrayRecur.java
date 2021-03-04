package recursividad;

public class NumMayorArrayRecur {
	
    public static void main(String[] args)
    {
        int[] array = {90,5,125,720,1,-50,8};
        System.out.println("Mayor: " + Mayor(array, 0, array[0]));
    }

    
    static int Mayor(int[] array, int n, int mayor)
    {
        if (n == array.length)
            return mayor;

        if (array[n] > mayor)
            mayor = array[n];

        return Mayor(array, ++n, mayor);
    }
		
	}


