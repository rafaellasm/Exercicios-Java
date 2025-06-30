package exercicios_java;

import java.util.Scanner;

public class ex046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numLimite = scanner.nextInt();

        int somaDosPares = 0;
        int numeroAtual = 1;

        while (numeroAtual <= numLimite) {
            if (numeroAtual % 2 == 0) {
                somaDosPares += numeroAtual;
            }
            numeroAtual++;
        }

        System.out.println("A soma de todos os números pares de 1 até " + numLimite + " é de:  " + somaDosPares);
    }
}