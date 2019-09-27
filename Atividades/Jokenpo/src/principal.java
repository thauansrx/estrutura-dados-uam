
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int j1, j2;
        int i=1;
        System.out.println("Escolha de 1 a 3, sendo:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        do {
            i++;
            System.out.println("");
            System.out.println("1o Jogador:");
            j1 = teclado.nextInt();

            System.out.println("2o Jogador:");
            j2 = teclado.nextInt();

            switch (j1) {
                case 1:
                    switch (j2) {
                        case 1:
                            System.out.println("Empatou -.-'");
                            break;

                        case 2:
                            System.out.println("2o Jogador Ganhou!!!");
                            break;

                        case 3:
                            System.out.println("1o Jogador Ganhou!!!");
                            break;

                        default:
                            System.out.println("Número invalido, MONGOL!!!");
                    }
                    break;

                case 2:
                    switch (j2) {

                        case 1:
                            System.out.println("1o Jogador Ganhou!!!");
                            break;

                        case 2:
                            System.out.println("Empatou -.-'");
                            break;

                        case 3:
                            System.out.println("2o Jogador Ganhou!!!");
                            break;

                        default:
                            System.out.println("Número invalido, MONGOL!!!");
                    }
                    break;

                case 3:
                    switch (j2) {

                        case 1:
                            System.out.println("2o Jogador Ganhou!!!");
                            break;

                        case 2:
                            System.out.println("1o Jogador Ganhou!!!");
                            break;

                        case 3:
                            System.out.println("Empatou -.-'");
                            break;

                        default:
                            System.out.println("Número invalido, MONGOL!!!");
                    }
                    break;
                default:
                    System.out.println("Número invalido, MONGOL!!!");
            }
        } while (i <= 3);
    }
}
