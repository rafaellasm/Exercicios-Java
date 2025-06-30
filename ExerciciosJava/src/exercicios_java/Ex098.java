package exercicios_java;

import java.util.Scanner;

public class Ex098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonal = 0;

        System.out.println("Digite os números para a matriz 3x3:");


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonal);


    }
}
