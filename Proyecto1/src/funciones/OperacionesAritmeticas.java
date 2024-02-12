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

    public static LinkedList<String> operacionesSuma = new LinkedList<String>();
    public static String operacionActual = "MOD";

    public static void setOperacion(String operacion) {
        operacionActual = operacion;
    }

    public static String operar(String a, String b) {
        switch (operacionActual) {
            case "SUM":
                return SUM(a, b);
            case "RES":
                return RES(a, b);
            case "MUL":
                return MUL(a, b);
            case "DIV":
                return DIV(a, b);
            case "MOD":
                return MOD(a, b);
            default:
                return "Operación no reconocida";
        }
    }

    public static String SUM(String a, String b) {
        double izq = Double.parseDouble(a);
        double der = Double.parseDouble(b);
        return String.valueOf(izq + der);
    }

    public static String RES(String a, String b) {
        double izq = Double.parseDouble(a);
        double der = Double.parseDouble(b);
        return String.valueOf(izq - der);
    }

    public static String MUL(String a, String b) {
        double izq = Double.parseDouble(a);
        double der = Double.parseDouble(b);
        return String.valueOf(izq * der);
    }

    public static String DIV(String a, String b) {
        double izq = Double.parseDouble(a);
        double der = Double.parseDouble(b);
        return String.valueOf(izq / der);
    }

    public static String MOD(String a, String b) {
        double izq = Double.parseDouble(a);
        double der = Double.parseDouble(b);
        return String.valueOf(izq % der);
    }
    
}
