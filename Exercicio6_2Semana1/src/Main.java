
import java.util.ArrayList;
import java.util.Scanner;
/*
Programa para adicionar nomes utilizando um ArrayList:
Receba os nomes até que FIM seja digitado;
Mostre a lista de nomes;

 */

/*
6.2. ArrayList:
Crie um ArrayList chamado nomes do tipo String;
Adicione alguns nomes nesse ArrayList;
Depois, utilize os métodos:
Mostra todo o conteúdo do ArrayList (imprimir no terminal);
Verificar se contém algum nome “Pedro” no ArrayList (boolean, imprimir no terminal);
Verificar se o ArrayList está vazio ou não (boolean, imprimir no terminal)
Imprimir em tela o tamanho do ArrayList;
Remover algum nome do ArrayList;
Limpar todo o ArrayList;
Imprimir no terminal o tamanho do ArrayList novamente;

 */
public class Main {
    public static void main(String[] args) {

        //Criamos as variáveis necessárias para executar o programa

        // Criamos um arraylist que é a lista de nomes
        ArrayList<String> listaNomes = new ArrayList<>();
        // instanciamos o Scanner para ler a entrada do usuario
        Scanner entrada = new Scanner(System.in);
        //Imprimir mensagem no console
        System.out.println("Digite o nome ou FIM para finalizar");
        //Cramos a varável nome digitado para carregar o nome
        String nomeDigitado = entrada.nextLine();

        //Laço de repeticao para alimentata lista de nomes
//        while (!nomeDigitado.equals("FIM")) {
//            //Adicionar nome digitado na lista de nomes
//            listaNomes.add(nomeDigitado);
//            //Repete a pergunta
//            System.out.println("Digite o nome ou FIM para finalizar");
//            //Atribui novo valor a variável nomeDigitado
//            nomeDigitado = entrada.nextLine();
//        }

        boolean controle = true;
        while (controle) {
            System.out.println("Digite o nome ou FIM para finalizar");
            nomeDigitado = entrada.nextLine();
            if ( nomeDigitado.equals("FIM")) {
                controle = false;
            } else {
                listaNomes.add(nomeDigitado);
            }

        }

        //Percorrendo a lista de nomes e imprimindo no console
        for ( String nome : listaNomes) {
            System.out.println(nome);
        }

        //Ao final limpar a lista
        listaNomes.clear();


    }
}