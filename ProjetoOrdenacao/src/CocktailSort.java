public class CocktailSort {
    public static int[] ordenar(int[] v) {
        int[] a = v.clone();
        int inicio = 0, fim = a.length - 1;
        boolean trocou = true;
        int trocas = 0, iteracoes = 0;

        while (trocou) {
            trocou = false;
            for (int i = inicio; i < fim; i++) {
                iteracoes++;
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    trocas++;
                    trocou = true;
                }
            }
            if (!trocou) break;
            trocou = false;
            fim--;
            for (int i = fim - 1; i >= inicio; i--) {
                iteracoes++;
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    trocas++;
                    trocou = true;
                }
            }
            inicio++;
        }

        System.out.println("CocktailSort -> trocas: " + trocas + ", interações: " + iteracoes);
        return a;
    }
}
