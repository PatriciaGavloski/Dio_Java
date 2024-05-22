package Estudos.Aulas;

public class Aula08 {

    public static void main (String[] args){
 /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE */

        int a, b;
        a= 6;
        b = 6; 

        String resultadoUm = "";

        if (a==b)
            resultadoUm = "verdadeiro";
        else 
            resultadoUm = "falso";
         
        System.out.println(resultadoUm);

        String resultadoDois = a==b ?"verdadeiro" : "falso";

        System.out.println(resultadoDois);


    }
    
}
