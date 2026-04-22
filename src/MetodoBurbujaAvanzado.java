public class MetodoBurbujaAvanzado {

    int[] arreglo;

    public MetodoBurbujaAvanzado(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public void sort(boolean asc) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        boolean huboIntercambios;

        for (int i = 0; i < tam - 1; i++) {
            huboIntercambios = false;
            for (int j = 0; j < tam - 1 - i; j++) {
                // Comparación
                contComparaciones++;
                
                if (asc) {
                    // Orden Ascendente
                    if (arreglo[j] > arreglo[j + 1]) {
                        intercambiar(j, j + 1);
                        contCambios++;
                        huboIntercambios = true;
                    }
                } else {
                    // Orden Descendente
                    if (arreglo[j] < arreglo[j + 1]) {
                        intercambiar(j, j + 1);
                        contCambios++; // Agregado aquí también para que cuente en descendente
                        huboIntercambios = true;
                    }
                }
            }
            
            // Si en una vuelta completa no hubo cambios, terminamos (Optimización)
            if (!huboIntercambios) {
                break;
            }
        }
        
        // Estos deben estar DENTRO del método sort, antes de la última llave
        System.out.println("Comparaciones = " + contComparaciones);
        System.out.println("Cambios = " + contCambios);
    }

    // Método auxiliar para no repetir código de intercambio
    private void intercambiar(int i, int j) {
        int aux = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;
    }

    public void printArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i == arreglo.length - 1 ? "" : " , "));
        }
        System.out.println();
    }
}