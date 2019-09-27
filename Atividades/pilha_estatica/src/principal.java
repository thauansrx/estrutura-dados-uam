import java.util.Scanner;
import java.util.Stack;

public class principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = teclado.next();
        pilha pilha = new pilha(palavra.length() + 1);

        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
            System.out.print(palavra.charAt(i));
        }

            System.out.println("");

        for (int i = palavra.length(); i > 0; i--) {
            System.out.print(pilha.peek());
            pilha.pop();

        }

    }
}
