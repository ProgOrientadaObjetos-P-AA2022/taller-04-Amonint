/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;


public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entidad est1 = new Entidad(8.5, 6.2, 8.9);
        Entidad est2 = new Entidad("Abraham Ayala");
        
        est1.establecerNombre("Rene Elizalde");
        est1.calcularPromedio();
        
        est2.establecerNota1(1.2);
        est2.establecerNota2(2.8);
        est2.establecerNota3(3.45);
        est2.calcularPromedio();
        
        System.out.printf("%s\n", est1);
        System.out.printf("\n%s\n", est2);
    }
    
}
