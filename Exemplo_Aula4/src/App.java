import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int opcao = menu(teclado);
        while (opcao != 0){
            switch (opcao) {
                case 1 -> cadastrarProduto(teclado);
                case 2 -> consultarProduto(teclado);
            }
            opcao = menu(teclado);
        }
        System.out.println("SAINDO ...");
        teclado.close();
    }
}
