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
    public static LinkedList<String> listaMedia = new LinkedList<>();

    //operaciones aritméticas
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

    //opraciones estádisticas

    public static String Media(LinkedList<String> lista) {
        double suma = 0;
        for (String num : lista) {
            suma += Double.parseDouble(num);
        }
        return String.valueOf(suma / lista.size());
    }

    public static String Mediana(LinkedList<String> lista) {
        int n = lista.size();
        if (n % 2 == 0) {
            double a = Double.parseDouble(lista.get(n / 2));
            double b = Double.parseDouble(lista.get((n / 2) - 1));
            return String.valueOf((a + b) / 2);
        } else {
            return lista.get(n / 2);
        }
    }
    
    public static String Moda(LinkedList<String> lista) {
        int n = lista.size();
        int max = 0;
        String moda = "";
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                moda = lista.get(i);
            }
        }
        return moda;
    }

    public static String Varianza(LinkedList<String> lista) {
        double media = Double.parseDouble(Media(lista));
        double suma = 0;
        for (String num : lista) {
            suma += Math.pow(Double.parseDouble(num) - media, 2);
        }
        return String.valueOf(suma / lista.size());
    }

    public static String Maximo(LinkedList<String> lista) {
        double max = Double.parseDouble(lista.get(0));
        for (String num : lista) {
            if (Double.parseDouble(num) > max) {
                max = Double.parseDouble(num);
            }
        }
        return String.valueOf(max);
    }

    public static String Minimo(LinkedList<String> lista) {
        double min = Double.parseDouble(lista.get(0));
        for (String num : lista) {
            if (Double.parseDouble(num) < min) {
                min = Double.parseDouble(num);
            }
        }
        return String.valueOf(min);
    }
}
