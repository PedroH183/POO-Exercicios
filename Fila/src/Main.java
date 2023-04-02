import br.com.fila.Fila;
public class Main {
    public static void main(String[] args) {
        Fila my_queue = new Fila(5, (Fila)null);
        my_queue.pushWithClassLinkedList(10);
        my_queue.listValues();
        System.out.println("Deleted >>" + my_queue.popWithClassLinkedList());
        my_queue.listValues();
    }
}
