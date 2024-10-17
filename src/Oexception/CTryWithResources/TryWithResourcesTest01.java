package Oexception.CTryWithResources;
import java.io.IOException;


public class TryWithResourcesTest01 {
    public static void main(String[] args){
        lerArquivo();
    }

    public static void lerArquivo(){
        
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

        }catch(IOException e){

        }   
    } 
}
