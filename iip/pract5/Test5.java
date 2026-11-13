package pract5;

import java.util.Scanner;
import java.util.Locale;
/**
 * Clase {@code Test5}: permite probar parte de la funcionalidad 
 * de la clase {@link DateTime}, en cuyo main se deben realizar 
 * las siguientes acciones:<br>
 * a. Solicitar al usuario que introduzca desde teclado los valores 
 *    de horas, minutos, día, mes y anyo.
 * b. Si los datos no corresponden a un instante y una fecha correctos, 
 *    mostrar un mensaje por pantalla.
 * c. Si lo son:
 *    - Crear un DateTime dT con estos datos.
 *    - Crear un DateTime now con la fecha y el instante UTC actuales.
 *    - Comparar dT y now.
 *    - Mostrar por pantalla si dT es anterior, posterior o igual a now.
 *    
 * @author IIP 
 * @version Curso 2026-27
 */
public class Test5 {
    /** No hay objetos de esta clase. */
    private Test5() { }
    
    /**
     * Método principal.
     * @param args array de {@link String}.
     */
    public static void main(String[] args) {
        // a. Solicitar al usuario que introduzca desde teclado los valores 
        //    de horas, minutos, día, mes y anyo.
        Scanner kbd = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Horas? ");
        int hours = kbd.nextInt();
        System.out.print("Minutos? ");
        int minutes = kbd.nextInt();
        System.out.print("Día? ");
        int day = kbd.nextInt();
        System.out.print("Mes? ");
        int month = kbd.nextInt();
        System.out.print("Anyo? ");
        int year = kbd.nextInt();
        
        // COMPLETAR
        // b. Si los datos no corresponden a un instante y una fecha correctos, 
        //    mostrar un mensaje por pantalla.
        // c. Si lo son:
        //    - Crear un DateTime dT con estos datos.
        //    - Crear un DateTime now con la fecha y el instante UTC actuales.
        //    - Comparar dT y now.
        //    - Mostrar por pantalla si dT es anterior, posterior o igual a now.
        if(DateTime.isCorrect(hours, minutes, day, month, year)){
            DateTime dt1 = new DateTime(hours, minutes, day, month, year);
            System.out.println("Creado objeto DateTime");
            DateTime dt2 = new DateTime(13, 11, 2026);
            int res = dt1.compareTo(dt2);
            if(res == 0){
                System.out.println("Son iguales");
            }else if(res < 0){
                System.out.println(dt1.toString() + " es mayor a " + dt2.toString());
            }
            else{
                System.out.println(dt2.toString() + " es mayor a " + dt1.toString());
            }
        }else{
            System.out.println("Datos incorrectos");
        }
    }
}
