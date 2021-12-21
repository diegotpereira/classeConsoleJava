public class No {
    
    // valor armazenado no nó
    private int valor;

    // filho esquerdo
    private No esquerdo;

    private No direito;

    // construtor do nó
    public No(int valor) {
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    
}
