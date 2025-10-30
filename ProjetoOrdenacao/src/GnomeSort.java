public class GnomeSort {
    public static int[] ordenar(int[] v) {
        int[] a = v.clone();
        int i = 1;
        int trocas = 0, iteracoes = 0;

        while (i < a.length) {
            iteracoes++;
            if (i == 0 || a[i - 1] <= a[i]) {
                i++;
            } else {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
                trocas++;
                i--;
            }
        }

        System.out.println("GnomeSort -> trocas: " + trocas + ", interações: " + iteracoes);
        return a;
    }
}
