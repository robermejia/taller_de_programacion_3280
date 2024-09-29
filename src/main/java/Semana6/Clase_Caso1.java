package Semana6;

public class Clase_Caso1 {
    // USANDO GET Y SET
    public class Triangulo {
        private double ca;
        private double cb;
        //metodos
        public double hipo(){
           double hp=Math.sqrt(ca*ca+cb*cb);
           return hp;
        }
        public double area(){
            return (ca*cb)/2;
        }
        public void print(){
            System.out.println("la hipotenusa:"+hipo());
            System.out.println("el area :"+area());
        }

       //alt+insert

        public double getCa() {
            return ca;
        }

        public void setCa(double ca) {
            this.ca = ca;
        }

        public double getCb() {
            return cb;
        }

        public void setCb(double cb) {
            this.cb = cb;
        }
    }
}