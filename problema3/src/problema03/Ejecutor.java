/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema03;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automotor auto1 = new Automotor();
        Automotor auto2 = new Automotor("Subaru", 2014);
        
        auto1.calcularMatricula();
        
        auto2.establecerCedula("342342387");
        auto2.establecerValorVehi(80990);
        auto2.calcularMatricula();
        
        System.out.printf("%s\n", auto1);
        System.out.printf("\n%s\n", auto2);
        
    }
    
}
