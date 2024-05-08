/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.LibretaNotas;
public class Ejecutor {
    public static void main(String[] args) {
        LibretaNotas libreta1 = new LibretaNotas("Alisson", 10, 10, 9);
        libreta1.calcularPromedio();
        LibretaNotas libreta2 = new LibretaNotas("Dalinda", 5, 5);
        libreta2.calcularPromedio();
        
        System.out.printf("%s\n", libreta1);
        System.out.printf("%s\n", libreta2);
        
    }
    
}
