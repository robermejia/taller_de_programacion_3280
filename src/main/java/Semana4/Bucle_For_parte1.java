package Semana4;

public class Bucle_For_parte1 {

    public static void main(String[] args) {
        // EJERCICIO 1
    /*
    Scanner t=new Scanner(System.in);
    String res;
    int num,op,d,c;
    do{
        System.out.println("ingrse un numero :"); 
        num=t.nextInt();
        System.out.println("1.- obtener si es primo");
        System.out.println("2.- su factorial");
        System.out.print("opcion:");
        op=t.nextInt();
        if(op==1){
             d=0;
             c=1;
             do{
               if(num%c==0)d++;
               c++;
           } while(c<=num);
          if(d==2)System.out.println("numero es primo");  
        }else{
            c=1; //numero que aumenta
            d=1;//factorial
            do{
               d=d*c; 
               c++;
            }while(c<=num);
            System.out.println("factorial es "+d); 
        }//fin del e;se
        do{
        System.out.print("continua si o no:");
        res=t.next().toLowerCase();
            }while(!res.equals("si")&& !res.equals("no"));
        }while(res.equals("si"));
    */
    // EJERCICIO 2
    /*
    Scanner t=new Scanner(System.in);
    String res;
    int num,op,d,c;
    do{
        System.out.println("ingrse un numero :"); 
        num=t.nextInt();
        System.out.println("1.- obtener si es primo");
        System.out.println("2.- su factorial");
        System.out.print("opcion:");
        op=t.nextInt();
        if(op==1){
             d=0;
             c=1;
             do{
               if(num%c==0)d++;
               c++;
           } while(c<=num);
          if(d==2)System.out.println("numero es primo");  
        }else{
            c=1; //numero que aumenta
            d=1;//factorial
            do{
               d=d*c; 
               c++;
            }while(c<=num);
            System.out.println("factorial es "+d); 
        }//fin del e;se
        do{
        System.out.print("continua si o no:");
        res=t.next().toLowerCase();
        }while(!res.equals("si")&& !res.equals("no"));
        }while(res.equals("si"));
    */
    
    //EJERCICIO 3
    /*
    double num;
      int  nota;
      int rango;
      num=Math.random();
        System.out.println("valor "+num);
        nota=(int)(Math.random()*21);
        System.out.println("valor  nota "+nota);
        rango=(int)(Math.random()*81+10); //en un rango de 10=90
        System.out.println("rango de 10-90:"+rango);
        // Math.random()*(final-inicio+1)+inicio
    */
    
    // EJERCICIO 4
    System.out.println("Pc1   pc2   Promedio");
        int nota1,nota2;
        double prom;
        int cap=0, cds=0;
        for(int n=1;n<=25;n++){
            nota1=(int)(Math.random()*21);
            nota2=(int)(Math.random()*21);
            prom=(nota1+nota2)/2.0;
            System.out.printf("%4d  %5d  %5d %5.1f\n",n,nota1,
                    nota2,prom);
            if(prom>=11.5)cap++; else cds++;
         }
        System.out.println("nro aprobados "+cap);
        System.out.println("nro desaprobados "+cds);
    }
    
}
