package Oexception.E_exceçãoSobrescrita;
import javax.naming.NameNotFoundException;
import Oexception.DexcecaoCustomizada.LoginInvalidoException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) throws NameNotFoundException, LoginInvalidoException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
        pessoa.salvar();
    }
}
