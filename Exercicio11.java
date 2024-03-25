import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }

        System.out.println("\nO produto escalar entre os vetores A e B é: " + produtoEscalar);

        scanner.close();
    }
}
