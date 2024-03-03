/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Errores;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class SimboloInfo {
    private String nombre;
    private String tipo;
    private Object valor;
    private int fila;
    private int columna;

    private final ArrayList<SimboloInfo> listaSimbolos;



    public SimboloInfo(String nombre, String tipo, Object valor, int fila, int columna) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.fila = fila;
        this.columna = columna;
        this.listaSimbolos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Object getValor() {
        return valor;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public ArrayList<SimboloInfo> getListaSimbolos() {
        return listaSimbolos;
    }
}
