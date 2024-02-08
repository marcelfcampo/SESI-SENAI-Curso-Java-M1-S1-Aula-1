
import java.util.Scanner;

// Exercício 5.2 - Do While
/*
[M1S01] Ex 5 - Laços de Repetição
5.1. While: fazer um algoritmo para somar valores até o usuário digitar o valor 0. Ou seja,
some todos os valores que o usuário digitar, porém, quando ele digitar 0 o “loop” acaba.
A cada iteração do loop apresente o resultado atual da soma.

5.2. Do While: faço o mesmo exercício acima, porém utilizando Do While;
5.3. For: Faça um algoritmo que receba 2 notas de 10 alunos, calcule e mostre:
A média aritmética das duas notas de cada aluno.
A mensagem que está na tabela:
 */

// Exercício 5.2 - Do While
public class DoWhile {
    public static void main(String[] args) {
        int numero = 0, soma = 0; //Declaração das variáveis

        Scanner teclado = new Scanner( System.in); //Ler o que for digitado

        System.out.println("Caso queira sair do programa. Digite 0."); //instrução ao usuário


        do { //Laço de Repetição Do While
            System.out.printf("Digite um valor para ser somado: ");
            numero = teclado.nextInt();
            soma = soma + numero;
            System.out.println("Total da soma é: " + soma);
        }
        while (numero != 0);


    }

}
