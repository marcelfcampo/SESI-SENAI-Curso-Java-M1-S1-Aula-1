/*[M1S01] Ex 1 - Cálculo de média
Solicite 3 notas de 0.0 a 10.0 , após a terceira nota apresente o resultado de aprovação ,
para aprovação o aluno deve possuir média superior a 7.0 ;
 */

import java.util.Scanner;

    // 1.Na linha abaixo declaramos uma nova classe pública com nome Main
    // 2.Nome da classe sempre igual ao nome do arquivo .java
    // 3.0 Nome da classe primeira letra sempre em maiúscula
public class Ex01Semana01 {

        // Médodo main significa que a máquina virtual java não precisa instanciar um objeto do tipo da sua classe.
    public static void main(String[] args) {

        ////Definimos aqui uma nova variável com double
        double nota1;
        double nota2;
        double nota3;

        // Para que seja possível a leitura utilizamos o Scanner
        Scanner entradaUsario = new Scanner(System.in);

        // Solicita ao usuário que digite a nota 1
        System.out.println("Digite a nota 1");
        nota1 = entradaUsario.nextDouble(); //atribui o valor da nota 1 com o que o usuário vai digitar

        // Solicita ao usuário que digite a nota 2
        System.out.println("Digite a nota 2");
        nota2 = entradaUsario.nextDouble(); //atribui o valor da nota 2 com o que o usuário vai digitar

        // Solicita ao usuário que digite a nota 3
        System.out.println("Digite a nota 3");

        nota3 = entradaUsario.nextDouble(); //atribui o valor da nota 3 com o que o usuário vai digitar

        double media = ((nota1 + nota2 + nota3) / 3);

        if ( media > 7.0){
            System.out.println("Aluno Aprovado com média " + media); //Retorna Aluno aprovado com média
        } else {
            System.out.println("Aluno Reprovado com média " + media); //Retorna Aluno Reprovad com média
        }

        // operador ternário
//        System.out.println(( media > 7.0 ) ? "Aluno aprovado com média " + media :
//                                            "Aluno reprovado com Média " + media);


    }
}
