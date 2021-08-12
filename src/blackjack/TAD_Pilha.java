package blackjack;
public interface TAD_Pilha {
    public Object push(Object x);
    public Object pop();
    public Object top();
    
    public boolean isEmpty();
    public boolean isFull();
    
    @Override
    public String toString();
}

