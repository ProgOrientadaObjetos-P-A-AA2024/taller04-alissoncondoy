/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.ManejoCheque;
/**
 *
 * @author InnoVausuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejoCheque cheque1 = new ManejoCheque("Julio Patiño", "Banco de Loja", 10000);
        cheque1.calcularValorComision();
        ManejoCheque cheque2 = new ManejoCheque("Gabriela Armijos", "Banco de Guayaquil");
        cheque2.calcularValorComision();
        
        System.out.printf("%s\n", cheque1);
        System.out.printf("%s\n", cheque2);
    }
    
}
