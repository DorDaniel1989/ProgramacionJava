package metodos_funciones;


public class FuncionNumeroCombinatorio {
	
	public static int factorial (int arg1) {
		int resultado = 1;
		if(arg1 == 0) {
			resultado = 1;
		}else {
			for(int i = 1; i <= arg1; i++) {
				resultado = resultado * i;
			}
		}
		return resultado;
	}
	
	public static int ejercicio3(int n, int m) {
		int resultado = factorial(m)/(factorial(n) * factorial(m - n));
		return resultado;
	}
	
	public static void main(String[] args) {
		int numeroCombinatorio = ejercicio3(2,5);
		System.out.println("La posibilidades son: " + numeroCombinatorio);
	}
	
}
