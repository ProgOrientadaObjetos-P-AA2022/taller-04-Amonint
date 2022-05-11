/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor prf1 = new Profesor(500);
        Profesor prf2 = new Profesor("Franck", "laure");
        
        prf1.establecerNombre("Abraham");
        prf1.establecerApellido("Ayala");
        prf1.calcularTotal();
        prf1.establecerCedula(11046673);
        
        prf2.establecerBasico(3);
        prf2.calcularTotal();
        prf2.establecerCedula(42);
        
        System.out.printf("%s\n", prf1);
        System.out.printf("\n%s\n", prf2);
        
    }
    
}
