public class App {
    public static void main(String[] args) throws Exception {
        String frase = "Programar java é muito legal";
        System.out.println("Frase: " + frase);

        int cont = 0;

        // ocorrencias da letra a
        char letra = 'a';

        for(int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == letra) {
                cont++;
            }
        }

        System.out.println("A frase contém " + 
                           cont + " ocorrências da letra \" " + letra + "\"");

        System.exit(0);
    }
}
