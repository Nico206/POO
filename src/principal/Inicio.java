package principal;
import salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        Persona nose= new Persona();
        nose.pedirDatos();
        nose.mostrarDatos();
        nose.calcularImc();
        nose.mayorEdad();
    }
    


}
