import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // valos criar novo objeto da classe ArvoreBinaria
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        // inserindo 5 valores na árvore
        for(int i = 0; i < 5; i++) {

            System.out.print("Informe um valor inteiro: ");
            int valor = Integer.parseInt(teclado.nextLine());

            // inserindo o nó e verificar o sucesso da operação
            if (!arvore.inserir(valor)) {
                
                System.out.println("Não foi possível inserir." + 
                                   " Um elemento já contém este valor.");
            }
        }

        // pesquisar um valor na árvore 
        // System.out.print("\nInforme o valor a ser pesquisado: ");
        // int valorPesquisa = Integer.parseInt(teclado.nextLine());

        // // obter objeto da classe NoArvore a partir do
        // // método pesquisar da classe ArvoreBinariaBuscar
        // No res = arvore.pesquisar(valorPesquisa);

        // // valor foi encontrado?
        // if (res != null) {
            
        //     System.out.println("O valor foi encontrado na árvore");

        // } else {

        //     System.out.println("O valor não foi encontrado na árvore");
        // }

        // System.out.println("\n");


        // // vamos exibir os nós da árvore usando o percurso in-order
        // System.out.println("\nPercurso in-order: ");
        // arvore.emOrdem();
        // // obtendo o maior elemento da árvore binária de busca
        // // System.out.println("\nO maior nó é: " + 
        // //                    arvore.retornarMaiorElemento().getValor());

        // // System.out.println("\n");

        // vamos exibir a quantidade de nós
        // na árvore 
        // System.out.println("\nA árvore possui: " + 
        //                    arvore.quantNosArvore() + " nós.\n");

        // System.out.println("\n");

        // obter o maior elemento da árvore binária de busca
        System.out.println("\nO maior nó é: " + 
                           arvore.retornarMaiorElemento().getValor());

        System.out.println("\n");

        teclado.close();
    }
}
