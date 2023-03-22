package polimorfismo;

import java.util.Scanner;
public class Circulo  extends Figura{
    private Scanner lectura= new Scanner(System.in);
    
    private float radio;

    public float getRadio(){
        return radio;
    }

    public void setRadio(float radio){
        this.radio=radio;
    }
   
    @Override
    public void calcularArea() {
        System.out.println("Ingrese el radio del circulo");
        radio=lectura.nextFloat();
        double area= 3.1416*(radio*radio);
        System.out.println("El radio es " +this.radio+ " y el area es " + area);

    }
    
}
