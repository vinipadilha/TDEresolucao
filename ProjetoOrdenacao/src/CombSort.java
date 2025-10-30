public class CombSort {
    public static int[] ordenar(int[] v) {
        int[] a = v.clone();
        int n = a.length;
        int gap = n;
        boolean trocou = true;
        int trocas = 0, iteracoes = 0;
        double fator = 1.3;

        while (gap > 1 || trocou) {
            gap = (int) (gap / fator);
            if (gap < 1) gap = 1;
            trocou = false;
            for (int i = 0; i + gap < n; i++) {
                iteracoes++;
                if (a[i] > a[i + gap]) {
                    int temp = a[i];
                    a[i] = a[i + gap];
                    a[i + gap] = temp;
                    trocas++;
                    trocou = true;
                }
            }
        }

        System.out.println("CombSort -> trocas: " + trocas + ", interações: " + iteracoes);
        return a;
    }
}
