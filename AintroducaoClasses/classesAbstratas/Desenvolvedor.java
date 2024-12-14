package classesAbstratas;

public class Desenvolvedor extends Funcionario {

    //Construtor obrigatório vindo da classe pai (Funcionario)
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    //Método toString
    @Override
    public String toString(){
        return "Nome do desenvolvedor: " + this.nome + ", salário: " + this.salario;
    }

    //Método abstrato da super classe
    public void calcularBonus(){
        System.out.print("Bônus do salário: ");
        System.out.println(this.salario = this.salario * 0.05);
    }

    
}
