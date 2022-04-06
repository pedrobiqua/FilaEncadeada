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

    public void insereOrdenado(int elemento){
        if(this.vazio() || (elemento <= this.primeiro.info)) {
            this.inserePrimeiro(elemento);}
        else if (elemento >= this.ultimo.info)
            this.insereUltimo(elemento);
        else{
            No novo = new No(elemento);
            No p = this.primeiro;
            No q = null;

            while(elemento >= p.info){
                q = p;
                p = p.proximo;
            }

            novo.proximo = p;
            q.proximo = novo;
        }
    }

    public No removeValor(int elemento) {
        //Essa função está errada.
        if (vazio()) {
            System.out.println("A fila está vazia");
            No p = new No(0);
            return p;
        }else{
            No novo = new No(elemento);
            No p = this.primeiro;
            No q = null;

            while(p.info < elemento){
                q = p;
                p = p.proximo;
            }

            novo.proximo = p;
            q.proximo = novo;
            return novo;
        }
    }

    public boolean vazio(){
        if(primeiro == null && ultimo == null){
            System.out.println("A fila está vazia");
            return true;
        }
        return false;
    }
}
