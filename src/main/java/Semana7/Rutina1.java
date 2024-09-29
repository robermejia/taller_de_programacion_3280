
package Semana7;

public class Rutina1 {
    
    // MÉTODOS EN UNA CLASE, SI ESTA EN OTRO PACKAGE SE IMPORTA
    
    public void muestra(String mensaje){
        System.out.println(mensaje);
    }
    
    
    public int cdivisor(int num){//num = es una variable receptora
      int cn=0;
      for(int d=1; d<=num;d++){
          if(num%d==0)cn++;
      }
      return cn;
    }
    
    public String obser(int nota){
        String cad="";
        if(nota<6)cad="Deficiente";
        else if(nota<12) cad="Desaprobado";
        else if(nota<17) cad="Aprobado";
        else cad="Excelente";
        return cad;
    }
    
    public double imc(double peso,double alt){
        return peso/(alt*alt);
    }
    
    public int sumav(int vec[]){
        int sm=0;
        for(int f=0;f<vec.length;f++)
            sm=sm+vec[f];
        return sm;
    }
    
    public int maxv(int vec[]){
        int max=vec[0]; //primer valor
        for(int f=0; f<vec.length;f++){
          if(vec[f]>max)max=vec[f];
        }
        return max;
    }
    
    public int entero(String cad){
        return Integer.parseInt(cad);
    }
    
    public double real(String cad){
        return Double.parseDouble(cad);
    }
}

