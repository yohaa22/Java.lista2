import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.print("Digite um número n: ");
        int n = scanner.nextInt();

        System.out.println("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }



        System.out.println("\nÍndices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < n) {
                System.out.println("Índice " + i + ": " + numeros[i]);
            }
        }

        scanner.close();
    }
}
