package exercicios_java;

import java.util.Scanner;

public class ex044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int cont = 1;

        while (cont <= 5) {
            System.out.print("Digite o nome da " + cont + "ª pessoa: ");
            String nome = scanner.next();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            cont++;
        }

        double media = (double) somaIdades / 5;
        System.out.println("\nA média de idade das 5 pessoas é: " + media);
    }
}