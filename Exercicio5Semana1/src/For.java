import java.util.Scanner;

/*
5.3. For: Faça um algoritmo que receba 2 notas de 10 alunos, calcule e mostre:
        A média aritmética das duas notas de cada aluno.
        A mensagem que está na tabela:

// Semana 2 aula 1 video 1:54 hras
           for ( String nome : listaNomes) {
//         System.out.println(nome);
//         }
 */


public class For {
    public static void main(String[] args) {

        double nota1, nota2, media;

        Scanner teclado = new Scanner(System.in);

        for (int contador = 0; contador < 10; contador++) {
            System.out.println("Digitar a nota 1: ");
            nota1 = teclado.nextDouble();

            System.out.println("Digitar a nota 2: ");
            nota2 = teclado.nextDouble();

            media = (nota1 + nota2) / 2;

            if (media < 3) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Aprovado");
            }

        }

    }
}
