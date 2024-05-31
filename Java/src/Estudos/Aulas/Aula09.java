package Aulas;

public class Aula09 {
    public static void main (String [] args) {
        /* Operadores Relacionais */

        String nomeUm = "Patricia";
        String nomeDois = "Patricia";

        System.out.println(nomeUm.equals(nomeDois));



        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
                System.out.println("A Nossa condição é Verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é Diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é Maior que numeroDois? " + simNao);



    }
}
