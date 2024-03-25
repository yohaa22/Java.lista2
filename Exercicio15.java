import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.print("Digite o primeiro número: ");
        vetor[0] = scanner.nextInt();

        for (int i = 1; i < vetor.length; i++) {
            int novoNumero;
            do {
                System.out.print("Digite o próximo número (maior que " + vetor[i - 1] + "): ");
                novoNumero = scanner.nextInt();
                if (novoNumero <= vetor[i - 1]) {
                    System.out.println("O número inserido deve ser maior que " + vetor[i - 1] + ".");
                }
            } while (novoNumero <= vetor[i - 1]);
            vetor[i] = novoNumero;
        }

        System.out.println("\nVetor preenchido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
