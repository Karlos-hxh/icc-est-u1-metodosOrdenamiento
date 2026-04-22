public class App {
    public static void main(String[] args) throws Exception {
        // Ejecuta el burbuja normal
        metodoBurbuja();

        // Ejecuta el burbuja con comparaciones y cambios (lo que sale en tu foto)
        runMetodoBurbujaAvanzado();

        // AQUÍ ESTÁ EL TRUCO: Debes llamar a este para que se imprima la selección
        runSeleccion(); 
    }

    public static void metodoBurbuja() {
        System.out.println("Metodo Burbuja");
        int[] arreglo = new int[] { 10, -5, 0, 2, 7 };
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);
        
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarAcendente();
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarDecendente();
        metodoBurbuja.imprimirArreglo();
    }

    public static void runMetodoBurbujaAvanzado() {
        int[] arreglo = new int[]{10, 50, 20, 30, 0, -10, 15};
        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);

        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(true);
        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(false);
        mBurbujaAvanzado.printArreglo();
    }

    public static void runSeleccion() {
        System.out.println("Metodo Seleccion ");
        int[] arr = new int[]{ 1, 10, 7, 9, 0, 1, 3, 4 };
        MetodoSeleccion mSeleccion = new MetodoSeleccion(arr);
        
        mSeleccion.printArreglo(arr);
        mSeleccion.sort(arr);           // Ascendente
        mSeleccion.printArreglo(arr);
        mSeleccion.sortDescendente(arr); // Al revés (el que agregamos)
        mSeleccion.printArreglo(arr);
    }
}