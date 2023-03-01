
package selectionsort;

/**
 *
 * @author lucas.monteiro
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quantidade = 10000;
        int[] vetor = new int[quantidade];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
            /*
     * Impressão dos números gerados Aleatóriamente
     System.out.print(vetor[i]+"\n");
             */
        }

        long tempoInicial = System.currentTimeMillis();

        selectionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    public static void selectionSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < array.length; i++) {
                if (array[i] < array[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }

        /* Impressão da visualização
    * Caso deseje imprimir a ordeção irá implicar no desempenho de sua execução
    for(int x=0; x<vetor.length;x++){
        System.out.print(vetor[x]+"\n");
    }*/
    }

}
