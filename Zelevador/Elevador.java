package Zelevador;

public class Elevador {
    private int andarAtual;

    public void chamar(String chamada) {
        if (chamada.equals("chamar")) {
            System.out.println("Elevador chegou...");
        } else {
            System.out.println("Para entrar no elevador, é preciso chamá-lo");
        }
    }

    public void mover(int andarDestino) {
        if (andarDestino > andarAtual) {
            System.out.println("Subindo para o andar " + andarDestino);
        } else if (andarDestino < andarAtual) {
            System.out.println("Descendo para o andar " + andarDestino);
        } else {
            System.out.println("Elevador já está no andar " + andarDestino);
        }
        andarAtual = andarDestino;
    }
}