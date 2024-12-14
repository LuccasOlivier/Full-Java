package Oexception.BexceptionUnchecked.test;
//Bloco Finally. O bloco finally trabalha em conjunto com o bloco try-catch. Ele está relacionado tanto com exceções do tipo unchecked quanto checked em Java.

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try{
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();//Lançando uma exceção para exemplificar
            //System.out.println("Escrevendo no arquivo");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Fechando recurso liberado pelo SO");
        }
        /*
         * note que o bloco finally é executado independente de existir uma exceção ou não. Se você comentar a exceção na linha 8, o bloco finally ainda assim será executado.  
         */
    }
}