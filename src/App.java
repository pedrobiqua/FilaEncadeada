public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Exemplo . . . 
        FilaEncadeada fila = new FilaEncadeada();
        fila.insereUltimo(20);
        fila.insereUltimo(80);

        fila.imprimir();
    }
}
