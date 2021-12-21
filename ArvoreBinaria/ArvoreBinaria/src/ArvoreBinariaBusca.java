

public class ArvoreBinariaBusca {

    // referência para a raiz da árvore
    private No raiz;

    public boolean inserir(int valor) {

        // verifica se está vazio
        if (raiz == null) {
            
            // cria o primeiro nó
            raiz = new No(valor);

        } else {

            // localiza o nó pai do novo nó
            No pai = null;

            // começa a busca pela raiz
            No noAtual = raiz;

            // enquanto o nó atual for 
            // diferente de null
            while (noAtual != null) {
                
                // verifica se o valor inserido é menor que o nó atual
                if (valor < noAtual.getValor()) {
                    
                    pai = noAtual;

                    // vamos inserir do lado esquerdo
                    noAtual = noAtual.getEsquerdo();

                    // verifica se o valor inserido é maior que o nó atual
                } else if (valor > noAtual.getValor()) {
                    pai = noAtual;

                    // vamos inserir do lado direito
                    noAtual = noAtual.getDireito();

                } else {

                    // um nó com este valor foi encontrado
                    return false;
                }
            }

            // cria novo nó e adiciona como filho do nó pai
            if (valor < pai.getValor()) {
                pai.setEsquerdo(new No(valor));
            }
        }

        // retorna true para indicar que o novo nó foi inserido
        return true;
    }

    // método que permite disparar a travessia em-ordem
    public void emOrdem() {
        emOrdem(raiz);
    }

    // sobrecarga do método emOrdem com uma parâmetro (esta é a versão 
    // recursiva do método)
    private void emOrdem(No raiz) {

        // condição de parada
        if (raiz == null) {
            
            return;
        }

        // visita a sub-árvore da esquerda
        emOrdem(raiz.getEsquerdo());

        // visita o nó atual
        System.out.print(raiz.getValor() + " ");

        // visita a sub-árvore da direita
        emOrdem(raiz.getDireito());
    }

    // método que permite pesquisar
    // na árvore binária
    // de busca 
    public No pesquisar(int valor) {

        // chama a versão recursiva do método
        return pesquisar(raiz, valor);
    }

    // sobrecarga do método pesquisar 
    // que recebe dois parâmetros
    // está é a versão recursiva do método
    public No pesquisar(No noAtual, int valor) {
        // valor pesquisado não foi encontrado...
        // retornar null
        if (noAtual == null) {
            
            return null;
        }

        // o valor pesquisado foi encontrado?
        if (valor == noAtual.getValor()) {
            // retorna o nó atual
            return noAtual;

        // se não encontrado
        // disparar nova chamada/
        // para árvore da esquerda
        } else if (valor < noAtual.getValor()) {
            

            return pesquisar(noAtual.getEsquerdo(), valor);

        } else {

            // ainda não encontramos...vamos disparar uma nova 
            // chamada para a sub-árvore da direita
            return pesquisar(noAtual.getDireito(), valor);
        }
    }

    // método que permite obter
    // a quantidade de nós na árvore
    int quantNosArvore() {

        // chama a versão recursiva
        return quantNosArvore(raiz);
    }

    // condição de parada
    int quantNosArvore(No no) {

        if (no == null) {
            
            return 0;

        } else {

            return (quantNosArvore(no.getEsquerdo()) +
                    quantNosArvore(no.getDireito()) + 1);
        }
    }
    public Object retornarMaiorElemento() {
        return null;
    }

}
