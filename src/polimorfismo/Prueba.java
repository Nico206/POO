package polimorfismo;

public class Prueba {
    public static void main(String[] args) {
        
        Cuadrado c1= new Cuadrado();
     
        c1.calcularArea();

        Triangulo t1= new Triangulo();
        t1.calcularArea();
        
        Rectangulo r1=new Rectangulo();
        r1.calcularArea();

        Circulo cir1=new Circulo();
        cir1.calcularArea();
    }
}
