import java.util.Scanner;
// Exercício 5.1 - While
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
public class While {
    public static void main(String[] args) {
        int numero = 1, soma = 0; // Variáveis

        // Instrução/impressão de texto no terminal
        System.out.println("Caso você queira sair do programa, digite 0.");

        //Instância do objeto Scanner, para receber dados do usuário
        Scanner teclado = new Scanner(System.in);

        // Laço de repetição While
        while (numero != 0) { // enquanto a condição for verdadeira
            System.out.println("Digite um número para ser somado: ");
            numero = teclado.nextInt();
            soma = soma + numero;
            System.out.println("O total da soma no momento é: " + soma);



        }


    }

}

