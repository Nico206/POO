package polimorfismo;

import java.util.Scanner;
public class Rectangulo extends Figura {
    private Scanner lectura= new Scanner(System.in);
    private float largo, ancho;

    public float getLargo(){
        return largo;
    }
    public float getAncho(){
        return ancho;
    }
    public void setLargo(float largo){
        this.largo =largo;
    }

    public void setAncho(float ancho){
        this.ancho=ancho;
    }

    @Override
    public void calcularArea(){
        System.out.println("Ingresa el largo del rectangulo");
        largo=lectura.nextFloat();
        
        System.out.println("Ingrese el ancho del rectangulo");
        ancho=lectura.nextFloat();

        float area= largo*ancho;
        System.out.println("El largo del rectangulo es "+this.largo+" La anchura es " + this.ancho+ " el area es " + area);
    }
}
