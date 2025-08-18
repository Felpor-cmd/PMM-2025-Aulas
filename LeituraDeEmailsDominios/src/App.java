import java.util.Arrays;
import java.util.Scanner;

public class App {
    static String lerDominio(Scanner teclado){
        System.out.print("Qual o dominio para filtrar? ");
        return teclado.nextLine();
    }

    static String[] lerEmails(Scanner teclado){
        String[] vetorDeEmails;
        int quantidade;
        System.out.println("Quantos emails serao lidos ?");
        quantidade = Integer.parseInt(teclado.nextLine());
        vetorDeEmails = new String[quantidade];
        for (int j = 0 ; j < vetorDeEmails.length; j++){
            System.out.print("Qual e o " + (j + 1) + " email?");
            vetorDeEmails[j]= teclado.nextLine();
        }
        return vetorDeEmails;
    }
    
    static String[] filtroEmails(String[] emails, String dominio){
        String [] filtrados = new String[emails.length];
        int contador = 0;
        for (int i = 0 ; i < emails.length; i++){
            //int posicao = emails[i].indexOf("@");
            String[] partido =  emails[i].split("@");
            if (partido[1].equals(dominio)){
                filtrados[contador] = emails[i];
                contador ++;
            }
        }
         return Arrays.copyOfRange(filtrados, 0, contador);
    }
 
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String[] emails = lerEmails(teclado);
        String dominio = lerDominio(teclado);
        String [] filtrado = filtroEmails(emails, dominio);
        System.out.println("Emails do dominio "+ dominio);

        for (int i = 0; i < filtrado.length; i++){
            System.out.println(filtrado[i]);
        }
    }
}
