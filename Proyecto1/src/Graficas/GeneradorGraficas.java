/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficas;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartUtilities;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class GeneradorGraficas {
    public static ChartPanel generarGraficaBarras(GraficaBarrasInfo graficaBarra) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < graficaBarra.getEjeX().size(); i++) {
            dataset.addValue(graficaBarra.getEjeY().get(i), "Series", graficaBarra.getEjeX().get(i));
        }
        JFreeChart chart = ChartFactory.createBarChart(
                graficaBarra.getTitulo(),
                graficaBarra.getTituloX(),
                graficaBarra.getTituloY(),
                dataset
        );

        // Guardar la gráfica como imagen PNG
        //System.out.println("Gráfica de barras guardada como imagen");
        String nombre = graficaBarra.getTitulo();
        try {
            ChartUtilities.saveChartAsPNG(new File(nombre+".png"), chart, 800, 600);
            System.out.println("Gráfica de barras guardada como imagen");
        } catch (IOException e) {
            System.err.println("Error al guardar la gráfica como imagen: " + e.getMessage());
        }

        return new ChartPanel(chart);
    }

    public static void generarTodasLasGraficasBarras(List<GraficaBarrasInfo> listaGraficas) {
        for (GraficaBarrasInfo graficaBarra : listaGraficas) {
            generarGraficaBarras(graficaBarra);
        }
    }
}