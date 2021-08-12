package blackjack;
public class Pilha implements TAD_Pilha{
    private int topo;
    private int MAX;
    private Object memo[];

    public Pilha(int x) 
    {
        
        MAX = x;
        topo = -1;
        memo = new Object[MAX];
    }

    @Override
    public Object push(Object x) 
    {
        if (!isFull() && x != null && x != "")
        {
            memo[++topo] = x;
            return x;
        }
        else
        {
            return null;
        }
    }
    
    @Override
    public Object pop()
    {
        if(!isEmpty())
        {
            return memo[topo--];
        }
        else
        {
            return null;
        }
    }
    
    @Override
    public Object top()
    {
        if(!isEmpty())
        {
            return memo[topo];
        }
        else
        {
            return null;
        }
    }
    
    @Override
    public boolean isEmpty()
    {
        if(topo == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public boolean isFull()
    {
        if(topo == MAX - 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public String toString()
    {
        if(!isEmpty())
        {
            String msg = "";
            int pos = topo;
            for(int i = topo;i >= 0;i--){
                msg += memo[i].toString();
                if(i != 0) msg += ", ";
            }
            return (msg);
        }
        else return "Pilha vazia!";
    }

    public int getTopo() {
        return topo+1;
    }
    
}
