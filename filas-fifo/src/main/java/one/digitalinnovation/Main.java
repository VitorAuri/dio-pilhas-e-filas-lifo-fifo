package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println("# TESTANDO OS METODOS FILA #");
        System.out.println(minhaFila);
        System.out.println("########################");
        System.out.println(minhaFila.dequeue());
        System.out.println("########################");
        minhaFila.enqueue("quinto");
        System.out.println(minhaFila);
        System.out.println("########################");
        System.out.println(minhaFila.first());
        System.out.println("########################");
        System.out.println("Fila vazia? = " + minhaFila.isEmpty());

    }
}
