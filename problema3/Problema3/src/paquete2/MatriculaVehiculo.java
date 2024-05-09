/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author InnoVausuario
 */
public class MatriculaVehiculo {
    private String cedula;
    private String marca;
    private int anio;
    private double valorVehiculo;
    private double valorMatricula;
    
    public MatriculaVehiculo(String c, String m, int a, double v){
        cedula = c;
        marca = m;
        anio = a;
        valorVehiculo = v;
    }
    
    public MatriculaVehiculo(String c, String m, int a){
        cedula = c;
        marca = m;
        anio = a;
        valorVehiculo = 15000;
    }
    
    public void establecerCedula(String x){
        cedula = x;
    }

    public void establecerMarca(String x){
        marca = x;
    }
    
    public void establecerAnio(int x){
        anio = x;
    }
    
    public void establecerValorVehiculo(double x){
        valorVehiculo = x;
    }
    
    public void calcularValorMatricula(){
        valorMatricula = (0.00002 * valorVehiculo) * (2024 - anio);
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public int obtenerAnio(){
        return anio;
    }
    
    public double obtenerValorVehiculo(){
        return valorVehiculo;
    }
    
    public double obtenerValorMatricula(){
        return valorMatricula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Caracteristicas del Vehiculo\n"
                + "Cedula: %s\n"
                + "Marca: %s\n"
                + "Año: %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor de la matricula: %.2f\n", obtenerCedula(), 
                obtenerMarca(), obtenerAnio(), obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    
  
    
    }
    
}
