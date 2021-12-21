import java.util.Scanner;

public class App {

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        // cria uma nova agenda
        Agenda agenda = new Agenda(10);

        // campo nome pessoa
        String nome;

        //  campo idade pessoa
        int idade;

        // campo altura pessoa
        Double altura;

        // menu de opções
        while (true) {
            
            System.out.println("Por favor escolha uma opção: ");

            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Excluir Pessoa");
            System.out.println("3 - Buscar Pessoa");
            System.out.println("4 - Exibir Agenda");
            System.out.println("5 - Exibir Pessoa por (Índice)");
            System.out.println("6 - Sair");
            System.out.println("Sua opção: ");

            int opcao = Integer.parseInt(teclado.nextLine());

            switch (opcao) {
                case 1:
                    
                    System.out.println("\nDigite o nome: ");
                    nome = teclado.nextLine();

                    System.out.println("\nInforme a idade: ");
                    idade = Integer.parseInt(teclado.nextLine());

                    System.out.println("\nInforme a altura (use ponto en vez de virgula): ");
                    altura = Double.parseDouble(teclado.nextLine());

                    // armazenado dados da pessoa
                    agenda.salvarPessoa(nome, idade, altura);
                    break;

                case 2:
                   System.out.println("\ninforme o nome a ser excluído: ");
                   nome = teclado.nextLine();
                   agenda.removerPessoa(nome);
                   
                case 3:
                   System.out.println("\nInforme o nome a ser procurado: ");
                   nome = teclado.nextLine();

                   int indice = agenda.buscarPessoa(nome);

                   if (indice < 0) {
                       System.out.println("\nA pessoa não foi localizada.");
                   } else {
                       System.out.println("\nA pessoa foi localizada na posição: " + 
                       indice);
                   }

                   break;

                case 4:
                    agenda.listarAgenda();
                    break;

                case 5:
                    System.out.println("\nInforme índice desejado: ");
                    int index = Integer.parseInt(teclado.nextLine());
                    agenda.exibirPessoa(index);
                    break;

                case 6:
                    System.exit(0);                    
                    break;
            
                default:
                    System.out.println("\nOpção inválida\n");
                    break;
            }
        }
    }
}
