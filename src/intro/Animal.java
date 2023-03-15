package intro;

import java.util.Scanner;

public class Animal {
   private Scanner lectura= new Scanner(System.in);
   
   
    //Atributos

    String nombre;
    int edad;

    
    // Metodos
 //METODO CONSTRUCTOR VACIO
    public Animal(){

    }
//METODO CONSTRUCTOR LLENO O CON ARGUMENTOS
    public Animal(String _nombre,int _edad){
        nombre=_nombre;
        edad= _edad;

    }
    

    
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
