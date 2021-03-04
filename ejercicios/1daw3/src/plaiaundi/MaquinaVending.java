package plaiaundi;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;
public class MaquinaVending {
	
	public static void main(String[]args) {
		 DecimalFormat df2 =new DecimalFormat("#.##");
		
		//Contenido de maquina
		
		String [][]productos = { {"10-KitKat "      , "11-Chicles de fresa "  ,"12-Lacasitos " , "13-Palotes "         },
		                         {"20-Kinder Bueno ", "21-Bolsa Haribo "      ,"22-Cheetos "   , "23-Twix "            },
		                         {"30-Maiz "        , "31-M&M'S "             ,"32-Papa Delta ", "33-Chicles de menta "},
		                         {"40-Gusanitos "   , "41-Crunch "            ,"42-Milkybar "  , "43-Patatas fritas "  }};
				
		
		//Precio del contenido, la posicion del precio corresponde a la posicion de la golosina.
		
		double precios [][]= {{1.1,  0.8, 1.5, 0.9},
				              {1.8,  1  , 1.2, 1  },
				              {0.7,  1.3, 1.2, 0.8},
				              {1.5,  1.1, 1.1, 1.1}};
			
		
		//Guardaremos las cantidades de golosinas en este array la posicion corresponde a la posicion de la golosina.
		
		int[][] cantidades = {{5 , 5, 5, 5},
	                          {5 , 5, 5, 5},                                                                                                                                                                                                                                                                                                                                                  
	                          {5 , 5, 5, 5},
	                          {5 , 5, 5, 5}};
		  
		
		//RELACION DE INDICES Y MONEDAS
		//indice 0 : moneda de 1 €
		//indice 1 : moneda de 0.50 €
		//indice 2 : moneda de 0.20 €
		//indice 3 : moneda de 0.10 €
		
		int[] canalMoneda = {10, 10, 10, 10};
		double[] valoresMoneda= {1, 0.5, 0.2, 0.1};
		//Cuando no entran en los canales se mete a la cajaExcedente, incluir en la caja del dia
		
		
		//Utilizado para controlar la caja total del dia
		double cajaTotal=0;
        
		int selMenu=0;
		
		do {
			
		
		selMenu=Integer.parseInt(JOptionPane.showInputDialog(null, "MENU: \n 1-Pedir Golosina \n 2-Mostrar Golosina \n 3-Rellenar Golosinas \n 4-Apagar Maquina "));
		
		//**********************************************OPCION MENU 1****************************************************
		if(selMenu==1) {
			//Vamos a pedir al usuario que introduzca la posicion de la golosina que quiere,
		
		  int selectGol;
		  int fila, col;
		
		  do {
			  
		     selectGol= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la posicion de la Golosina : \n "+imprimirMatrizString(productos))); 
		    // comprobarPosicion(cantidades, selectGol);
		    
		    if(selectGol !=10 && selectGol !=11 && selectGol !=12 && selectGol !=13 && selectGol !=20 && selectGol !=21 && selectGol !=22 && selectGol !=23 &&selectGol !=30 && selectGol !=31 && selectGol !=32 && selectGol !=33 &&selectGol !=40 && selectGol !=41 && selectGol !=42 && selectGol !=43)
		        JOptionPane.showMessageDialog(null,"Posicion incorrecta, vualva a intentarlo ");
		 }while(selectGol !=10 && selectGol !=11 && selectGol !=12 && selectGol !=13 && selectGol !=20 && selectGol !=21 && selectGol !=22 && selectGol !=23 &&selectGol !=30 && selectGol !=31 && selectGol !=32 && selectGol !=33 &&selectGol !=40 && selectGol !=41 && selectGol !=42 && selectGol !=43);
		  
		   
		  //Descomponemos el numero introducido y asignamos la fila y la columna (candidata a clase)
		   col=selectGol % 10;
		   selectGol=selectGol / 10;
		   fila = selectGol-1;
		   
		    if(cantidades[fila][col]==0)
		    	JOptionPane.showMessageDialog(null,"Producto  :"+ productos[fila][col]+"agotado ");
		    else {
		      // JOptionPane.showMessageDialog(null,"El producto elegido es :"+" "+ productos[fila][col]);
		
		 boolean pagado = false;
		 double monedaTotal=0;
		 double cambios=0;
			
		   JOptionPane.showMessageDialog(null,"Por favor, introduzca "+precios[fila][col]+"€");
		 //Array donde guardaremos las monedas que va introduciendo el usuario
		 double[] monedasIntro = new double[5];
		
		  for(int i=0;( i<monedasIntro.length) && pagado == false  ; i++ ){
			do {
				
		        monedasIntro[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduzca una moneda"));
		         
		        if(monedasIntro[i] != 0.1 && monedasIntro[i]!=0.2 && monedasIntro[i]!=0.5 && monedasIntro[i]!=1 && monedasIntro[i]!=2) {
		           JOptionPane.showMessageDialog(null, "Moneda Falsa detectada ");
		            monedasIntro[i]=0; }
		            monedaTotal=Double.parseDouble(df2.format(monedaTotal+monedasIntro[i]).replace(',', '.'));  
		        
		      
			}while(monedasIntro[i] != 0.1 && monedasIntro[i]!=0.2 && monedasIntro[i]!=0.5 && monedasIntro[i]!=1 && monedasIntro[i]!=2);
		  
			if (monedaTotal >= precios[fila][col] ) {
				pagado=true;
				cantidades[fila][col]=cantidades[fila][col] - 1;
				cajaTotal= cajaTotal+precios[fila][col];
			}
			}
			//Devolucion de cambios
			
			cambios= monedaTotal-precios[fila][col];
			cambios=Double.parseDouble(df2.format(cambios).replace(',', '.'));
			double cambiosTemp = cambios;
			int[] cantMonedas= {0,0,0,0};
			  if(cambiosTemp > 0) {
				  for(int i=0; i<valoresMoneda.length;i++) {
					 int auxCant = (int) (cambiosTemp / valoresMoneda[i]);
					  if(canalMoneda[i]<auxCant) {
						  auxCant = canalMoneda[i];
						 
					  } 
					  canalMoneda[i] = canalMoneda[i] - auxCant;
					  cantMonedas[i] =  cantMonedas[i] +  auxCant;
					  cambiosTemp= cambiosTemp- (auxCant*valoresMoneda[i]);
					 
				  }
				 for(int i =0 ; i< cantMonedas.length; i++)	  
				 System.out.println("Su cambio es  "+cantMonedas[i] +" moneda de  "+valoresMoneda[i]); 
			  }
			
		   //Importe insuficiente tras 5 monedas, devolucion de monedas
		  
			 
			  
			  if(pagado==false)
		  
				  JOptionPane.showMessageDialog(null,"Importe insuficiente, recoja sus monedas\n" + imprimirVectorString(monedasIntro));
			  
		      if(pagado==true)
		 JOptionPane.showMessageDialog(null,"Importe introducido : " + monedaTotal + "€ \nPorfavor, recoja sus cambios :" + cambios + "€ \ny no se olvide de recoger su producto :" + productos[fila][col]);
		 }
		
	  }	
		
		
	    //***************************************OPCION MENU DOS******************************************************
		String pass="1DAW3";
		String passIntro="";
		if(selMenu==2) {
			
			passIntro=JOptionPane.showInputDialog(null,"Introduzca la contraseña"); 
			
			if (pass.equals(passIntro)) {
					
				JOptionPane.showMessageDialog(null,imprimirMatrizString1(cantidades));
			}
			else
			JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
			}
		
			
		//****************************************OPCION MENU 3******************************************************
		String pass1="MaquinaPlaiaundi";
		String passIntro1="";
		int selectGol1;
		int col1, fila1;
		int relleno;
		if(selMenu==3) {
			
			passIntro1=JOptionPane.showInputDialog(null,"Introduzca la contraseña"); 
			if (pass1.equals(passIntro1)) {
				
				
				   selectGol1= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la posicion de la Golosina que quiere rellenar : \n"+imprimirMatrizString(productos))); 
				   col1=selectGol1 % 10;
				   selectGol1=selectGol1 / 10;
				   fila1 = selectGol1-1;
				   
				   relleno = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la cantidad de golosinas a rellenar : ")); 
				   cantidades[fila1][col1] = cantidades[fila1][col1]+relleno;
				   JOptionPane.showMessageDialog(null,"NUEVAS   \n"+imprimirMatrizString1(cantidades));
			}
			else
				JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
			
		}
		
		}while(selMenu != 4); //LA MAQUINA SE APAGA SI PULSAMOS 4 EN EL MENU
		
		JOptionPane.showMessageDialog(null,"La venta del dia ha sido de : " + cajaTotal+"€");
	}	
	
	
	
	
	
	//FUNCION PARA IMPRIMIR VECTOR DE LAS MONEDAS INTRODUCIDAS
	public static String imprimirVectorString(double[] monedasIntro) {
		String res ="";
		for(int i =0; i<monedasIntro.length; i++){
			 {
				res +="["+monedasIntro[i]+"]";
			}
			
		}
		return res;
		
	}
	//FUNCION PARA IMPRIMIR ARRAY DE PRODUCTOS
	public static String imprimirMatrizString(String[][] array) {
		String res ="";
		for(int i =0; i<array.length; i++){
			for(int j=0; j<array[0].length; j++) {
				res +=array[i][j];
			}
			res +="\n";
		}
		return res;
		
	}
	//FUNCION PARA IMPRIMIR  EL ARRAY DE CANTIDADES DE PRODUCTOS
	public static String imprimirMatrizString1(int[][] array) {
		String res ="CANTIDADES :";
		       res +="\n";
		for(int i =0; i<array.length; i++){
			for(int j=0; j<array[0].length; j++) {
				res +="["+array[i][j]+"]";
			}
			res +="\n";
		}
		return res;
		
		
	}
	
	
}
