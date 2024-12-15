package Oexception.DexcecaoCustomizada;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String userNameDB = "Lucas";
        String passwordDB = "12345";
        System.out.println("Usuario:");
        String userNameDigitado = teclado.nextLine();
        System.out.println("Senha:");
        String senhaDigitada = teclado.nextLine();
        teclado.close();
        if(!userNameDB.equals(userNameDigitado) || ! passwordDB.equals(senhaDigitada)){
           throw new LoginInvalidoException("Usuário ou senha inválido");
        }
        System.out.println("Usuário logado com sucesso.");
    }
}
