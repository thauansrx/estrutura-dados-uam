public interface FilaInt { 
        void enqueue(int value);
	int dequeue();
	int front(); //ConsultarPrimeiro
	boolean isEmpty();
	boolean isFull();
        int size();
} 