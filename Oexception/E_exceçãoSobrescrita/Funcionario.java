package Oexception.E_exceçãoSobrescrita;

public class Funcionario extends Pessoa {
    
    //Sobrescrita de método
    @Override
    public void salvar(){
        System.out.println("Salvando funcionário");
    }
    //Quando você está sobrescrevendo um método, você não é obrigado a declarar as mesmas exceções que aquele método está declarando. A funcionalidade da sobrescrita que está sendo implementada pode ser completamente diferente.
}
