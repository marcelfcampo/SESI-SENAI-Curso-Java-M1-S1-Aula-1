
//Módulo 1 - Semana 01 - Aula 3 - 23/11/2022 - Jaime Maretoli
/*
[M1S01] Ex 4 - Usar Switch Case e imprimir em tela o dia da semana
Crie um algoritmo em Java, para receber como entrada do usuário um número inteiro e
 utilizando a estrutura de condição Switch Case retorne ao usuário o dia da semana referente ao
 número inteiro digitado. Conforme este fluxograma:
 */

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {

        // O Scanner vai ler dados do usuário, qdo der um play vai estanciar o objeto
        Scanner leitor = new Scanner(System.in);

        //solicita ao usuário digitar uma opção, coloque printf (não quebra a linha)
        System.out.printf("Digite uma opção: ");

        // aguardar o usuário digitar algo
        int opcao = leitor.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Você Escolheu Domingo");
                break;
            case 2:
                System.out.println("Você Escolheu Segunda");
                break;
            case 3:
                System.out.println("Você Escolheu Terça");
                break;
            case 4:
                System.out.println("Você Escolheu Quarta");
                break;
            case 5:
                System.out.println("Você Escolheu Quinta");
                break;
            case 6:
                System.out.println("Você Escolheu Sexta");
                break;
            case 7:
                System.out.println("Você Escolheu Sábado");
                break;


            // default é uma vávula de escape se não der nenhuma das opções acima cai no default
            default:
                System.out.println("Número Inválido");


        }

    }
}
