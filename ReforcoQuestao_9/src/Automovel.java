public class Automovel {
    String placa;
    double consumoKmPorLitro;
    double[] rotas;
    int numRotas;

    public Automovel(String placa, double consumoKmPorLitro) {
        this.placa = placa;
        this.consumoKmPorLitro = consumoKmPorLitro;
        this.rotas = new double[100]; // Vetor fixo para até 100 rotas
        this.numRotas = 0;
    }

    public void adicionarRota(double km) {
        if(numRotas < 100) {
            rotas[numRotas] = km;
            numRotas++;
        }
    }

    public double totalKm() {
        double total = 0;
        for(int i = 0; i < numRotas; i++) {
            total += rotas[i];
        }
        return total;
    }

    public double totalCombustivel() {
        return totalKm() / consumoKmPorLitro;
    }
}
