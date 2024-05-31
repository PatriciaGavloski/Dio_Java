package Aulas;
public class Aula02 {

    public static void main (String [] args) {

        String primeiroNome = "Patricia";
        String segundoNome = "Novaski";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
