/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3___PatronAdaptador;

/**
 *
 * @author Eduardo
 */
public class ImpresoraWord extends Impresora {

    
    private final ImpresoraWord impresoraWord;
    
    public ImpresoraWord(String texto) {
        
        super();
        impresoraWord  = new ImpresoraWord(texto);
    }


    @Override

    public void imprimir() {
        impresoraWord.generarFichero(getTexto());
    }
}
