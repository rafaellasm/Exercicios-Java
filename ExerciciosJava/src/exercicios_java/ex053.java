package exercicios_java;

public class ex053 {
    public static void main(String[] args) {
        int numeroAtual = 1;
        System.out.println("Números pares de 1 a 50:");

        do {
            if (numeroAtual % 2 == 0) {
                System.out.println(numeroAtual);
            }
            numeroAtual++;
        }
        while (numeroAtual <= 50);
    }
}