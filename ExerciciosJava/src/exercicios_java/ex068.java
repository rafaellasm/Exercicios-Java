package exercicios_java;

public class ex068 {
    public static void main(String[] args) {
        System.out.println("Números pares de 1 a 50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}