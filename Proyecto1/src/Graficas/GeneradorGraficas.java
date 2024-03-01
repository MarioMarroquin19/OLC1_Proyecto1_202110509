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
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;

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
            //System.out.println("Gráfica de barras guardada como imagen");
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



    public static ChartPanel generarGraficaPie(GraficaPieInfo graficaPie) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int i = 0; i < graficaPie.getLabels().size(); i++) {
            dataset.setValue(graficaPie.getLabels().get(i), graficaPie.getValues().get(i));
        }
    
        JFreeChart chart = ChartFactory.createPieChart(
                graficaPie.getTitulo(),
                dataset,
                true, // legend
                true, // tooltips
                false // URLs
        );
    
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}: {2}"));
        // {0} = Nombre de la sección, {1} = Valor numérico, {2} = Porcentaje
    
        // Guardar la gráfica como imagen PNG
        try {
            ChartUtilities.saveChartAsPNG(new File(graficaPie.getTitulo() + ".png"), chart, 800, 600);
            //System.out.println("Gráfica de tipo pie guardada como imagen");
        } catch (IOException e) {
            System.err.println("Error al guardar la gráfica como imagen: " + e.getMessage());
        }
    
        return new ChartPanel(chart);
    }
    
    public static void generarTodasLasGraficasPie(List<GraficaPieInfo> listaGraficasPie) {
        for (GraficaPieInfo graficaPie : listaGraficasPie) {
            generarGraficaPie(graficaPie);
        }
    }



    public static ChartPanel generarGraficaLinea(GraficaLineaInfo graficaLinea) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
        // Asumimos que graficaLinea ya tiene las listas de ejeX y ejeY configuradas correctamente.
        for (int i = 0; i < graficaLinea.getEjeX().size(); i++) {
            dataset.addValue(graficaLinea.getEjeY().get(i), "Series", graficaLinea.getEjeX().get(i));
        }
    
        JFreeChart chart = ChartFactory.createLineChart(
                graficaLinea.getTitulo(),        // Título de la gráfica
                graficaLinea.getTituloX(),       // Título del eje X
                graficaLinea.getTituloY(),       // Título del eje Y
                dataset,                         // Dataset
                PlotOrientation.VERTICAL,        // Orientación
                true,                            // Muestra la leyenda
                true,                            // Tooltips
                false                            // URLs
        );
    
        // Guardar la gráfica como imagen PNG
        try {
            ChartUtilities.saveChartAsPNG(new File(graficaLinea.getTitulo() + ".png"), chart, 800, 600);
            //System.out.println("Gráfica de línea guardada como imagen");
        } catch (IOException e) {
            System.err.println("Error al guardar la gráfica como imagen: " + e.getMessage());
        }
    
        return new ChartPanel(chart);
    }


    public static void generarTodasLasGraficasLinea(List<GraficaLineaInfo> listaGraficasLinea) {
        for (GraficaLineaInfo graficaLinea : listaGraficasLinea) {
            generarGraficaLinea(graficaLinea);
        }
    }


    public static ChartPanel generarHistograma(GraficaHistoInfo graficaHisto) {
        HistogramDataset dataset = new HistogramDataset();
        dataset.setType(HistogramType.RELATIVE_FREQUENCY);
    
        // Convertir la lista de valores Double a un array primitivo
        double[] values = new double[graficaHisto.getValues().size()];
        for (int i = 0; i < values.length; i++) {
            values[i] = graficaHisto.getValues().get(i);
        }
    
        dataset.addSeries("Frecuencia", values, values.length);
    
        JFreeChart histogram = ChartFactory.createHistogram(
                graficaHisto.getTitulo(),
                "Valor",
                "Frecuencia",
                dataset,
                PlotOrientation.VERTICAL,
                true,   // Muestra la leyenda
                true,   // Tooltips
                false   // URLs
        );
    
        // Guardar el histograma como imagen PNG
        try {
            ChartUtilities.saveChartAsPNG(new File(graficaHisto.getTitulo() + ".png"), histogram, 800, 600);
           // System.out.println("Histograma guardado como imagen PNG.");
        } catch (IOException e) {
            System.err.println("Error al guardar el histograma como imagen PNG: " + e.getMessage());
        }
    
        return new ChartPanel(histogram);
    }

    public static void generarTodasLasGraficasHisto(List<GraficaHistoInfo> listaGraficasHisto) {
        for (GraficaHistoInfo graficaHisto : listaGraficasHisto) {
            generarHistograma(graficaHisto);
        }
    }


}