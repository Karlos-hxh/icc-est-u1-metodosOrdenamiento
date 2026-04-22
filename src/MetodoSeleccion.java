public class MetodoSeleccion {

    // ESTO ES LO QUE TE FALTA: El constructor para que App.java no dé error
    public MetodoSeleccion(int[] arr) {
        // No necesita hacer nada por dentro si vas a pasar el arreglo 
        // directamente a los métodos sort, pero debe existir.
    }

    // Tu método de selección (Ascendente)
    public void sort(int[] arr) {
        int tam = arr.length;
        for (int i = 0; i < tam - 1; i++) {
            int indiceDelMenor = i;
            for (int j = i + 1; j < tam; j++) {
                if (arr[indiceDelMenor] > arr[j]) {
                    indiceDelMenor = j;
                }
            }
            if (i != indiceDelMenor) {
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;
            }
        }
    }

    // Tu método para imprimir
    public void printArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    // El que pediste para que se ordene al revés (Descendente)
    public void sortDescendente(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceDelMayor = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[indiceDelMayor] < arr[j]) { // Cambiado a < para descendente
                    indiceDelMayor = j;
                }
            }
            if (i != indiceDelMayor) {
                int aux = arr[i];
                arr[i] = arr[indiceDelMayor];
                arr[indiceDelMayor] = aux;
            }
        }
    }
}