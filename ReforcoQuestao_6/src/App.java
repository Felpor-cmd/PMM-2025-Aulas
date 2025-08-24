import java.util.Scanner;

public class App {
    static String[] lerFrases(Scanner teclado){
        String[] frases = new String[100];
        String frase;
        int contador = 0;

        System.out.println("Digite as frases (digite 'FIM' para encerrar):");
        
        while(contador < 100) {
            System.out.print("Frase: ");
            frase = teclado.nextLine();
            
            if(frase.equalsIgnoreCase("FIM")) {
                break;
            }
            
            frases[contador] = frase;
            contador++;
        }

        String[] frasesFinais = new String[contador];
        for(int i = 0; i < contador; i++) {
            frasesFinais[i] = frases[i];
        }

        return frasesFinais;
    }

    static boolean verificaPalindromo(String frase){
        char[] fraseSemEspacos = new char[frase.length()];
        int tamanho = 0;
        
        for(int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if(c != ' ') {
                if(c >= 'A' && c <= 'Z') {
                    fraseSemEspacos[tamanho] = (char)(c + 32); // Converte para minúscula
                } else {
                    fraseSemEspacos[tamanho] = c;
                }
                tamanho++;
            }
        }
        
        int inicio = 0;
        int fim = tamanho - 1;
        
        while(inicio < fim) {
            if(fraseSemEspacos[inicio] != fraseSemEspacos[fim]) {
                return false;
            }
            inicio++;
            fim--;
        }
        
        return true;
    }
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String[] frases = lerFrases(teclado);

        System.out.println("\nResultados:");
        for (int i = 0; i < frases.length; i++) {
            String frase = frases[i];
            boolean ehPalindromo = verificaPalindromo(frase);
            
            if(ehPalindromo) {
                System.out.println("\"" + frase + "\" é um palíndromo.");
            } else {
                System.out.println("\"" + frase + "\" não é um palíndromo.");
            }
        }
        
        teclado.close();
    }
}
