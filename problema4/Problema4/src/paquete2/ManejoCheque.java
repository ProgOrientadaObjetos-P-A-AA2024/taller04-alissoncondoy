/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author InnoVausuario
 */
public class ManejoCheque {
    private String nombre;
    private String nombreBanco;
    private double valorCheque;
    private double valorComision;
    
    
    public ManejoCheque(String n, String b, double v){
        nombre = n;
        nombreBanco = b;
        valorCheque = v;
    }
    
    public ManejoCheque(String n, String b){
        nombre = n;
        nombreBanco = b;
        valorCheque = 5000;
    }
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerNombreBanco(String x){
        nombreBanco = x;
    }
    
    public void establecerValorCheque(double x){
        valorCheque = x;
    }
    
    public void calcularValorComision(){
        valorComision = valorCheque * 0.00003;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerNombreBanco(){
        return nombreBanco;
    }
    
    public double obtenerValorCheque(){
        return valorCheque;
    }
    
    public double obtenerValorComision(){
        return valorComision;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("CHEQUE\n"
                + "Nombre Cliente: %s\n"
                + "Nombre Banco: %s\n"
                + "Valor cheque: %.2f\n"
                + "Valor comision: %.2f\n", obtenerNombre(),
                obtenerNombreBanco(),obtenerValorCheque(), 
                obtenerValorComision());
        return cadena;
    }
}
