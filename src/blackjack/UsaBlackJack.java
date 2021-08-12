package blackjack;

import java.util.ArrayList;

public class UsaBlackJack {
    
public static Pilha pjogador = new Pilha(11);
public static Pilha pmesa = new Pilha(11);
public static ArrayList cartas = new ArrayList();
public static int pontuacao = 0;
    public static void main(String[] args) 
    {
        
       Baralho bar = new Baralho();
       bar.embaralha();
       bar.insereCartaPilha();
       

       //INSERE CARTAS PARA O JOGADOR
       for (int i = 0; i < 2; i++)
       {
            Object usacarta = bar.retiraCartaPilha();
            pjogador.push(usacarta);
            System.out.println((i+1)+"ª carta do jogador: "+pjogador.top());
            pontuacao += contaCartas(usacarta);
       }
       //INSERE NA MESA E PASSA PARA O JOGADOR
       for (int i = 0; i < 2; i++)
       {
            Object usacarta = bar.retiraCartaPilha();
            pmesa.push(usacarta);
            System.out.println((i+1)+"ª carta da mesa: "+pmesa.top());
            pontuacao += contaCartas(usacarta);
            if (pontuacao >= 21)
            {
                pjogador.push(pmesa.pop());
                break;
            }
            pjogador.push(pmesa.pop());
       }
       //PEDE MAIS CARTAS ENQUANTO NÃO ALCANÇAR 21
       int controlador = 4;
       while (pontuacao < 21)
       {
           controlador += 1;
           Object usacarta = bar.retiraCartaPilha();
            pjogador.push(usacarta);
            System.out.println((controlador) +"ª carta do jogador: "+pjogador.top());
            pontuacao += contaCartas(usacarta);
       }
       System.out.println("_____________________________________");
       System.out.println("\nQuantidade de cartas do jogador: "+pjogador.getTopo());
       System.out.println("Pontuação do jogador: "+pontuacao);
       System.out.println("Cartas do jogador: "+pjogador.toString() + ".");
       
    }

    public static int contaCartas(Object cartaatual)
    {
        int retorno = 0;
        String carta;
        char valorcarta;
        
            carta = String.valueOf(cartaatual);
            valorcarta = carta.charAt(0);
            switch (valorcarta) {
                case 'A':
                    retorno += 1;
                    break;
                case 'D': case 'R': case 'V': case '1':
                    retorno +=10;
                    break;
                default:
                    retorno += Integer.parseInt(String.valueOf(valorcarta));
                    break;
            }
        
        return retorno;
    }
}
