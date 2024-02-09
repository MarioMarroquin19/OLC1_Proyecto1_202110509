/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.StringReader;

/**
 *
 * @author mario
 */
public class Main {
    
    
    public static void main(String[] args) {
        
    String entrada = """
                    PROGRAM
                        !Esto es un comentario
                        <!comentario
                         multilínea!>
                        console::print = "Media", "Mediana", "Moda", "Varianza", "Max", "Min" end;
                        <! esto es otro comentario
                     multilínea, a ver si peta, sino ya funciona de maravilla!>
                    	console::print = "Hola Mundo", 43243, "4532432", "ggfdsg" end;
                    END PROGRAM
                  """;
    
    // Generar Analizadores
    
    //analizadores("src/analizador/", "Lexer.jflex", "Parser.cup");
    
    analizar(entrada);
 
   }   
    
    
    
    
    public static void analizadores(String ruta, String jflexFile, String cupFile){
        try {
            String opcionesJflex[] =  {ruta+jflexFile,"-d",ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] =  {"-destdir", ruta,"-parser","Parser",ruta+cupFile};
            java_cup.Main.main(opcionesCup);
            
        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }
    
    
 
     // Realizar Analisis
    public static void analizar (String entrada){
        try {
            analizador.Lexer lexer = new analizador.Lexer(new StringReader(entrada)); 
            analizador.Parser parser = new analizador.Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    } 
        
}

