
import java.util.Scanner;

public class Exercicio02 {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        
        int[] numero = new int[tamanho];


        System.out.println("Digite os números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero[i] = scanner.nextInt();
        }

     
        System.out.println("\nAnalise dos números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + numero[i] + " é ");
            if (numero[i] > 0) {
                System.out.println("positivo");
            } else if (numero[i] < 0) {
                System.out.println("negativo");
            } else {
                System.out.println("zero");
            }
        }

        scanner.close();
    }
}

    

