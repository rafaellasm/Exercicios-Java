package exercicios_java;

public class ex067 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
        }
        System.out.println("A soma de todos os números de 1 a 100 é: " + soma);
    }
}