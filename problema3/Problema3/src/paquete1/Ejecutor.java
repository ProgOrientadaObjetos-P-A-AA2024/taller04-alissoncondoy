/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.MatriculaVehiculo;
/**
 *
 * @author InnoVausuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatriculaVehiculo vehiculo1 = new MatriculaVehiculo("1717670168", "Toyota", 2006, 25000);
        vehiculo1.calcularValorMatricula();
        MatriculaVehiculo vehiculo2 = new MatriculaVehiculo("1717670168", "Hyundai", 2010);
        vehiculo2.calcularValorMatricula();
        
        
        System.out.printf("%s\n", vehiculo1);
        System.out.printf("%s\n", vehiculo2);
    }
    
}
