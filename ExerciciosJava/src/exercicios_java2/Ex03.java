package exercicios_java2;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.println(nome);
        }

    }
}
