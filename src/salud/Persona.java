package salud;
import java.util.Scanner;


public class Persona {
    private Scanner lectura= new Scanner(System.in);
    String tipoDoc;
    int documento;
    String nombre;
    String apellido;
    Double peso;
    Double estatura;
    int edad;
    String sexo;


    public void pedirDatos(){
        System.out.println("Por favor ingrese su tipo de documento");
        tipoDoc= lectura.nextLine();
        System.out.println("Por favor ingrese su documento");
        documento= lectura.nextInt();
        lectura.nextLine();
        System.out.println("Por favor ingrese su nombre");
        nombre= lectura.nextLine();
        System.out.println("Por favor ingrese su apellido");
        apellido= lectura.nextLine();
        System.out.println("Por favor ingrese su peso");
        peso= lectura.nextDouble();
        System.out.println("Por favor ingrese su estatura");
        estatura= lectura.nextDouble();
        System.out.println("Por favor ingrese su edad");
        edad= lectura.nextInt();
        lectura.nextLine();
        System.out.println("Por favor ingrese su sexo");
        sexo= lectura.nextLine();


    }

    public void mostrarDatos(){
        System.out.println(" su tipo de documento es :" + tipoDoc);        
        System.out.println("Su documento es " + documento);    
        System.out.println("Su nombre es " + nombre );
        System.out.println("Su apellido es " + apellido);        
        System.out.println("Su peso es " + peso);        
        System.out.println("Su estatura es " + estatura);
        System.out.println("Su edad es  " + edad );       
        System.out.println("Su sexo es " + sexo);
        
    
    }
    public void calcularImc(){
        double pesoActual;
        pesoActual=peso/(Math.pow(estatura, 2));
        System.out.println("Su imc es de " +pesoActual);
        if (pesoActual<=20){
            System.out.println("El peso esta por debajo de lo ideal");

        }else if (pesoActual<=25){
            System.out.println("El peso ed ideal");

        }else{
            System.out.println("Tiene sobrepeso");

        }
    }

    public void mayorEdad(){
        if(edad<=18){
            System.out.println("usted es menor  de edad");

        }else {
            System.out.println("usted es menor de edad");
        }

    }

}
