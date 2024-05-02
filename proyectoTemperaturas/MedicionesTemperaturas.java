import java.util.ArrayList;

/**
 * MedicionesTemperaturas representa una lista de mediciones de temperaturas
 * de una estación meteorológica. Las temperaturas están en grados centígrados
 * 
 * @author N. Aguirre 
 * @version 0.1
 */

import java.util.ArrayList;

public class MedicionesTemperaturas
{
    
    // lista de mediciones tomadas en la estacion meteorologica.
    private ArrayList<Float> mediciones;
    
    /**
     * Constructor de MedicionesTemperaturas. Crea la lista de mediciones vacía.
     */
    public MedicionesTemperaturas()
    {
        mediciones = new ArrayList<Float>();
    }
    
    /**
     * Agrega una nueva medicion de temperatura
     */
    public void agregarMedicion(float nuevaTemperatura) {
        assert nuevaTemperatura >= -273.15f: "Temperatura no valida";
        mediciones.add(nuevaTemperatura);
    }
    
    /**
     * Imprime la lista de temperaturas/mediciones
     */
    public void imprimirTemperaturas()
    {
        System.out.println("Temperaturas Registradas:");
        for (Float temp: mediciones) {
            System.out.println(temp + "C");
        }
    }
    
    /**
     * Calcula el promedio de temperaturas. 
     * Precondicion: debe haber al menos una temperatura cargada para que el promedio tenga sentido.
     */
    public float promedioTemperaturas()
    {
        assert mediciones.size() > 0: "debe haber al menos una temperatura cargada para calcular el promedio";
        float suma = 0;
        for (Float temp: mediciones) {
            suma = suma + temp;
        }
        return suma / mediciones.size();
    }
    
    /**
     * Calcula cantidad de registros de temperaturas negativas (sub cero)
     */
    public int cantidadRegistrosSubCero() {
        int negativas = 0;
        for (Float temp: mediciones) {
            if (temp < 0) {
                negativas = negativas + 1;
            }
        }
        return negativas;
    }
    public int cantTemperaturasExtremas()
    {
        int contadorTemp = 0 ;
        for(Float medicion: mediciones)
        {
            if(medicion > 35 || medicion < -15)
            {
                contadorTemp++ ;
            }
        }
        return contadorTemp;
    } 
    
    /**
     * Cuenta cuantas veces esta consecutivamente la temperatura tempConsec
     * si se corta la secuencia de consecutivo el contador se resetea y se guarda su valor en maxContador
     * luego comparo cual es la secuencia de consecutivos mayor y la retorno
     */
    public int cantidadConsec(float tempConsec)
    {
        assert mediciones.size() >= 1: "No hay mediciones";
        int contador = 0;
        int maxContador = 0;
        for(Float auxRecorrer: mediciones)
        {
            if(auxRecorrer == tempConsec)
            {
                contador++;
                if(contador > maxContador){
                    maxContador = contador;
                }
                
            }else{
                contador = 0;
            }
    
        }
        return maxContador;
    }
}
