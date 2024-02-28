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
public class GraficaHistoInfo {
    private String titulo;
    private List<Double> values;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Double> getValues() {
        return values;
    }

    public void setValues(List<String> valuesStr) {
        List<Double> valuesDouble = new ArrayList<>();
        for (String str : valuesStr) {
            try {
                valuesDouble.add(Double.parseDouble(str));
            } catch (NumberFormatException e) {
                // Manejar la excepción si el String no se puede convertir a Double
                e.printStackTrace();
            }
        }
        this.values = valuesDouble;
    }
    
}
