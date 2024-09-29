package Semana6;

public class Empleado {

    private String nombre;
    private int horas;
    private int sec; //1=produccion(21.5) , 2=ventas(22.6) , 3=administracion(20.4)
    //metodos
    public double pago(){
      double vec[]={0,21.5,22.6,20.4};
      return horas*vec[sec];
     }
    public double afp(){
        return 0.11*pago();
    }

    public double total(){
        return pago()-afp();
    }
   //alt+insert

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

}
