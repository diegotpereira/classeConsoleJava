public class App {
    public static void main(String[] args) throws Exception {
        int [] valores = new int[5];

        // inicializar array
        valores[0] = 23;
        valores[1] = 65;
        valores[2] = 2;
        valores[3] = 87;
        valores[4] = 34;

        // obtém a soma
        int soma = soma(valores);

        System.out.println("A soma dos valores é: " + soma);

        System.exit(0);
    }

    public static int soma(int[] a) {
        int total = 0;

        for(int i = 0; i < a.length; i++) {
            total += a[i];
        }

        return total;
    }
}
