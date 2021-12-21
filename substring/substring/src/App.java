public class App {
    public static void main(String[] args) throws Exception {
        String frase = "Programar em Java é muito bom";
        System.out.println("Frase: " + frase);

        // verifica se a frase contém a palavra
        int res = frase.indexOf("Java");

        if(res > 0) {

            System.out.println("A substring foi encontrada." 
                               + " na posição (indice): " + res);

        } else {

            System.out.println("A substring não foi encontrada");
        }

        System.exit(0);
    }
}
