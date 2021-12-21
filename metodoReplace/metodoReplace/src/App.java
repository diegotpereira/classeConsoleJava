public class App {
    public static void main(String[] args) throws Exception {
        String frase = "Programar em C++ é muito legal! Gosto muito de C++";

        System.out.println("Frase original" + frase);

        // substituir as ocorrências 
        frase = frase.replace("C++", "Java");

        System.out.println("Depois da substituição: " + frase);
    }
}
