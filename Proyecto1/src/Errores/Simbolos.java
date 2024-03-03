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
public class Simbolos {
    private String nombre;
    private String tipo;
    private Object valor;
    private int fila;
    private int columna;

    private final ArrayList<Simbolos> listaSimbolos;



    public Simbolos(String nombre, String tipo, Object valor, int fila, int columna) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
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

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public ArrayList<Simbolos> getListaSimbolos() {
        return listaSimbolos;
    }

    
}
