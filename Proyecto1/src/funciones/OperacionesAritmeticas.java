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

    public static LinkedList<Object> operacionesSuma = new LinkedList<>();
    public static LinkedList<Object> listaEstadistica = new LinkedList<>();
    public static LinkedList<Object> ListaArreglos = new LinkedList<>();
    public static LinkedList<Object> ListaGraficas = new LinkedList<>();

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

    public static Object Media(LinkedList<Object> lista) {
        double suma = 0;
        int count = 0;
        for (Object obj : lista) {
            if (obj instanceof String) {
                try {
                    suma += Double.parseDouble((String) obj);
                    count++;
                } catch (NumberFormatException e) {
                    // Ignorar el elemento si no se puede convertir a Double
                }
            }
        }
        return count > 0 ? String.valueOf(suma / count) : null;
    }

    public static Object Mediana(LinkedList<Object> lista) {
        LinkedList<String> listaNumeros = new LinkedList<>();
        for (Object obj : lista) {
            if (obj instanceof String) {
                listaNumeros.add((String) obj);
            }
        }
        listaNumeros.sort((String a, String b) -> {
            return Double.compare(Double.parseDouble(a), Double.parseDouble(b));
        });
        int n = listaNumeros.size();
        if (n % 2 == 0) {
            double a = Double.parseDouble(listaNumeros.get(n / 2));
            double b = Double.parseDouble(listaNumeros.get(n / 2 - 1));
            return String.valueOf((a + b) / 2);
        } else {
            return listaNumeros.get(n / 2);
        }
    }
    
    public static Object Moda(LinkedList<Object> lista) {
        LinkedList<String> listaNumeros = new LinkedList<>();
        for (Object obj : lista) {
            if (obj instanceof String) {
                listaNumeros.add((String) obj);
            }
        }
        listaNumeros.sort((String a, String b) -> {
            return Double.compare(Double.parseDouble(a), Double.parseDouble(b));
        });
        int n = listaNumeros.size();
        int maxCount = 0;
        String moda = null;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (listaNumeros.get(j).equals(listaNumeros.get(i))) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                moda = listaNumeros.get(i);
            }
        }
        return moda;
    }

    public static Object Varianza(LinkedList<Object> lista) {
        double suma = 0;
        int count = 0;
        for (Object obj : lista) {
            if (obj instanceof String) {
                try {
                    suma += Double.parseDouble((String) obj);
                    count++;
                } catch (NumberFormatException e) {
                    // Ignorar el elemento si no se puede convertir a Double
                }
            }
        }
        double media = count > 0 ? suma / count : 0;
        double sumaCuadrados = 0;
        for (Object obj : lista) {
            if (obj instanceof String) {
                try {
                    sumaCuadrados += Math.pow(Double.parseDouble((String) obj) - media, 2);
                } catch (NumberFormatException e) {
                    // Ignorar el elemento si no se puede convertir a Double
                }
            }
        }
        return count > 0 ? String.valueOf(sumaCuadrados / count) : null;
    }

    public static Object Maximo(LinkedList<Object> lista) {
        double max = Double.parseDouble((String) lista.get(0));
        for (Object num : lista) {
            if (Double.parseDouble((String) num) > max) {
                max = Double.parseDouble((String) num);
            }
        }
        return String.valueOf(max);
    }

    
    public static Object Minimo(LinkedList<Object> lista) {
        double min = Double.parseDouble((String) lista.get(0));
        for (Object num : lista) {
            if (Double.parseDouble((String) num) < min) {
                min = Double.parseDouble((String) num);
            }
        }
        return String.valueOf(min);
    }
}
