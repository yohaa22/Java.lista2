public class Exercicio08 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9, 10};

        int[] C = new int[A.length + B.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }

        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }

        System.out.print("Vetor C (concatenação de A e B): ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
