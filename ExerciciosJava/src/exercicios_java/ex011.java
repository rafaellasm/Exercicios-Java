package exercicios_java;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextFloat();
        System.out.println("Digite seu primeiro numero: ");
        double num2 = scanner.nextFloat();
        System.out.println("Digite seu segundo numero: ");
        double num3 = scanner.nextFloat();
        System.out.println("Digite seu terceiro numero: ");

        double media = (num1+num2+num3)/3;

        System.out.println("A média aritmética é: "+media);
    }
}
