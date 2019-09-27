public class FilaInteiro {

    public static void main(String[] args) {
        FilaDin fila = new FilaDin();

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Fila:");
        fila.display();

        while (!fila.isEmpty()) {
            System.out.println("Removendo  " + fila.dequeue());
        }
    }

}


