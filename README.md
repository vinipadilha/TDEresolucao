========================================================
        COMPARATIVO DE ALGORITMOS DE ORDENAÇÃO
 Disciplina: Resolução de Problemas Estruturados em Computação
========================================================


ALGORITMOS IMPLEMENTADOS
--------------------------------------------------------
- Comb Sort
- Gnome Sort
- Bucket Sort
- Bubble Sort (com flag de parada)
- Selection Sort
- Cocktail Sort

(Implementação sem uso de Arrays.sort(), ArrayList etc.)


========================================================
TABELAS DE RESULTADOS
========================================================


VETOR 1 (DESORDENADO)
--------------------------------------------------------
Algoritmo       | Trocas | Iterações
----------------|--------|-----------
Comb Sort       |   22   |   129
Gnome Sort      |   78   |   175
Bucket Sort     |   20   |    20
Bubble Sort     |   78   |   180
Selection Sort  |   18   |   190
Cocktail Sort   |   78   |   154

Melhor em trocas: Selection Sort
Melhor em iterações: Bucket Sort


VETOR 2 (ORDENADO)
--------------------------------------------------------
Algoritmo       | Trocas | Iterações
----------------|--------|-----------
Comb Sort       |   0    |   110
Gnome Sort      |   0    |    19
Bucket Sort     |   20   |    20
Bubble Sort     |   0    |    19
Selection Sort  |   0    |   190
Cocktail Sort   |   0    |    19

Melhor em trocas: Empate (Comb, Gnome, Bubble, Selection, Cocktail)
Melhor em iterações: Gnome, Bubble e Cocktail Sort (19)


VETOR 3 (ORDENADO DECRESCENTE)
--------------------------------------------------------
Algoritmo       | Trocas | Iterações
----------------|--------|-----------
Comb Sort       |   18   |   129
Gnome Sort      |   190  |   399
Bucket Sort     |   20   |    20
Bubble Sort     |   190  |   190
Selection Sort  |   10   |   190
Cocktail Sort   |   190  |   190

Melhor em trocas: Selection Sort
Melhor em iterações: Bucket Sort


========================================================
RANKINGS GERAIS
========================================================


MENOS TROCAS (MÉDIA GERAL)
--------------------------------------------------------
Posição | Algoritmo       | Média de Trocas
--------|-----------------|----------------
1º      | Selection Sort  | 9.33
2º      | Comb Sort       | 13.33
3º      | Bucket Sort     | 20.00
4º      | Cocktail Sort   | 89.33
5º      | Gnome Sort      | 89.33
6º      | Bubble Sort     | 89.33


MENOS ITERAÇÕES (MÉDIA GERAL)
--------------------------------------------------------
Posição | Algoritmo       | Média de Iterações
--------|-----------------|--------------------
1º      | Bucket Sort     | 20.00
2º      | Gnome Sort      | 197.66
3º      | Comb Sort       | 122.66
4º      | Cocktail Sort   | 121.00
5º      | Bubble Sort     | 129.66
6º      | Selection Sort  | 190.00


========================================================
CONCLUSÕES
========================================================

- Bucket Sort apresentou o melhor desempenho em iterações, funcionando próximo do tempo linear.
- Selection Sort foi o que menos realizou trocas, pois troca apenas uma vez por posição.
- Comb Sort apresentou um bom equilíbrio entre trocas e iterações.
- Gnome Sort, Bubble Sort e Cocktail Sort tiveram desempenhos similares em vetores desordenados,
  exigindo muitas trocas e iterações.
- Em vetores ordenados, algoritmos com verificação de flag (Bubble, Cocktail) e avanço adaptativo (Gnome)
  evitam processamento desnecessário.
- Em vetores decrescentes, o Selection Sort realiza menos trocas mesmo com alto número de comparações.

========================================================
