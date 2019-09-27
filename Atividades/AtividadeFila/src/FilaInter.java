
public interface FilaInter {

    void enqueue(int value);

    int denqueue();

    int front(); //peek

    boolean isEmpty();

    boolean isFull();

    int size();
}
