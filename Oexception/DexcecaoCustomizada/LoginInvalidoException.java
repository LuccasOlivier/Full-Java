package Oexception.DexcecaoCustomizada;

public class LoginInvalidoException extends Exception {
    
    //Construtores
    public LoginInvalidoException(){
        super("Login inválido");
    }
    
    public LoginInvalidoException(String message){
        super(message);
    }
}
