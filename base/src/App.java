/*
5) Implemente um programa que receba uma string e faça uma impressão estilizada de acordo com o exemplo abaixo, para a string OBJETO

O
OB
OBJ
OBJE
OBJET
OBJETO
OBJET
OBJE
OBJ
OB
O

*/

import java.util.Scanner;

public class App {

    static String digitaPalavra(Scanner teclado){
        String objeto;

        System.out.println("Digite a palavra desejada: ");
        objeto = teclado.nextLine();

        return objeto;
    }

    static int verifcaLetras(char[] objetoArray){
        int quant = 0;
        for (int i = 0; i < objetoArray.length; i++) {
            quant = i;
        }
        return quant;
    }
   
    static String preencheFiltro(char[] objetoArray, int quantidadeDeLetrasArray){
        String current = "";

        for (int i = 0; i < quantidadeDeLetrasArray*2; i++) {
            if (quantidadeDeLetrasArray > i){
            current += objetoArray[i];
            System.out.println(current);
            } else {
                //current i= objetoArray[i];
                //System.out.println(current);

                //Uso de Ia nessa parte 
                //Nao sabia outra forma de fazer alem do -=, porem nao funcionava nessa questao
                if (current.length() > 0) {
                    current = current.substring(0, current.length() - 1);
                }
                System.out.println(current);
            }
            
        }
        return current;

    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in); 
        String objeto = digitaPalavra(teclado);
        char[] ObjetoArray =  objeto.toCharArray();
        int quantidadeDeLetrasArray = verifcaLetras(ObjetoArray);
        System.out.println(preencheFiltro(ObjetoArray, quantidadeDeLetrasArray));
        
    
    }
}
