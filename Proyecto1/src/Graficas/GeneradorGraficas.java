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
import java.util.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import main.Interfaz;
import org.jfree.chart.plot.CategoryPlot;

public class GeneradorGraficas {
    
    public static ChartPanel generarGraficaBarras(GraficaBarrasInfo graficaBarra, Interfaz interfaz) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < graficaBarra.getEjeX().size(); i++) {
            dataset.addValue(graficaBarra.getEjeY().get(i), "", graficaBarra.getEjeX().get(i));
        }
        JFreeChart chart = ChartFactory.createBarChart(
                graficaBarra.getTitulo(),
                graficaBarra.getTituloX(),
                graficaBarra.getTituloY(),
                dataset
        );
        
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.getRenderer().setSeriesVisibleInLegend(0, false); // Ocultar la leyenda de la serie

        ChartPanel panelGrafica = new ChartPanel(chart);
        // Establecer el tamaño preferido del ChartPanel basado en el tamaño del viewport del JScrollPane
        panelGrafica.setPreferredSize(interfaz.getPanelGraficasViewportSize());

        // Agregar la gráfica al panel en la interfaz
        interfaz.agregarGráficaAlPanel(panelGrafica, graficaBarra.getTitulo());

        return panelGrafica;
    }

    public static void generarTodasLasGraficasBarras(List<GraficaBarrasInfo> listaGraficas, Interfaz interfaz) {
        for (GraficaBarrasInfo graficaBarra : listaGraficas) {
            generarGraficaBarras(graficaBarra, interfaz);
        }
    }



    public static ChartPanel generarGraficaPie(GraficaPieInfo graficaPie,  Interfaz interfaz) {
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
    
        ChartPanel panelGrafica = new ChartPanel(chart);
        // Establecer el tamaño preferido del ChartPanel basado en el tamaño del viewport del JScrollPane
        panelGrafica.setPreferredSize(interfaz.getPanelGraficasViewportSize());

        // Agregar la gráfica al panel en la interfaz
        interfaz.agregarGráficaAlPanel(panelGrafica, graficaPie.getTitulo());
    
        return panelGrafica;
    }
    
    public static void generarTodasLasGraficasPie(List<GraficaPieInfo> listaGraficasPie, Interfaz interfaz) {
        for (GraficaPieInfo graficaPie : listaGraficasPie) {
            generarGraficaPie(graficaPie, interfaz);
        }
    }



    public static ChartPanel generarGraficaLinea(GraficaLineaInfo graficaLinea,  Interfaz interfaz) {
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
    
        ChartPanel panelGrafica = new ChartPanel(chart);
        // Establecer el tamaño preferido del ChartPanel basado en el tamaño del viewport del JScrollPane
        panelGrafica.setPreferredSize(interfaz.getPanelGraficasViewportSize());

        // Agregar la gráfica al panel en la interfaz
        interfaz.agregarGráficaAlPanel(panelGrafica, graficaLinea.getTitulo());
    
        return panelGrafica;
    }


    public static void generarTodasLasGraficasLinea(List<GraficaLineaInfo> listaGraficasLinea,  Interfaz interfaz) {
        for (GraficaLineaInfo graficaLinea : listaGraficasLinea) {
            generarGraficaLinea(graficaLinea, interfaz);
        }
    }


    public static ChartPanel generarHistograma(GraficaHistoInfo graficaHistoInfo,  Interfaz interfaz) {
     // Utilizar TreeMap para ordenar y contar la frecuencia de los valores
        TreeMap<Double, Integer> map = new TreeMap<>();
        for (Double value : graficaHistoInfo.getValues()) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
    
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        // Añadir los valores al dataset
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            dataset.addValue(entry.getValue(), "Frecuencia", entry.getKey());
        }
    
        // Crear el gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                graficaHistoInfo.getTitulo(),
                null, // Eje X sin título
                null, // Eje Y sin título
                dataset,
                PlotOrientation.VERTICAL,
                false, // No mostrar leyenda
                true, // Tooltips
                false // URLs
        );
    
        // Opciones adicionales del gráfico
        //chart.getCategoryPlot().getDomainAxis().setVisible(false); // Ocultar etiquetas del eje X
        //chart.getCategoryPlot().getRangeAxis().setVisible(false); // Ocultar etiquetas del eje Y
    
        ChartPanel panelGrafica = new ChartPanel(chart);
        // Establecer el tamaño preferido del ChartPanel basado en el tamaño del viewport del JScrollPane
        panelGrafica.setPreferredSize(interfaz.getPanelGraficasViewportSize());

        // Agregar la gráfica al panel en la interfaz
        interfaz.agregarGráficaAlPanel(panelGrafica, graficaHistoInfo.getTitulo());
    
        return panelGrafica;
    }

    public static void generarTodasLasGraficasHisto(List<GraficaHistoInfo> listaGraficasHisto,  Interfaz interfaz) {
        for (GraficaHistoInfo graficaHisto : listaGraficasHisto) {
            generarHistograma(graficaHisto, interfaz);
        }
    }


    public static void imprimirTablaFrecuencias(GraficaHistoInfo graficaHistoInfo, Interfaz interfaz) {
            List<Double> values = graficaHistoInfo.getValues();
            Map<Double, Integer> frecuenciaBruta = new TreeMap<>();
            
            // Calcular Fb
            for (Double value : values) {
                frecuenciaBruta.merge(value, 1, Integer::sum);
            }

            // Calcular Fa y Fr
            int fa = 0;
            int totalValues = values.size();
            
            interfaz.appendConsolaText(" ", true);
            interfaz.appendConsolaText("                "+graficaHistoInfo.getTitulo(), true);
            interfaz.appendConsolaText("----------------------------------------------------------------------------------------", true);
            interfaz.appendConsolaText("Valor\tFb\tFa\tFr \n", false);
            interfaz.appendConsolaText("----------------------------------------------------------------------------------------", true);
            //System.out.println(graficaHistoInfo.getTitulo());
            //System.out.println("Valor\tFb\tFa\tFr");
            
            for (Map.Entry<Double, Integer> entry : frecuenciaBruta.entrySet()) {
                int fb = entry.getValue();
                fa += fb;
                double fr = (double) fb / totalValues * 100;
                
                String formato = String.format(Locale.US, "%d\t%d\t%d\t%.0f%%\n", entry.getKey().intValue(), fb, fa, fr);
                interfaz.appendConsolaText(formato, false);
                interfaz.appendConsolaText("----------------------------------------------------------------------------------------", true);
                //System.out.printf(Locale.US, "%d\t%d\t%d\t%.0f%%\n", entry.getKey().intValue(), fb, fa, fr);
            }
            
            // Imprimir los totales
            String formato1 = String.format(Locale.US,"Totales:\t%d\t%d\t100%%\n", totalValues, fa);
            interfaz.appendConsolaText(formato1, false);
            interfaz.appendConsolaText("----------------------------------------------------------------------------------------", true);
            interfaz.appendConsolaText(" ", true);
            //System.out.printf(Locale.US, "Totales:\t%d\t%d\t100%%\n", totalValues, fa);
        }
    
        public static void generarTodasLasTablasHisto(List<GraficaHistoInfo> listaGraficasHisto, Interfaz interfaz) {
            for (GraficaHistoInfo graficaHisto : listaGraficasHisto) {
                imprimirTablaFrecuencias(graficaHisto, interfaz);
            }
        }

}