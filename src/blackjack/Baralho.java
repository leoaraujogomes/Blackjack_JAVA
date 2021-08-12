package blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Baralho 
{
    Carta c1 = new Carta();
    ArrayList nome = new ArrayList();
    ArrayList naipe = new ArrayList();
    ArrayList carta = new ArrayList();
    Pilha pilha = new Pilha(52);
    public Baralho() 
    {
        c1.setNome("As");
        nome.add(c1.getNome()); 
        for(int i = 2; i <11; i++){
            c1.setNome(""+i);
            nome.add(c1.getNome()); 
        }
         c1.setNome("Dama");
         nome.add(c1.getNome()); 
         c1.setNome("Valete");
         nome.add(c1.getNome()); 
         c1.setNome("Rei");
         nome.add(c1.getNome()); 
         
         c1.setNaipe("Paus");
         naipe.add(c1.getNaipe()); 
         c1.setNaipe("Copas");
         naipe.add(c1.getNaipe()); 
         c1.setNaipe("Espadas");
         naipe.add(c1.getNaipe()); 
         c1.setNaipe("Ouros");
         naipe.add(c1.getNaipe());
         
         for(int i = 0; i < naipe.size(); i++){
            for(int j = 0; j < nome.size(); j++){
                carta.add(nome.get(j) +" de "+ naipe.get(i));
            }     
        }     
    }
   public void embaralha()
   {
      ArrayList listacartas = new ArrayList();
      Random rnd = new Random();
      while(carta.size() > 1){
          int posicao = rnd.nextInt(carta.size());
          listacartas.add(carta.get(posicao));
          carta.remove(posicao);
      }
      listacartas.add(carta.get(0));
      carta.clear();
      for(int i = 0; i < listacartas.size(); i++){
          carta.add(listacartas.get(i));
      }
   }
   public Object retiraCartaPilha()
   {
        return pilha.pop();
   }
   public void insereCartaPilha()
   {
       for (int i = 0;i < carta.size(); i++)
       {
           pilha.push(carta.get(i));
       }
   } 
}