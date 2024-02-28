/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficas;

import java.util.List;

/**
 *
 * @author mario
 */

public class GraficaBarrasInfo {
    private String titulo;
    private List<String> ejeX;
    private List<Double> ejeY;
    private String tituloX;
    private String tituloY;
    // Otros atributos específicos de la gráfica de barras
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getEjeX() {
        return ejeX;
    }

    public void setEjeX(List<String> ejeX) {
        this.ejeX = ejeX;
    }

    public List<Double> getEjeY() {
        return ejeY;
    }

    public void setEjeY(List<Double> ejeY) {
        this.ejeY = ejeY;
    }

    public String getTituloX() {
        return tituloX;
    }

    public void setTituloX(String tituloX) {
        this.tituloX = tituloX;
    }

    public String getTituloY() {
        return tituloY;
    }

    public void setTituloY(String tituloY) {
        this.tituloY = tituloY;
    }
    
}
