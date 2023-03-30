package principal;

import java.util.Scanner;

import salud.Empleado;

public class Inicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        // Crear un objeto de la clase Empleado
        Empleado empleado1 = new Empleado();

        empleado1.calcularHonorarios();

        empleado1.imprimirDatos();

        lectura.close();

        
    }
    
}
