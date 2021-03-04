package plaiaundi;

public class ArrayEnArray {

    public static void main (String[]arg){

    int [][] array = {{ 5, 3, 2, 1, 8, 4},
                      { 9, 2, 8, 6, 5, 0},
                      { 3, 9, 1, 3, 0, 6},
                      { 4, 5, 2, 9, 9, 9},
                      { 2, 9, 4, 4, 3, 6},
                      { 7, 3, 9, 2, 8, 9},};  

    int [][] arrayP = {{8, 6, 5},
                       {1, 3, 5},
                       {2, 9, 9},};

    boolean correcto = false ;

     for ( int i =0; i < 6 ; i++ ){
        for ( int j =0; j < 6 ; j++ ){
               if(array[i][j]==arrayP[i][j])
               if(array[i][j+1]==arrayP[i][j+1])
               if(array[i][j+2]==arrayP[i][j+2])
               if(array[i+1][j]==arrayP[i+1][j])
               if(array[i+1][j+1]==arrayP[i+1][j+1])
               if(array[i+1][j+2]==arrayP[i+1][j+2])
               if(array[i+2][j]==arrayP[i+2][j])
               if(array[i+2][j+1]==arrayP[i+2][j+1])
               if(array[i+2][j+2]==arrayP[i+2][j+2]){
               correcto=true;
                    
               }
                
             else{
                 System.out.println("No se encuentra");
             }    
             
            if(correcto==true)
            System.out.println("se encuentra ");

               
                
        }
       }
    }}