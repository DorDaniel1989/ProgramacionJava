package plaiaundi;


public class InvertirNumRec {

	
	static String invertido= "";
	
	public static String invertir(int num) {
		if(num < 10)
			return  invertido  + num;
		else
			return invertido + (num %10) + invertir(num/10);
					
		
	}
	
	
	
	
	
	
	
	public static void main(String[]arg) {
		 int invertido =Integer.parseInt(invertir(1234));
		
		System.out.println(invertido);
	}
}
