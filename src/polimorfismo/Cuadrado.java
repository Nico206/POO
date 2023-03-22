package polimorfismo;

import java.util.Scanner;

public class Cuadrado extends Figura {
    private Scanner lectura= new Scanner (System.in);     
    private float lado;

    public float getLado(){
        return lado;
    }

    public void setLado(float lado) {
        this.lado =lado;
    }


    @Override
    public void calcularArea(){
        System.out.println("Ingrese el valor del lado del cuadrado");
        lado=lectura.nextFloat();
        float area=lado*lado;
        System.out.println("El area del cuadrado de lado " + this.lado + " es " +area);

    }
    

   
}
