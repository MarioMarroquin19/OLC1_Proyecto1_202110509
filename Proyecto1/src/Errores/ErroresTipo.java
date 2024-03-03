/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Errores;

/**
 *
 * @author mario
 */
public class ErroresTipo {
    
    public String tipo; //tipo de error
    public String des; //descripcion del error
    public String fila; //linea donde se produce el error
    public String columna; //columna donde se produce el error


    public ErroresTipo (String tipo, String des, String fila, String columna){
        this.tipo = tipo;
        this.des = des;
        this.fila = fila;
        this.columna = columna;
    }
    

    @Override
    public String toString() {
        return this.tipo + ": " + this.des + " en la fila" + this.fila + " en la columna" + this.columna;
    }


}
