import java.util.Scanner;

/*
6.2. ArrayList:
1. Crie um ArrayList chamado nomes do tipo String;
2. Adicione alguns nomes nesse ArrayList;
3. Depois, utilize os métodos:
3.1 Mostra todo o conteúdo do ArrayList (imprimir no terminal);
3.2 Verificar se contém algum nome Pedro no ArrayList (boolean, imprimir no terminal);
3.3 Verificar se o ArrayList está vazio ou não (boolean, imprimir no terminal)
3.4 Imprimir em tela o tamanho do ArrayList;
Remover algum nome do ArrayList;
Limpar todo o ArrayList;
Imprimir no terminal o tamanho do ArrayList novamente;
 */
public class ArrayList {
    public static void main(String[] args) {

        //Criamos as variáveis necessárias para executar o programa

        // Criamos um arraylist que é a lista de nomes
        java.util.ArrayList<String> listaNomes = new java.util.ArrayList<>();
        // instanciamos o Scanner para ler a entrada do usuario
        Scanner entrada = new Scanner(System.in);

        //Criamos a varável nome digitado para carregar o nome
        String nomeDigitado;


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
