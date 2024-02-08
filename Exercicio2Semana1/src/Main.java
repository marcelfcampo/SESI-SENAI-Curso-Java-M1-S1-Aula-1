/*
[M1S01] Ex 2 - Cálculo de média E Presença
Solicite número de faltas, 3 notas de 0.0 a 10.0 , após a terceira nota apresente o resultado de aprovação,
para aprovação o aluno deve possuir média superior a 7.0 e presença superior a 80% e o número total de aulas é 20 ;
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        int quantidadeFaltas, totalAulas, porcentagemAprovacao;
        double nota1, nota2, nota3, media, qtdPresencasNecessarias;

        // Para que seja possível a leitura utilizamos o Scanner
        Scanner leitor = new Scanner(System.in);



        //Nossa primeira impressao no terminal
        System.out.printf("Digite o percentual de presença necessário para ser aprovado: ");

        // porcentagemAprovacao vai receber o leitor.nextInt(); vai ler um numero inteiro do teclado, isso vai
        // salvar na nossa variável porcentagemAprovacao
        porcentagemAprovacao = leitor.nextInt();

        // Perguntar para o usuário qual é o nosso 100%, no caso do exercício é 20
        System.out.printf("Digite a quantidade total de aulas: ");
        totalAulas = leitor.nextInt();

        qtdPresencasNecessarias = (porcentagemAprovacao * totalAulas) / 100;

        System.out.println("Se a quantidade de presenças do aluno for menor que " +
                qtdPresencasNecessarias + " ele será reprovado.");


        System.out.printf("Digite a quantidade de faltas do(a) aluno(a): ");
        quantidadeFaltas = leitor.nextInt();

        if (qtdPresencasNecessarias > (totalAulas - quantidadeFaltas)) {
            System.out.println("Aluno reprovado por faltas!");

        } else {
            System.out.println("A presença do aluno foi de: "+
                    ((((totalAulas - quantidadeFaltas) * 100) / 20)) + "%");
            System.out.println("Agora, vamos ver a média do aluno.");

            System.out.printf("Digite a nota 1 do aluno: ");
            nota1 = leitor.nextDouble();

            System.out.printf("Digite a nota 2 do aluno: ");
            nota2 = leitor.nextDouble();

            System.out.printf("Digite a nota 3 do aluno: ");
            nota3 = leitor.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;

            System.out.println("\nA nota final do aluno é: " + media);

            if (media > 7){
                System.out.println("Aluno Aprovado!");

            } else {
                System.out.println("Aluno Reprovado!");
            }

        }

        // Encerra não quero mais que leia o que o usuário vai digitar
        leitor.close();

    }
}