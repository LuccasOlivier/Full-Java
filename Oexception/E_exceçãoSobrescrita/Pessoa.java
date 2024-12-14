package Oexception.E_exceçãoSobrescrita;
import javax.naming.NameNotFoundException;
import Oexception.DexcecaoCustomizada.LoginInvalidoException;

public class Pessoa{     //Este método lança duas exceções veja:
    public void salvar() throws LoginInvalidoException, NameNotFoundException{
        System.out.println("Salvado pessoa");
    }
}