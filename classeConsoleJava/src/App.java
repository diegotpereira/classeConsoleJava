import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        
        Console console = System.console();

        if(console != null) {

            System.out.println("Console obtido com sucesso");

        } else {

            System.out.println("Não foi possível obter o console");
        }

    }
}
