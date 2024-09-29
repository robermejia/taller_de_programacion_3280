package Semana1;

public class tipo_de_datos {

    public static void main(String[] args) {
    // ==================================================================================================
    // TIPOS DE DATOS
    // byte     Tipo de dato entero de 8 bits                                   -128 hasta 127
    // short    Tipo de dato entero de 16 bits(entero corto)                    -32,768 hasta 32,767
    // int      Tipo de dato entero de 32 bits                                  -231 hasta 231-1
    // long     Tipo de dato entero de 64 bits (entero largo)                   -263 hasta 263-1
    // float    Tipo de dato real de 32 bit(punto flotante de simple precisión) -263 hasta 263-1
    // double   Tipo de dato real de 64 bits(punto flotante de doble precisión) -2511 hasta 2511-1
    // char     Tipo de dato caracter de 16 bits                                -0 hasta 65535 (Unicode)
    // boolean  Tipo de dato lógico de 1 bit                                    -true, false
        
        // EJEMPLO 1 
        /*
        double rad, peri, are;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese radio:");
        rad = sc.nextDouble();
        //proceso
        are = rad * rad * 3.1416;
        peri = 2 * rad * 3.1416;
        //salida
        System.out.println("el area :"+are);
        System.out.println("longitud es :"+peri);
        */
        
        // EJEMPLO 2 
        /*
        double base,alt,hp;
        Scanner sc=new Scanner(System.in);
        System.out.print("base :");
        base=sc.nextDouble();
        System.out.print("altura:");
        alt=sc.nextDouble();
        hp=Math.sqrt(alt*alt+base*base);
        System.out.println("la hipotenusa es :"+hp);
        */
        
        // EJEMPLO 3
        /*
        double a,b,c,s,area;
        Scanner sc=new Scanner(System.in);
        System.out.print("lado 1:");
        a=sc.nextDouble(); 
        System.out.print("lado 2:");
        b=sc.nextDouble();  
        System.out.print("lado 3:");
        c=sc.nextDouble(); 
        
        s=(a+b+c)/2.0;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("El área del triángulo es: " + area);
        */
    }
    
}
