public class MetodoBurbuja {

    int[] arreglo;

    // Constructor
    public MetodoBurbuja(int[]arreglo){
        System.out.println("Se creo la clase Metodo Burbuja" );

        //1er FORMA
        //Instanciar con valor creado en constructor
        this.arreglo =new int[] {10,5,8,0,7};

        //2da FORMA
        ////Instanciar con valor desde parametro
        this.arreglo  = arreglo;
    }

    public void ordenarAcendente(){
        for(int i =0; i<arreglo.length;i++){
            for(int j=i+1 ; j<arreglo.length;j++){
                 if(arreglo[i] > arreglo[j]){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j]= aux;
                 }
            }
        }
    }
    public void imprimirArreglo(){
        for (int num : arreglo) {
            System.out.print(num + ",");
            
        }
        System.out.println();
    }
    public void ordenarDecendente(){
        for(int i =0; i<arreglo.length;i++){
            for(int j=i+1 ; j<arreglo.length;j++){
                 if(arreglo[i] < arreglo[j]){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j]= aux;
                 }
            }
        }
    }
}

