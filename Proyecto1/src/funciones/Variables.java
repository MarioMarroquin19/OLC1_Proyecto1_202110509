package funciones;

import java.util.HashMap;


public class Variables {

    public static HashMap<String, Object> variables = new HashMap<>();
    public static HashMap<String, Object> graficasValores = new HashMap<>();

    public static void addVariable(String nombre, Object valor) {
        variables.put(nombre, valor);
    }

    public static Object getVariable(String nombre) {
        return variables.get(nombre);
    }
    
    
    public static void addGrafica(String nombre, Object valor) {
        graficasValores.put(nombre, valor);
    }

    public static Object getGrafica(String nombre) {
        return graficasValores.get(nombre);
    }

    
}
