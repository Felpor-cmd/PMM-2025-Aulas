import java.util.Scanner;

public class App {
    static int quntFrases(Scanner teclado){
        int n;

        System.out.println("Digite quantas frases deseja verifcar: ");
        n = Integer.parseInt(teclado.nextLine());

        return n;
    }

    static String[] preencheVetor(Scanner teclado, int quntFrases){
        int[] vetorFrases = new int[quntFrases];

        for(int i = 0; i < quntFrases; i++) {
            System.out.println("Digite a " + i + " frase");
            vetorFrases[i] = Integer.parseInt(teclado.nextLine());
        }

        return vetorFrases;
    }

    static String verificaPalindromo(char[] ObjetoFrases, int posicaoVetor){
        boolean ehPalindromo;
        int i = 0;
    
        for (; i < ObjetoFrases.length; i++);

        if(i % 2 == 0){
            
        }else {

        }

    }
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int quntFrases = quntFrases(teclado);
        String[] vetorFrases = preencheVetor(teclado, quntFrases);

        for (int i = 0; i < vetorFrases.length; i++) {
            char[] ObjetoFrases = vetorFrases[i].toCharArray();
            verificaPalindromo(ObjetoFrases, i);
        }

    }
}
