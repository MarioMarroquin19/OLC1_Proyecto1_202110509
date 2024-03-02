/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Error;

/**
 *
 * @author mario
 */
public class Errores {
    
    public String tipo;
    public String des;
    public String fila;
    public String columna;
    
    public Errores (String tipo, String des, String fila, String columna){
        this.tipo = tipo;
        this.des = des;
        this.fila = fila;
        this.columna = columna;
                
    }
    

    @Override
    public String toString() {
        return this.tipo + ": " + this.des + " en la fila" + this.fila + " en la columna" + this.columna;
    }

    
    public String toHTML(){
        return "<tr>\n" +
                "<td>" + this.tipo + "</td>\n" +
                "<td>" + this.des + "</td>\n" +
                "<td>" + this.fila + "</td>\n" +
                "<td>" + this.columna + "</td>\n" +
                "</tr>\n";
    }


}
