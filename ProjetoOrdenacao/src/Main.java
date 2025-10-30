public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        System.out.println("\n===== VETOR 1 =====");
        CombSort.ordenar(vetor1);
        GnomeSort.ordenar(vetor1);
        BucketSort.ordenar(vetor1);
        BubbleSort.ordenar(vetor1);
        SelectionSort.ordenar(vetor1);
        CocktailSort.ordenar(vetor1);

        System.out.println("\n===== VETOR 2 =====");
        CombSort.ordenar(vetor2);
        GnomeSort.ordenar(vetor2);
        BucketSort.ordenar(vetor2);
        BubbleSort.ordenar(vetor2);
        SelectionSort.ordenar(vetor2);
        CocktailSort.ordenar(vetor2);

        System.out.println("\n===== VETOR 3 =====");
        CombSort.ordenar(vetor3);
        GnomeSort.ordenar(vetor3);
        BucketSort.ordenar(vetor3);
        BubbleSort.ordenar(vetor3);
        SelectionSort.ordenar(vetor3);
        CocktailSort.ordenar(vetor3);
    }
}
