package exercicios_java;

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 12) {
            System.out.println("Você é uma criança.");
        } else if (idade < 18) {
            System.out.println("Você é um adolescente.");
        } else if (idade < 60) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um idoso.");
        }
    }
}
