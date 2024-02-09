/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.LinkedList;

/**
 *
 * @author mario
 */
public class Funciones {
    public static LinkedList<String> lista = new LinkedList<>();
    
    public static String Suma(String a, String b){
        int izq = Integer.parseInt(a);
        int der = Integer.parseInt(b);
        return String.valueOf(izq+der);
    }
    
    
    public static String impresion(){
        
        return "";
    }
}
