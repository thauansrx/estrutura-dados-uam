package listacircular;

import java.util.Scanner;

public class ListaCircularista {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();

        System.out.println("Digite os valores a serem acrescidos.");
        lista.insereInicio(scan.nextInt());

        System.out.println("Digite o elemento a ser pesquisado.");
        lista.search(scan.nextInt());

        System.out.println("Deseja remover o primeiro elemento?");
        char opcao = scan.next().charAt(0);
        if (opcao == 'S' || opcao == 's') {
            System.out.println("Valor removido: " + lista.removeInicio());
        } else {
            System.out.println("Lista mantida como estava.");
        }
        
        System.out.println("\n" + lista.exibeLista());

    }
}
