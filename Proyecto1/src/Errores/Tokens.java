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
public class Tokens {
    private String lexema;
    private String token;
    private int fila;
    private int columna;
    private final ArrayList<Tokens> listaTokens;

    public Tokens(String lexama, String token, int fila, int columna) {
        this.lexema = lexama;
        this.token = token;
        this.fila = fila;
        this.columna = columna;
        this.listaTokens = new ArrayList<>();
    }

    public String getLexema() {
        return lexema;
    }

    public String getToken() {
        return token;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public ArrayList<Tokens> getListaTokens() {
        return listaTokens;
    }
    
}
