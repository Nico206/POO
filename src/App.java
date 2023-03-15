import ejemplo.Ejemplo;
import intro.Animal;
import intro.Movie;

public class App {
    public static void main(String[] args) throws Exception {
            
        
        Animal tigre=new Animal("jose",15);
        tigre.mostarAnimal();
        Animal panda= new Animal();

        Movie minions= new Movie("minion", 1.50, "Infantil", "no se");
        minions.mostrarInfo();

    }
}
