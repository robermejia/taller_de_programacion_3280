package Semana6;
import java.text.DecimalFormat;
import javax.swing.JTextArea;
public class Persona {
    private double talla;
    private double peso;
    public double imc(){
    double x=peso/(talla*talla);
    return x;
}
    
    public String mensaje(){
        String obs="";
        if(imc()<=16) obs="delgado";
        else if(imc()<=24) obs="Normal";
        else if(imc()<=30) obs="Sobrepeso";
        else obs="obeso";
        return obs;
    }
    //imprimiendo en un textarea at=representa un textarea
    public void print(JTextArea at){
    DecimalFormat sd=new DecimalFormat("##.##");
    at.setText("Talla  "+talla);
    at.append("\n Peso "+peso);
    at.append("\n Imc  "+sd.format(imc()));
    at.append("\n mensaje "+mensaje());
}

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
