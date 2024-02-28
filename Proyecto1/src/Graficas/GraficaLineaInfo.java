/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mario
 */
public class GraficaLineaInfo {
    private String titulo;
    private List<String> ejeX;
    private List<Double> ejeY;
    private String tituloX;
    private String tituloY;


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

    public void setEjeY(List<String> ejeYStr) {
        List<Double> ejeYDouble = new ArrayList<>();
        for (String str : ejeYStr) {
            try {
                ejeYDouble.add(Double.parseDouble(str));
            } catch (NumberFormatException e) {
                // Manejar la excepción si el String no se puede convertir a Double
                e.printStackTrace();
            }
        }
        this.ejeY = ejeYDouble;
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
