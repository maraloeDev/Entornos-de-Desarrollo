/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3___PatronAdaptador;

/**
 *
 * @author Eduardo
 */
public abstract class Impresora {
    
    private String texto;
    public String getTexto(){
        
        return texto;
    }
    
    public void setTexto (String texto){
        
        this.texto = texto;
    }
    
    public void generarFichero(String texto){
        
        System.out.println("fichero con impresora " + texto);
    }
    
    public abstract void imprimir();
    
}
