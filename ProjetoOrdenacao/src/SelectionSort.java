public class SelectionSort {
    public static int[] ordenar(int[] v) {
        int[] a = v.clone();
        int trocas = 0, iteracoes = 0;

        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                iteracoes++;
                if (a[j] < a[min]) min = j;
            }
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
                trocas++;
            }
        }

        System.out.println("SelectionSort -> trocas: " + trocas + ", interações: " + iteracoes);
        return a;
    }
}
