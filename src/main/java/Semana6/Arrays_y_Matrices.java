package Semana6;

import java.util.Arrays;

public class Arrays_y_Matrices {

    public static void main(String[] args) {
        // EJERCICIO 1 (VECTOR)
        /*
        int vec[]={14,10,40,12,8,24,30};
        int sm=0;
        for(int f=vec.length-1;f>=0; f--)
            System.out.print(vec[f]+",");
        System.out.println("");
        // for(int f=0;f<vec.length;f++)
        //sm+=vec[f];
        for(int x:vec)
           sm += x;
           
        System.out.println("la suma del vector "+sm);
        */
        
        //EJERCICIO 2 (VECTOR)
        /*
        int vec[]={14,11,41,12,8,23,30};
        int sm=0;
        for(int f=vec.length-1;f>=0; f--)
        System.out.print(vec[f]+",");
        System.out.println("");
       // for(int f=0;f<vec.length;f++)
        //sm+=vec[f];
        for(int x:vec)
           sm =sm+ x;
         int pro=sm/vec.length;  
        System.out.println("la suma del vector "+sm);
        System.out.println("promedio "+pro);
        System.out.println("solo los pares :");
        for(int z:vec){
            if(z%2==0)
                System.out.println(z);
        }
        System.out.println("mayores al promedio "+pro);
        for(int n=0;n<vec.length;n++){
            if(vec[n]>pro)
                System.out.println(vec[n]);
        }
        */
        
        // EJERCICIO 3 (MATRIX)
        /*
        int a[][]={{4,8,11},{20,10,15},{30,24,7},{18,6,2}};
        int b[][]= new int[4][3];
        System.out.println("Matriz de la tabla A");
        for(int f=0;f<a.length;f++){
        for(int c=0;c<a[0].length;c++){
            System.out.print(a[f][c]+"\t"); 
        }//fin for c
            System.out.println("");
        }//fin for f
        */
        
        
        // EJERCICO 4 (MATRIX)
        //llenar 25 datos con valores aleatorios de 10-100
        /*
        int vec[]=new int[25];
        for(int f=0;f<25;f++){
            vec[f]=(int)(Math.random()*91+10);
        }
        //int vec[]={14,11,41,12,8,23,30};
        int sm=0;
        for(int f=vec.length-1;f>=0; f--)
            System.out.print(vec[f]+",");
        System.out.println("");
       // for(int f=0;f<vec.length;f++)
        //sm+=vec[f];
        for(int x:vec)
           sm =sm+ x;
         int pro=sm/vec.length;  
        System.out.println("la suma del vector "+sm);
        System.out.println("promedio "+pro);
        System.out.println("solo los pares :");
        for(int z:vec){
            if(z%2==0)
                System.out.println(z);
        }
        System.out.println("mayores al promedio "+pro);
        for(int n=0;n<vec.length;n++){
            if(vec[n]>pro)
                System.out.println(vec[n]);
        }
        */
        
        // EJERCICIO 5 (METODOS)
        int a[][]={{4,8,11},{20,10,15},{0,24,7},{18,6,2}};
        int b[][]= new int[4][3];
        System.out.println("Matriz de la tabla A");
        for(int f=0;f<a.length;f++){
        for(int c=0;c<a[0].length;c++){
           System.out.print(a[f][c]+"\t"); 
        }//fin for c
           System.out.println("");
        }//fin for f
        //ordenando una matriz
        int vec[]=new int[12];
        int ind=0;
        for(int f=0;f<a.length;f++){
        for(int c=0;c<a[0].length;c++){
           vec[ind]=a[f][c];
            System.out.print(vec[ind]+",");
            ind++;
            }
        }
        //ordenar el vector
     
        Arrays.sort(vec);
        System.out.println("datos ordenados");
        for(int n=0;n<vec.length;n++){
            System.out.print(vec[n]+".");
        }
     
        //pasar los datos del vector a la matriz
        ind=0;
        for(int f=0;f<a.length;f++){
          for(int c=0;c<a[0].length;c++){
              a[f][c]=vec[ind];
              ind++;
             }
           }
       //datos ordenados
        System.out.println("Matriz de la tabla A");
          for(int f=0;f<a.length;f++){
          for(int c=0;c<a[0].length;c++){
              System.out.print(a[f][c]+"\t"); 
               }//fin for c
              System.out.println("");
           }//fin for f
    }
    
}
