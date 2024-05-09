/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.PagoInstituto;
/**
 *
 * @author InnoVausuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PagoInstituto pago1 = new PagoInstituto("Alisson", "Condoy", 350, "1150261665");
        pago1.calcularSueldoTotal();
        PagoInstituto pago2 = new PagoInstituto("David", "Flores","1103323711");
        pago2.calcularSueldoTotal();
        
        
        System.out.printf("%s\n", pago1);
        System.out.printf("%s\n", pago2);
    }
    
}
