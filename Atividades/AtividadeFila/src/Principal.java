
import java.util.Scanner;

public class Principal {

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        boolean cont = false;
        GerenciaFila gfila = new GerenciaFila();
        System.out.println("Digite os numeros que serao enfileirado: (até sete)");
        for (int i = 0; i < 7; i++) {
            numero = input.nextInt();
            gfila.enqueue(numero);
        }
        System.out.println("Deseja remover algum da fila? S/N: ");
        char escolha = input.next().charAt(0);
        if (escolha == 'S' || escolha == 's') {
            cont = true;
        } else {
            System.out.println("Fim");
            System.exit(0);
        }
        while (cont == true) {
            gfila.denqueue();
            System.out.println("Temos: " + gfila.size() + " na fila. Deseja remover mais: ");
            escolha = input.next().charAt(0);
            if (escolha == 'S' || escolha == 's') {

                cont = true;
                if (gfila.size() == 1) {
                    System.out.println("Fila zerada");
                    cont = false;
                }
            } else {
                System.out.println("Fim");
                System.exit(0);
            }
        }
    }
}
