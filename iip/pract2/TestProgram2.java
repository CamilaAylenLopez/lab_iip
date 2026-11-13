package pract2;


/**
 * Write a description of class TestProgram2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestProgram2 {
    private TestProgram2() { }
    
    public static void main(String[] args) {        
        // Inicializar el lugar de dibujo, dándole
        // un nombre y dimensiones:
        Blackboard miPizarra = new Blackboard("UNA VENTANA AL MUNDO", 800, 500);
                
        // Inicializar un círculo amarillo:
        Circle c = new Circle(50, "yellow", 100, 100);        
        // ponerlo en el espacio de dibujo:
        miPizarra.add(c);
        // mostrar por pantalla el perímetro del círculo:
        System.out.println("El perímetro del círculo es " + c.perimeter());
     
        // Inicializar un rectángulo largo y rojo:
        Rectangle r = new Rectangle(400, 100, "black", 300, 300);
        // ponerlo en el espacio de dibujo:
        miPizarra.add(r);  
        
        // Inicializar un triángulo isósceles negro:
        TrIsosceles t = new TrIsosceles(30, 60, "black", 210, 60 );
        // ponerlo en el espacio de dibujo:
         miPizarra.add(t);          
    }
}