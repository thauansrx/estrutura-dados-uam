public class pilha implements pilhaChar{
    
    private int maxSize;
    private char[] charPilha;
    private int topo;
    
    public pilha (int tamanho){
        maxSize = tamanho;
        charPilha = new char[maxSize];
        topo = 0;
    }

    pilha() {
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
            return true;
        }
        else {
            return false;
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
