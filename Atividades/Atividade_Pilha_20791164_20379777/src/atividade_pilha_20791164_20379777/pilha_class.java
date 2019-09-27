package atividade_pilha_20791164_20379777;
public class pilha_class implements pilha {

    private int maxSize;
    private char[] charPilha;
    private int topo;
    
    public pilha_class (int tamanho){
        maxSize = tamanho;
        charPilha = new char[maxSize];
        topo = 0;
    }

    pilha_class() {
    }
    
    @Override
    public void push(char i) {
        topo = topo + 1;
        charPilha[topo] = i;
        
    }

    @Override
    public char pop() {
        char saida = '\0';
        charPilha[topo] = saida;
        topo -= 1;
        return saida;
    }

    @Override
    public char peek() {
       return charPilha[topo];
    }

    @Override
    public boolean pilhaVazia() {
        if(topo > 0){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public boolean pilhaCheia() {
        if(topo == maxSize){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int size() {
        return topo;
    }
    
    
}
