//Titulo da aula: Associação - Arrays com Objetos
package GAssociacao.UmParaMuitos;

public class JogadorTest01 {
    public static void main (String[] args){
        Jogador jogador1  = new Jogador("Ronaldo");
        Jogador jogador2  = new Jogador("Zidane");
        Jogador jogador3  = new Jogador("Messi");

        //Variavel de referência array
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
