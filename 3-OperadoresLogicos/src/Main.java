
//Nosso primeiro Código
/*
Faça um programa que leia o nome e idade, após retorne no console os dados lidos.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Escrever no console o texto
        System.out.println("Escreva seu nome -> ");
        //Para que seja possível a leitura utilizamos o Scanner.
        Scanner scanner = new Scanner(System.in);
        // Definimos aqui uma nova variável com tipo de dado texto
        String nome;
        // Atribuindo valor à variável nome através da entrada do usuário
        nome = scanner.next();
        //Após ler o nome vamos solicitar a idade
        System.out.println("Escreva sua idade -> ");
        // Definimos aqui uma nova variável com tipo de dado inteiro
        // Em seguida já atribuimos seu valor através da entrada do usuário
        int idade = scanner.nextInt();
        //Escrevemos então um retorno nome e idade;
        System.out.println("Olá " + nome + " de " + idade + " anos ");

    }
}