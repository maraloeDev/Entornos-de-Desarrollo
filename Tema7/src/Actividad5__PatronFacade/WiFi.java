/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad5__PatronFacade;

/**
 *
 * @author maraloed
 */
public class WiFi {
    
    public String wifi;
    
    public void Encender(){
        System.out.println("WIFI, encendido");
    }
    
    public void Conectar (String SSID){
        
        wifi=SSID;
        System.out.println("Conectar a WIFI " + SSID);
    }
    public void Desconectar(){
        System.out.println("Desconectar WIFI " + wifi);
    }
    public void Apagar(){
        System.out.println("Wifi apagada");
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }
     
    
}
