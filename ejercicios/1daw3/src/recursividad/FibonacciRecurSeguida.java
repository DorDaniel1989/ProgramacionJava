package recursividad;

public class FibonacciRecurSeguida {


	public static void main(String[] args) {
		
		int num=5;
      
		for(int i=0; i<num;i++) {
			System.out.print(getFibonacci(i)+"-");
		}
	}
	
	public static int getFibonacci(int n) {
		if(n>1) {
			int result = getFibonacci(n-1)+getFibonacci(n-2);
			return result;
		}else if(n==1) {
			return 1;
		}else return 0;
	}
}
