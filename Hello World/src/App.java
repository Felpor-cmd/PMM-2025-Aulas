import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Criacao de scanner teclado para leitura da dados externos
        Scanner teclado = new Scanner(System.in);
        //Criacao de variavel simples
        String nome;
        //Atribuicao de leitura de linha para a variavel
        nome = teclado.nextLine();
        //Escrita de texto concatenada com a variavel
        System.out.println("Hello, "+ nome);
        //Liberamento de recurso para o sistema operacional para evitar erros
        teclado.close();
    }
}
