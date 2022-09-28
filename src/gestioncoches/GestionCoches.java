
package gestioncoches;

import test.vehiculo;

/*
- Matrícula: String
- Marca: String 
- Modelo: String
- Color: String
- Tarifa: Double
- Disponible : Boolean

Instanciar dos objetos y mostrarlos por pantalla

*/
public class GestionCoches {

    public static void main(String[] args) {
        
        vehiculo C1 = new vehiculo ("WWWW-343","Renault","Logan","Gris",15.99,true);
        vehiculo C2 = new vehiculo ("XSAW-564","Chevrolet","Optra","Negro",17.99,true);     
        System.out.println(C1);
        System.out.println(C2);
    }
    
}
