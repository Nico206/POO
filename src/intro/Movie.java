package intro;

import java.util.Scanner;

public class Movie {
    Scanner lectura= new Scanner(System.in);
    // crear Atributos

    private String name;
    private  double duration;
    String category;
    public String director;

    // Los metodos
      
    public void addMovie(){
        System.out.println("Ingrese el nombre de la pelicula");
        name=lectura.nextLine();

        System.out.println("Ingrese la duracion de la pelicula");
        duration= lectura.nextDouble();
        lectura.nextLine();

        System.out.println("Ingrese la categoria de la pelicula");
        category= lectura.nextLine();

        System.out.println("Ingrese el director de la pelicula");
        director=lectura.nextLine();


    }    

    public void changeMovie(String c){
        
        System.out.println("Escriba a que categoria lo desea cambiar");
        

        System.out.println("La categoria incial fue" + category + " La categoria actual es " + c);

        category=c;


    }    

}
