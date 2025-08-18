import java.util.Scanner;

public class App {

    static double[] lerNotas(int quantidade, double valorMaximo, Scanner teclado, String tipo){
        double[] notas = new double[quantidade];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + " nota dos(as) " + tipo + ": ");
            double valor = Double.parseDouble(teclado.nextLine());
            if (valor > valorMaximo)
                valor = valorMaximo;
            notas[i] = valor;
        }
        return notas;
    }

    static double calcMediaPonderada(double[] vet, double valorMaximo, double peso){
        double soma = 0d;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        double media = soma/vet.length;
        double proporcao = media / valorMaximo;

        return proporcao * peso;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] exercicios = lerNotas(4,10,teclado,"exercicos");
        double[] provas = lerNotas(2,100,teclado, "provas");
        double[] trabalhos = lerNotas(1,20,teclado, "trabalhos");

        double notaExercicio = calcMediaPonderada(exercicios,10,0.2);
        double notaProva = calcMediaPonderada(provas,100,0.6);
        double notaTrabalho = calcMediaPonderada(trabalhos,10,0.2);

        double notaFinal = (notaExercicio + notaProva + notaTrabalho) * 100; 
        System.out.printf("A nota final é %.2f \n", notaFinal);
    }
}