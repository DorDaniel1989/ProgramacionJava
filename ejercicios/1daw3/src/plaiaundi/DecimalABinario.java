package plaiaundi;

public class DecimalABinario {

	static String resultado="";
	
	public static int de(int num) {
	 
		if(num==0)
			return 0;
		
		else
		 return (num % 2) + de(num / 2) * 10;
	}
	
	
	public static void main(String[]arg) {
		
		int entero= 4;
		
		int resul = de(entero);
		
		System.out.println(resul);
	}
	
}
