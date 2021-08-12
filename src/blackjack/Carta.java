package blackjack;
public class Carta {
    public String nome, naipe;
    public Carta() 
    {
    }

    public Carta(String nome, String naipe) 
    {
        this.nome = nome;
        this.naipe = naipe;
    }

    public String getNaipe() 
    {
        return naipe;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNaipe(String naipe) 
    {
        this.naipe = naipe;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
}
