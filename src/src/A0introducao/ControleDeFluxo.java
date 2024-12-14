public class ControleDeFluxo {
    public static void main(String[] args) {
        // Fluxo de controle - Estrutura condicional IF / Else IF / Else
       /* int idade = 18;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulta";
        }
        System.out.println(categoria);
        //Perceba que fizemos uma variavel categoria e atribuimos a cada categoria, assim o codigo fica mais limpo do que colocarmos diversos system.out.println
        */
        //Operador ternario
        int age = 18;
        System.out.println(age < 18 ? "menor de idade" : "maior de idade"); 
    }
}