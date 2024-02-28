/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graficas;

import java.util.HashMap;


/**
 *
 * @author mario
 */
public class GraficaInfo {

    public static HashMap<String, Object> componentesGraficaBarras = new HashMap<>();
    public static HashMap<String, Object> componentesGraficaPie = new HashMap<>();
    public static HashMap<String, Object> componentesGraficaLinea = new HashMap<>();
    public static HashMap<String, Object> componentesHistograma = new HashMap<>();

    public static void putGraficaBarras(String nombre, Object valor) {
        componentesGraficaBarras.put(nombre, valor);
    }

    public static Object getGraficaBarras(String nombre) {
        return componentesGraficaBarras.get(nombre);
    }

    public static void putGraficaPie(String nombre, Object valor) {
        componentesGraficaPie.put(nombre, valor);
    }

    public static Object getGraficaPie(String nombre) {
        return componentesGraficaPie.get(nombre);
    }

    public static void putGraficaLinea(String nombre, Object valor) {
        componentesGraficaLinea.put(nombre, valor);
    }

    public static Object getGraficaLinea(String nombre) {
        return componentesGraficaLinea.get(nombre);
    }

    public static void putHistograma(String nombre, Object valor) {
        componentesHistograma.put(nombre, valor);
    }

    public static Object getHistograma(String nombre) {
        return componentesHistograma.get(nombre);
    }
    
}
