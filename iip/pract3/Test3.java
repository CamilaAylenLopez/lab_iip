package pract3;

import java.util.Scanner;
import java.time.LocalTime;

/**
 *  Clase Test3.
 *  Una primera clase con lectura de datos desde teclado, 
 *  y uso de operaciones con int, long, Math y String.
 *  Contiene tres errores de compilacion.
 *  @author IIP 
 *  @version Curso 2026-27 
 */
public class Test3 {
    public static void main(String[] args){
        
        Scanner kbd = new Scanner(System.in);
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca las horas (un entero entre 0 y 23): ");
        int h = kbd.nextInt();
        System.out.print("   -> Introduzca los minutos (un entero entre 0 y 59): ");
        int m = kbd.nextInt();
        String horas = "0" + h;
        horas = horas.substring(horas.length() - 2);
        String minutos = "0" + m;
        minutos = minutos.substring(minutos.length() - 2);
        System.out.println("Hora introducida: " + horas + ":" + minutos);
         
        
        //minutos transcurridos desde las 0:00 horas con hora local
        long tMinTotal = System.currentTimeMillis() / (60 * 1000); // min desde epoch
        int tMinCurrent = (int) (tMinTotal % (24 * 60)); // min desde 00:00 de hoy
        
        System.out.println(tMinTotal + " /// " + tMinCurrent);
        
        //int hC = (int) (tMinTotal / (60 * 60 * 1000));
        int hC = (int) (tMinCurrent / 60);
        int mC = (int) (tMinCurrent % 60);
        
        System.out.println(hC + ":" + mC);
        
        //LocalTime horaActual = LocalTime.now();
        //System.out.println("Hora actual: " + horaActual);
        
        String horas2 = "0" + hC;
        horas2 = horas2.substring(horas2.length() - 2);
        String minutos2 = "0" + mC;
        minutos2 = minutos2.substring(minutos2.length() - 2);
        System.out.println(horas2 + ":" + minutos2);
        
        int tMin = h * 60 + m;
        System.out.println("Minutos transcurridos desde las 00:00 son " + h);
        
        int dif = (int) Math.abs(tMinCurrent - tMin);
        System.out.println("Diferencia entre " + tMinCurrent + " y " + tMin + " es " + dif);
        
        int hDif = (int) (dif / 60);
        int mDif = (int) (dif % 60);
        System.out.println("Diferencia en forma de horas y minutos " + hDif + ":" + mDif);
    }
}
