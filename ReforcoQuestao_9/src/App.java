import java.util.Scanner;

public class App {
    static final int NUM_AUTOMOVEIS = 5;
    static final double PRECO_LITRO = 5.89;

    static Automovel[] cadastrarAutomoveis(Scanner teclado) {
        Automovel[] frota = new Automovel[NUM_AUTOMOVEIS];

        System.out.println("=== Cadastro dos Automóveis ===");
        for (int i = 0; i < NUM_AUTOMOVEIS; i++) {
            System.out.println("Automóvel " + (i + 1));
            System.out.print("Placa: ");
            String placa = teclado.nextLine();
            System.out.print("Consumo médio (km/l): ");
            double consumo = Double.parseDouble(teclado.nextLine());
            frota[i] = new Automovel(placa, consumo);
        }

        return frota;
    }

    static void registrarRotas(Scanner teclado, Automovel[] frota) {
        System.out.println("\n=== Registro de Rotas ===");
        String resp = "s";
        
        while (resp.equalsIgnoreCase("s")) {
            System.out.print("Registrar rota? (s/n): ");
            resp = teclado.nextLine();
            
            if (!resp.equalsIgnoreCase("s")) {
                break;
            }
            
            System.out.print("Placa do automóvel: ");
            String placa = teclado.nextLine();
            int indice = buscarAutomovel(frota, placa);
            
            if (indice == -1) {
                System.out.println("Placa não encontrada.");
                continue;
            }
            
            System.out.print("Quilometragem da rota: ");
            double km = Double.parseDouble(teclado.nextLine());
            frota[indice].adicionarRota(km);
        }
    }

    static int buscarAutomovel(Automovel[] frota, String placa) {
        for (int i = 0; i < NUM_AUTOMOVEIS; i++) {
            if (frota[i].placa.equalsIgnoreCase(placa)) {
                return i;
            }
        }
        return -1;
    }

    static void gerarRelatorio(Automovel[] frota) {
        int idxMaisKm = 0;
        int idxMaisComb = 0;
        double totalCombustivelGasto = 0;
        double[] combustivelPorAuto = new double[NUM_AUTOMOVEIS];

        for (int i = 0; i < NUM_AUTOMOVEIS; i++) {
            double km = frota[i].totalKm();
            double combustivel = frota[i].totalCombustivel();
            combustivelPorAuto[i] = combustivel;
            totalCombustivelGasto += combustivel;
            
            if (km > frota[idxMaisKm].totalKm()) {
                idxMaisKm = i;
            }
            if (combustivel > frota[idxMaisComb].totalCombustivel()) {
                idxMaisComb = i;
            }
        }

        double totalValorGasto = totalCombustivelGasto * PRECO_LITRO;
        double mediaCombustivel = totalCombustivelGasto / NUM_AUTOMOVEIS;
        int acimaMedia = 0;
        
        for (int i = 0; i < NUM_AUTOMOVEIS; i++) {
            if (combustivelPorAuto[i] > mediaCombustivel) {
                acimaMedia++;
            }
        }

        System.out.println("\n=== Relatório ===");
        System.out.println("Automóvel que percorreu mais km: " + frota[idxMaisKm].placa + " (" + frota[idxMaisKm].totalKm() + " km)");
        System.out.println("Automóvel que mais consumiu combustível: " + frota[idxMaisComb].placa + " (" + String.format("%.2f", frota[idxMaisComb].totalCombustivel()) + " litros)");
        System.out.println("Valor total de combustível gasto: R$" + String.format("%.2f", totalValorGasto));
        System.out.println("Automóveis que gastaram acima da média: " + acimaMedia);
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Automovel[] frota = cadastrarAutomoveis(teclado);
        
        registrarRotas(teclado, frota);
        gerarRelatorio(frota);
        
        teclado.close();
    }
}
