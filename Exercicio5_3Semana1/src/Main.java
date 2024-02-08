/*
https://www.youtube.com/watch?v=Kc2RXH7dW-M
5.3. For: Faça um algoritmo que receba 2 notas de 10 alunos, calcule e mostre:
        A média aritmética das duas notas de cada aluno.
        A mensagem que está na tabela:

        < 3 Reprovado
        Entre 3(inclusive) e 7 Exame Final
        De 7 para cima Aprovado
 */

import java.util.Scanner;

public class Main {

    //Instanciação do método principal executor - main;
    public static void main(String[] args) {

        double nota1, nota2, media;

        // Para que seja possível a leitura utilizamos o Scanner
        Scanner teclado = new Scanner(System.in);

        //laço de repetição FOR;
        for (int contador = 0; contador < 10; contador++) {
            // Escrever a nota no  console
            System.out.printf("Digitar a nota 1: ");
            // Atribuindo valor à variável double através da entrada do usuário
            nota1 = teclado.nextDouble();

            // Escrever a nota no  console
            System.out.printf("Digitar a nota 2: ");
            nota2 = teclado.nextDouble();

            //Atribuição da informação para a variável media;
            media = (nota1 + nota2) / 2;
            System.out.println("A média do aluno é: " + media);

            if (media < 3) {
                System.out.println("Aluno Reprovado");
            }

            else if (media < 7) {
                System.out.println("Aluno em Exame Final");
            }
            else {
                System.out.println("Aluno Aprovado");
            }
        }
        teclado.close();

    }
}
