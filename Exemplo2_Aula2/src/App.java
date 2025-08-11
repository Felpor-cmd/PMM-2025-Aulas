import java.util.Scanner;

public class App {
    static int lerQuantidade(Scanner teclado){
        System.out.println("Digite a quantidade de valores que deseja inserir:");
        int quantidade = teclado.nextInt();
        return quantidade;
    }

    static float calcularMedia(int soma, int quantidade){
        return (float)soma / quantidade;
    }

    static int[] lerVetor(int quantidade, Scanner teclado){
        int[] meuvetor = new int[quantidade];
        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite o valor " + (i + 1) + ":");
            meuvetor[i] = teclado.nextInt();
        }
        return meuvetor;
    }

    static int somarVetor(int[] valor){
        int soma = 0;
        for(int i = 0; i < valor.length; i++){
            soma += valor[i];
        }
        return soma;
    }

    public static void main(String[] args) throws Exception {
        int quantidade, soma;
        int[] valor;
        float media;

        Scanner teclado = new Scanner(System.in);

        quantidade = lerQuantidade(teclado);
        valor = lerVetor(quantidade,teclado);
        soma = somarVetor(valor);
        media = calcularMedia(soma,quantidade);
        System.out.println("A soma é " + soma + " e a media é " + media);

    }
}
