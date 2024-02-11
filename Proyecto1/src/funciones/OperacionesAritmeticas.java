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
public class OperacionesAritmeticas {

    public static LinkedList<String> operaciones = new LinkedList<String>();

    public static String Suma(String a, String b) {
        double izq = Double.parseDouble(a);
        double der = Double.parseDouble(b);
        return String.valueOf(izq + der);
    }
    
}
