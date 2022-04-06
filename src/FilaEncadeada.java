public class FilaEncadeada {
    public No primeiro;
    public No ultimo;

    public FilaEncadeada() {
        primeiro = null;
        ultimo = null;
    }

    public void imprimir() {
        No p = this.primeiro;
        while (p != null) {
            System.out.println("Valor: "+ p.info);
            p = p.proximo;
        }
    }

    public void inserePrimeiro(int dado) {
        No p = new No(dado);
        p.proximo = this.primeiro;
        this.primeiro = p;
        if (this.ultimo == null) {
            this.ultimo = p;
        }
    }

    public void insereUltimo(int dado) {
        No p = new No(dado);
        if (ultimo != null) {
            this.ultimo.proximo = p;
        }else{
            this.primeiro = p;
        }
        this.ultimo =p;
        
        
    }

    public int vazio(){
        if(primeiro == null && ultimo == null){
            System.out.println("A fila está vazia");
            return 1;
        }
        return 0;
    }
}
