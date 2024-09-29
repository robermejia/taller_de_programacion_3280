package Semana7;

public class prueba1 {

    public static void main(String[] args) {
        // mostrar todos los primos de 2 cifras
        Rutina1 x=new Rutina1();
        System.out.println("#s primos de 2 digitos");
        for(int n=10; n<=99;n++){
            if(x.cdivisor(n)==2)
                System.out.print(n+",");
        }
    }
    
    

}
