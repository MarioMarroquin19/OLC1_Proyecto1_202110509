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

    public static void putGraficaBarras(String nombre, Object valor) {
        componentesGraficaBarras.put(nombre, valor);
    }

    public static Object getGraficaBarras(String nombre) {
        return componentesGraficaBarras.get(nombre);
    }

}
