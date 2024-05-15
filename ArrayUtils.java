/**
 * Clase ArrayUtils: contiene implementaciones de rutinas fundamentales
 * sobre arreglos.
 *
 * @author N. Aguirre
 * @version 0.1
 */
public class ArrayUtils
{
       
   
    public boolean pertenece(int elem, int[] arreglo) {
        if (arreglo.length == 0)
            throw new IllegalArgumentException("Arreglo nulo");
            boolean found = false;
            int i = 0;
        while( i < arreglo.length && !found)
        {
            if( elem == arreglo[i])
            {
                found = true;
            }
         i++;
        }
        return found;
    }
   

    /**
     * Calcula la suma de los elementos de un arreglo de enteros
     */
    public int suma(int[] arreglo) {
        if (arreglo.length == 0)
            throw new IllegalArgumentException("Arreglo nulo");
        int suma = 0;
        for(int item : arreglo)
        {
            suma = suma + item;
        }
        return suma;
    }
   
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        if (arreglo.length == 0)
            throw new IllegalArgumentException("Arreglo nulo");
        float min = arreglo[0];
        for( int i = 1 ; i < arreglo.length ; i++)
        {
            if(arreglo[i] < min){
                min = arreglo[i];
            }
        }
        return min;
        }
   
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        if (arreglo.length == 0)
            throw new IllegalArgumentException("Arreglo nulo");
        float max = arreglo[0];
        for( int i = 1 ; i < arreglo.length ; i++)
        {
            if(arreglo[i] > max){
                max = arreglo[i];
            }
        }
        return max;
        }    
   
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        if (arreglo.length == 0)
            throw new IllegalArgumentException("Arreglo nulo");
        float suma = 0;
        for(float aux : arreglo)
        {
            suma = suma + aux;
        }
        return suma/arreglo.length ;
    }
   
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
public int[] fibSequence(int n) {
    assert n > 0: "Ingrese una posición válida";

    int[] arreglo = new int[n];
    if (n >= 1) {
        arreglo[0] = 0;
    }
    if (n >= 2) {
        arreglo[1] = 1;
    }
    for (int i = 2; i < n; i++) {
        arreglo[i] = arreglo[i - 1] + arreglo[i - 2];
    }

    return arreglo;
}
    



   
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
   
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
                if (arr1 != null && arr2 != null)
            throw new IllegalArgumentException("Almenos un Arreglo es nulo");
        boolean sonIguales = true;
        if( arr1.length == arr2.length)
        {
            int i = 0;
            while(i < arr1.length && sonIguales)
            {
                sonIguales = arr1[i] == arr2[i];
                i++;
            }
        }else{
            sonIguales = false;
        }
        return sonIguales;
    }
   
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        assert arreglo.length > 0 : "Arreglo vacio";

       boolean repetidos = false;
       int i = 0;
       int j = 0;
       while(i < arreglo.length && !repetidos)
       {
           j = i + 1;
           while(j < arreglo.length && !repetidos)
           {
               repetidos = arreglo[i] == arreglo[j];
               j++;
           }
           i++;;
       }
            
        return repetidos;
    }
   
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        assert arreglo.length > 0 : "Arreglo vacio";

       boolean opuestos = false;
       int i = 0;
       int j = 0;
       while(i < arreglo.length && !opuestos)
       {
           j = i + 1;
           while(j < arreglo.length && !opuestos)
           {
               opuestos = arreglo[i] + arreglo[j] == 0;
               j++;
           }
           i++;;
       }
            
        return opuestos;
        
    }
   
}

