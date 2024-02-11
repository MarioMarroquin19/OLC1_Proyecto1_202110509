package funciones;

import java.util.HashMap;


public class Variables {

    public static HashMap<String, String> variables = new HashMap<>();

    public static void addVariable(String nombre, String valor) {
        variables.put(nombre, valor);
    }

    public static String getVariable(String nombre) {
        return variables.get(nombre);
    }

    
}
