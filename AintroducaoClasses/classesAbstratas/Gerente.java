package classesAbstratas;

public class Gerente extends Funcionario {

    //Construtor obrigatório vindo da classe pai (Funcionario)
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    //método toString
    @Override
    public String toString(){
        return "Nome do gerente: " + nome + ", salario: " + salario;
    }

    //Método abstrato da super classe
    public void calcularBonus(){
        System.out.print("Bônus do salário: ");
        System.out.println(this.salario = this.salario * 0.1);
    }
}
