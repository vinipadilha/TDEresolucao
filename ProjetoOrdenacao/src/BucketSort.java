public class BucketSort {
    public static int[] ordenar(int[] v) {
        int[] a = v.clone();
        int max = a[0], min = a[0];
        int trocas = 0, iteracoes = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for (int i = 0; i < a.length; i++) {
            iteracoes++;
            count[a[i] - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                a[index++] = i + min;
                count[i]--;
                trocas++;
            }
        }

        System.out.println("BucketSort -> trocas: " + trocas + ", interações: " + iteracoes);
        return a;
    }
}
