/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author mario
 */
public class Main {
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
    
 public static void main(String[] args) {
    String entrada = "25"; // Puedes modificar esta entrada
    
    // Generar Analizadores
    analizadores("src/analizador/", "Lexer.jflex", "Parser.cup");
    
    // Realizar Analisis
    /*try {
        analizador.Parser parser = new Parser(new analizador.Lexer(new StringReader(entrada)));
        parser.parse();

    } catch (Exception ex) {
        System.out.println("Error fatal en compilación de entrada.");
    } */ 
    
}
        
}

