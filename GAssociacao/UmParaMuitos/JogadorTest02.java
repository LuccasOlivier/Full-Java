package GAssociacao.UmParaMuitos;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        //Cadastrando o jogador no time
        jogador1.setTime(time);

        jogador1.imprime();
    }
}
