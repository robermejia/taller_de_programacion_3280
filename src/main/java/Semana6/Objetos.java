package Semana6;

public class Objetos {

    public static void main(String[] args) {
        // CASO 1
        // METODO
        // TODO code application logic here
        Triangulo t1 = new Triangulo();
        t1.setCa(15); t1.setCb(20);
        t1.print();
        //aumentar la altura en 20% y la base reducirlo en 15%
        //mostrar los nuevos calculos
        t1.setCa(1.2*t1.getCa());
        t1.setCb(0.85*t1.getCb());
        System.out.println("nuevos calculos");
        t1.print();
        
    }
    
}
