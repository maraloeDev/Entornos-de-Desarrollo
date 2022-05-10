/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3___PatronAdaptador;

/**
 *
 * @author Eduardo
 */
public class ImpresoraTexto extends Impresora{
    
    public ImpresoraTexto (String texto){
        super();
        setTexto(texto);
    }
    
    @Override
    
    public void imprimir(){
        
        System.out.println("Fichero texto con " +getTexto());
    }
    
}
