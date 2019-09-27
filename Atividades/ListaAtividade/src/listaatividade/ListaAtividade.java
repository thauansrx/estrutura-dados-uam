package listaatividade;

import javax.swing.JOptionPane;

public class ListaAtividade {

    public static void main(String[] args) {
        
        ListaGerencia lg = new ListaGerencia();
        int opcao = 0;
        int insere = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as opçoes: "
                    + "\n1 - Inserir um numero na lista"
                    + "\n2 - Remover um numero da lista"
                    + "\n3 - Substituir um numero da lista"
                    + "\n4 - Mostrar o tamanho"
                    + "\n5 - Sair"));
            switch (opcao) {
                case 1:
                    lg.inserir(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero que deseja acrescentar:")));
                    break;
                case 2:
                    lg.remover(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o indice que deseja remover:")));
                    break;
                case 3:
                    lg.substituir(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o novo valor que deseja acrescentar:")), Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a posicao que deseja substituir:")));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, String.valueOf(lg.tamanho()));
                    break;
                case 5:
                    System.exit(0);
                    break;    
                default:
                    System.exit(0);
            }
            
            
        } while (true);
        
        
    }
    
}
