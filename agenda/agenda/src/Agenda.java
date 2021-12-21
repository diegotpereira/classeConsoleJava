public class Agenda {
    
    // vetor armazenar pessoas
    private Pessoa pessoas[];

    // construtor da classe agenda
    public Agenda(int quantidade) {

        pessoas = new Pessoa[quantidade];
    }

    public void salvarPessoa(String nome, int idade,
    Double altura) {

        // verifica se ainda tem posição vaga
        boolean cadastrado = false;

        for(int i = 0; i < pessoas.length; i++) {
            
            // posição encontrada
            if (pessoas[i] == null) {
                
                // cria um novo objeto pessoa
                Pessoa p = new Pessoa(nome, idade, altura);
                // guardar o vetor
                pessoas[i] = p;

                // confirma o cadastro
                cadastrado = true;

                // sair do laço
                break;
            }
        }

        // verifica se o cadastro foi 
        // realizado com sucesso.
        if (cadastrado) {
            
            System.out.println("\nCadastro realizado com sucesso");

        } else {

            System.out.println("\nNão foi possível realizar o cadastro.");
        }
    }

    public void listarAgenda() {
        // percorrer o vetor
        for(int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                
                Pessoa p = pessoas[i];

                System.out.println("\nNome: " + p.getNome());
                System.out.println("\nIdade: " + p.getIdade());
                System.out.println("\nAltura: " + p.getAltura());
            }
        }
    }

    // método remover por nome
    public void removerPessoa(String nome) {

        // verifica se a exclusão foi bem sucedida
        boolean excluido = false;

        for(int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                
                // confirma se a posição é a da pessoa 
                // que procuramos
                if (pessoas[i].getNome().equals(nome)) {
                    
                    // posição disponível novamente
                    pessoas[i] = null;

                    excluido = true;

                    // sair do laço
                    break;
                }
            }
        }

        // confirma o sucesso na exclusão
        if (excluido) {
            
            System.out.println("\nPessoa foi removida com sucesso.");
        } else {
            
            System.out.println("\nNão foi possível remover. Pessoa não localizada.");
        }
    }

    // exibir posição da agenda onde se encontra a pessoa
    public int buscarPessoa(String nome) {
        int resultado = -1;

        // percorre a agenda
        for(int i = 0; i < pessoas.length; i++) {
            // verifica se a pessoa existe na agenda
            if (pessoas[i] != null) {
                
                // verifica se é a pessoa procurada 
                // se encontra na posição
                if (pessoas[i].getNome().equals(nome)) {
                    
                    resultado = i;

                    break;
                }

            }
        }

        return resultado;
    }

      // exibir dados da pessoa 
    // por determinada posição na agenda
    public void exibirPessoa(int index) {

        // verifica se o índice é válido
        if ((index < 0) || (index > (pessoas.length -1))) {
            
            System.out.println("\nÍndice inválido");
        } else {

            Pessoa p = pessoas[index];
            if (p == null) {
                
                System.out.println("\nNão existe pessoa nesse índice ainda.");
            } else {

                System.out.println("\nNome: " + p.getNome());
                System.out.println("\nIdade: " + p.getIdade());
                System.out.println("\nAltura: " + p.getAltura());
            }
        }
    }
}
