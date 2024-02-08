import java.util.Scanner;

/*
[M1S01] Ex 4 - Usar Switch Case e imprimir em tela o dia da semana
Crie um algoritmo em Java, para receber como entrada do usuário um número inteiro e  utilizando a
estrutura de condição Switch Case retorne ao usuário o dia da semana referente ao número inteiro digitado.
Conforme este fluxograma:

 */
public class Main {
    public static void main(String[] args) {

    //Delaração de variáveis
    int numero;

    //Instância do objeto Scanner, para receber dados do usuário
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um número para saber o dia da semana"); // Inpressão no terminal/mensagem de instrução
    numero = teclado.nextInt(); // Armazenando o número digitado pelo usuário na variável número

    switch (numero) {
        case 1: // Caso o valor da variável número seja 1
            System.out.println("Você escolheu Domingo");
            break;

        case 2: // Caso o valor da variável número seja 2
            System.out.println("Você escolheu Segunda");
            break;

        case 3: // Caso o valor da variável número seja 3
            System.out.println("Você escolheu Terça");
            break;

        case 4: // Caso o valor da variável número seja 4
            System.out.println("Você escolheu Quarta");
            break;

        case 5: // Caso o valor da variável número seja 5
            System.out.println("Você escolheu Quinta");
            break;

        case 6: // Caso o valor da variável número seja 6
            System.out.println("Você escolheu Sexta");
            break;

        case 7: // Caso o valor da variável número seja 7
            System.out.println("Você escolheu Sábado");
            break;

        case 8: // Caso o valor da variável número seja 8
            System.out.println("Você escolheu Domingo");
            break;

            default: // default é uma vávula de escape se não der nenhuma das opções acima cai no default
            System.out.println("Número Inválido");

    }

    }

}
