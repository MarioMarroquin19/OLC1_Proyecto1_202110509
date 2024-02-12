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
                    ! Variables
                    var:double:: notaAprobar <- 61 end;
                    var:char[]:: labelAprobar <- "Nota Minima" end;

                    ! Arreglos
                    arr:double:: @notas <- [notaAprobar, MUL(75, 0.45), DIV(SUM(80,20), RES(75,25))] end;
                    arr:char[]:: @labels <- [labelAprobar, "P1", "P2"] end;

                    console::print = "Media", "Mediana", "Moda", "Varianza", "Max", "Min" end;
                    !console::print = Media(@notas), Mediana(@notas), Moda(@notas), Varianza(@notas), Max(@notas), Min(@notas) end;
                    console::print = "Hola Mundo", MOD(10, 9), notaAprobar, labelAprobar end;
                     
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

