public class Main {
    public static void main(String[] args) {
        int[] mut = {1, 2, 3, 4, 5, 6};

        System.out.println("E os valores do vetor não multiplicado, são: ");

        for (int i = 0; i < mut.length; i++) {
            System.out.print(mut[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < mut.length; i++) {
            mut[i] *= 2;
        }

        System.out.println("Os valores do vetor multiplicado, são: ");

        for (int i = 0; i < mut.length; i++) {
            System.out.print(mut[i] + " ");
        }
    }
}
