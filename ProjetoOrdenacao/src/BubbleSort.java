public class BubbleSort {
    public static int[] ordenar(int[] v) {
        int[] a = v.clone();
        int n = a.length;
        boolean trocou;
        int trocas = 0, iteracoes = 0;

        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                iteracoes++;
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    trocou = true;
                    trocas++;
                }
            }
            n--;
        } while (trocou);

        System.out.println("BubbleSort -> trocas: " + trocas + ", interações: " + iteracoes);
        return a;
    }
}
