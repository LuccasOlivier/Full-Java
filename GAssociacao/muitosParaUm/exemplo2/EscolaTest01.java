package GAssociacao.muitosParaUm.exemplo2;

public class EscolaTest01 {
    public static void main(String[] args) {
       
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Lucas");
        Professor professor3 = new Professor("Lyvia");
        
        //momento exato em que a associação muitos-para-um é criada
        Escola escola = new Escola("Konoha", new Professor[]{professor1,professor2, professor3});
        
        escola.imprime();

        //Veja, que a nossa Escola pode ter vários professores, enquanto que o professor só pode trabalhar apenas em uma escola. Essa é a associação unidirecional muitos para um. 
    }
}
