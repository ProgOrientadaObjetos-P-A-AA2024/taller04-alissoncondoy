/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author InnoVausuario
 */
public class PagoInstituto {
     private String nombre;
       private String apellido;
       private double sueldoBasico;
       private double sueldoTotal;
       private String cedula;
       
       
       public PagoInstituto(String n, String p, double b, String c){
           nombre = n;
           apellido = p;
           sueldoBasico = b;
           cedula = c;
       }
       
       public PagoInstituto(String n, String p, String c){
           nombre = n;
           apellido = p;
           sueldoBasico = 150;
           cedula = c;
       }
       
        public void establecerNombre(String x){
            nombre = x; 
        }
        
        public void establecerApellido(String x){
            apellido = x;
        }
        
        public void establecerSueldoBasico(double x){
            sueldoBasico = x;
        }
        
        public void calcularSueldoTotal(){
            sueldoTotal = sueldoBasico + (0.2 * sueldoBasico);
        }
        
        public void establecerCedula(String x){
            cedula = x;
        }
        
        public String obtenerNombre(){
            return nombre; 
        }
        
        public String obtenerApellido(){
            return apellido;
        }
        
        public double obtenerSueldoBasico(){
            return sueldoBasico;
        }
        
        public double obtenerSueldoTotal(){
            return sueldoTotal;
        }
        
        public String obtenerCedula(){
            return cedula;
        }
        
        public String toString(){
            String cadena = String.format("Pago Profesores\n"
                    + "Nombre: %s\n"
                    + "Apellido: %s\n"
                    + "Sueldo basico: %.2f\n"
                    + "Sueldo total: %.2f\n"
                    + "Cedula: %s\n", obtenerNombre(), obtenerApellido(),
                    obtenerSueldoBasico(), obtenerSueldoTotal(), 
                    obtenerCedula());
            return cadena;
        }
}
