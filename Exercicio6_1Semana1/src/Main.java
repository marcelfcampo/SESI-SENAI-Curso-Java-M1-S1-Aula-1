
/*
M1S01] Ex 6 - Array e ArrayList
6.1. Array:
crie um Array com o nome de “valores” com 10 elementos do tipo Double.
Preencha com valores todas as posições do Array.
Depois imprima no terminal todos os valores desse Array utilizando o laço de repetição For;
Depois realize a soma de todos os valores desse Array usar um laço de reptição For e imprima o total no terminal;

 */

public class Main {
    public static void main(String[] args) {


            double[] valores = {10.5,20.5,30.5,40.5,50.5,60.5,70.5,80.5,90.5,10.5};

            double soma = 0;
            for (int i = 0; i <valores.length; ++i) {
                System.out.println("Posicao: " + i + " Valor: " + valores[i]); // impressão no console
                soma = soma + valores[i]; // soma os valores
                soma += valores[i]; // também soma os valores
            }
            System.out.println("A soma dos Valores é: " + soma); // impressão concatenada

    }

}
