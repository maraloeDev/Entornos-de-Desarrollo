/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad5__PatronFacade;

/**
 *
 * @author maraloed
 */
public class Posicion {

    private String Latitud;
    private String Longitud;
    private String Altura;
    private String Fecha;

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String Latitud) {
        this.Latitud = Latitud;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String Longitud) {
        this.Longitud = Longitud;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "Posicion{" + "Latitud=" + Latitud + ", Longitud=" + Longitud + ", Altura=" + Altura + ", Fecha=" + Fecha + '}';
    }
    
    
}
