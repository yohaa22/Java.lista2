import java.util.Scanner;

    public class Exercicio09 {
        

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] vetor1 = new int[5];
            int[] vetor2 = new int[5];

            System.out.println("Digite os elementos do primeiro vetor:");
            for (int i = 0; i < vetor1.length; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                vetor1[i] = scanner.nextInt();
            }

            System.out.println("\nDigite os elementos do segundo vetor:");
            for (int i = 0; i < vetor2.length; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                vetor2[i] = scanner.nextInt();
            }


    //int[] vetor3 = new int[6];

    int numero = vetor1[0];
    int numero2 =vetor1[2];
    int numero4 =  vetor1[4];


    int numero1 = vetor2[1];
    int numero3 =vetor2[3];



    //  System.out.println("o valor 1 é : " + numero4 + 
    // "\n o valor 2 é : " + numero5 +" \n o valor 3 é:  "+ numero6);






    // System.out.println("o valor 1 é : " + numero + 
    // "\n o valor 2 é : " + numero2 +" \n o valor 3 é:  "+ numero3);



    int[] vetor3 ={ numero,numero1, numero2, numero3,numero4, };



    System.out.print("Vetor3: ");
    for (int i = 0; i < vetor3.length; i++) {
        System.out.print(vetor3[i] + " ");
    }




    }

    }