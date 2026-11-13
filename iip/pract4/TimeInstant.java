package pract4;

/**
 * Clase TimeInstant. 
 * Esta clase permite representar instantes o marcas de tiempo 
 * (Timestamp) con detalle de horas y minutos. Así, la clase 
 * representa un instante de tiempo o momento del día, en este 
 * caso, las horas y los minutos de un día cualquiera.
 *
 * @author IIP - ETSINF - UPV 
 * @version Curso 2026-27
 */
public class TimeInstant {
    // ATRIBUTOS:
    /** Variable entera para almacenar las horas. */
    private int hours;
    
    /** Variable entera para almacenar los minutos. */
    private int minutes;   
    
    // CONSTRUCTORES:
    /**
     *  Crea un TimeInstant con el valor de las horas y los minutos
     *  que recibe como argumentos, iniHours e iniMinutes, respectivamente. 
     *  Precondición: 0 <= iniHours < 24, 0 <= iniMinutes < 60.
     */   
    public TimeInstant(int iniHours, int iniMinutes){
        if((0 <= iniHours && iniHours < 24) && (0 <= iniMinutes && iniMinutes < 60)){
            this.hours = iniHours;
            this.minutes = iniMinutes;   
        }
    }
    
    /**
     * Crea un TimeInstant con el valor del instante 
     * actual UTC (tiempo universal coordinado).
     */
    public TimeInstant(){
        long tMinTotal = System.currentTimeMillis() / (60 * 1000);// min desde epoch
        int tMinCurrent = (int) (tMinTotal % (24 * 60));// min desde 00:00 de hoy
        
        int hC = (tMinCurrent / 60);
        int mC = (tMinCurrent % 60);
        
        this.hours = hC;
        this.minutes = mC;
    }
   
    // CONSULTORES Y MODIFICADORES:
    
    /** Devuelve las horas del TimeInstant. */ 
    public int getHours(){
        return hours;
    }
    
    /** Devuelve los minutos del TimeInstant. */
    public int getMinutes(){
        return minutes;
    }
    
    /** Actualiza las horas del TimeInstant. 
     * Precondición: 0 <= hh < 24.     */ 
    public void setHours(int hh){
        if(0 <= hh && hh < 24){
            this.hours = hh;
        }
    }
   
    /** Actualiza los minutos del TimeInstant. 
     * Precondición: 0 <= mm < 60.     */ 
    public void setMinutes(int mm){
        if(0 <= mm && mm < 60){
            this.minutes = mm;
        }
    }
   
    // OTROS MÉTODOS:
    /** Devuelve el TimeInstant en el formato "hh:mm". */
    @Override
    public String toString(){
        // return hours / 10 + "" + hours % 10 + ":" + minutes / 10 + "" + minutes % 10;
        
        String hoursText = "0" + hours;
        hoursText = hoursText.substring(hoursText.length() - 2);
        
        String minutosText = "0" + minutes;
        minutosText = minutosText.substring(minutosText.length() - 2);
        
        return hoursText + ":" + minutosText;
    }
   
    /** Devuelve true sii o es un objeto de la clase 
     *  TimeInstant y sus horas y minutos coinciden con 
     *  los del objeto en curso this. 
     */
    @Override
    public boolean equals(Object o){
        return o instanceof TimeInstant t
            && this.hours == t.hours
            && this.minutes == t.minutes;
    }
    
    /** Devuelve el número de minutos transcurridos desde las 00:00 
     *  hasta el instante representado por this.
     */
    public int toMinutes(){
        return this.hours * 60 + this.minutes;
    }
    
    /** Compara cronológicamente el instante del objeto en curso con 
     *  el del objeto de la clase TimeInstant referenciado por tInstant. 
     *  El resultado es negativo si this es anterior a tInstant, 
     *  cero si son iguales, y positivo si this es posterior a tInstant. 
     *  Se calcula como la resta entre la conversión a minutos 
     *  de ambos objetos.
     */
    public int compareTo(TimeInstant tInstant){
        return this.toMinutes() - tInstant.toMinutes();
    }

    // ACTIVIDAD EXTRA:
    /** Devuelve un TimeInstant a partir de la descripción 
     *  textual (String) en formato "hh:mm".
     */
    /* COMPLETAR */
  
}
