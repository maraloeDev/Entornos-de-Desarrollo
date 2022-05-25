/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad6__ModeloVistaControlador;

/**
 *
 * @author maraloed
 */
public class Sintomas {
    
     private int fiebre=0;
    private int tos=0;
    private int diarrea=0;
    private int dolor_muscular=0;
    private int olfato=0;

    public Sintomas() {
    }

    public int getFiebre() {
        return fiebre;
    }

    public void setFiebre(int fiebre) {
        this.fiebre = fiebre;
    }

    public int getTos() {
        return tos;
    }

    public void setTos(int tos) {
        this.tos = tos;
    }

    public int getDiarrea() {
        return diarrea;
    }

    public void setDiarrea(int diarrea) {
        this.diarrea = diarrea;
    }

    public int getDolor_muscular() {
        return dolor_muscular;
    }

    public void setDolor_muscular(int dolor_muscular) {
        this.dolor_muscular = dolor_muscular;
    }

    public int getOlfato() {
        return olfato;
    }

    public void setOlfato(int olfato) {
        this.olfato = olfato;
    }

    @Override
    public String toString() {
        return "Resultados encuesta covid GF\n\n" 
                + "Fiebre=" + fiebre + "\nTos seca=" + tos + "\nDiarrea=" + diarrea + "\nDolor muscular=" + dolor_muscular + "\nOlfato=" + olfato;
    }
    
}
