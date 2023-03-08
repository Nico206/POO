package intro;

import java.util.Scanner;

public class Animal {
   private Scanner lectura= new Scanner(System.in);
   
   
    //Atributos

    String nombre;
    int edad;


    // Metodos
    
    public void  registrarAnimal(){
        //Cuerpo del metodo

        System.out.println("Ingrese el nombre del animal");
        nombre=lectura.nextLine();

        System.out.println("Ingrese la edad del animal");
        edad= lectura.nextInt();

    }

    public void mostarAnimal(){
        //Cuerpo del metodo
        System.out.println("El nombre del animal es " + nombre + ", Y su edad es " + edad);


    }
}
