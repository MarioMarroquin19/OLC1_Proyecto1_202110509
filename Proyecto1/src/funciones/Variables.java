package funciones;

import java.util.HashMap;


public class Variables {

    public static HashMap<String, Object> variables = new HashMap<>();

    public static void addVariable(String nombre, Object valor) {
        variables.put(nombre, valor);
    }

    public static Object getVariable(String nombre) {
        //return (String) variables.get(nombre);
        return variables.get(nombre);
    }

    
}
