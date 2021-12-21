import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // construtor vetor com 5 inteiros
        int [] valores = new int[5];


        // inicializar os elementos do array
        valores[0] = 23;
        valores[1] = 65;
        valores[2] = 2;
        valores[3] = 87;
        valores[4] = 34;

        // ordena os valores
        Arrays.sort(valores);
        System.out.println("Ordenando em ordem crescente: ");

        for(int valor : valores) {

            System.out.println(valor + " ");
        }

        // invertendo valores
        inverter(valores);

        // exibe os valores dos elementos do array
        // usando laço for melhorado
        System.out.println("\nOrdenado em ordem decrescente:");

        for(int valor : valores) {
            System.out.println(valor + " ");
        }

        System.out.println("\n");
        System.exit(0);
    }

    // método estático que recebe um array e
    // inverte a ordem se seus elementos
    public static void inverter(int[]b) {
        int esquerdo = 0;
        int direito = b.length - 1;

        while (esquerdo < direito) {
            
            int temp = b[esquerdo];
            b[esquerdo] = b[direito];
            b[direito] = temp;

            esquerdo++;
            direito--;
        }
    }
}
