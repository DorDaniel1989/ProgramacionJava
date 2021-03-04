package recursividad;


import javax.swing.JOptionPane;

public class PalindromoRecursividad {

	public static void main(String[] args) {
		
		String pal;
		
		pal = JOptionPane.showInputDialog(null, "Introduce una palabra:");
		
		if(palindroRecur(pal)) {
			JOptionPane.showMessageDialog(null, "La palabra " + pal + " es palíndroma");
		}else {
			JOptionPane.showMessageDialog(null, "La palabra " + pal + " no es palíndroma");
		}
		
	}
	
	public static boolean palindroRecur(String pal) {
		if(pal.length() <= 1) {
			return true;
		}else {
			if(pal.charAt(0) == pal.charAt(pal.length() - 1)) {
				if(pal.length() > 2) {
					return palindroRecur(pal.substring(1, 2));
					
					}else {
						return palindroRecur(pal.substring(1));
					}
			}else {
				return false;
			}
		}
	}
}
