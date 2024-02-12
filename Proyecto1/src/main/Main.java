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
                    var:double:: notaAprobar <- 671 end;
                    var:double:: a <- 5 end;
                    var:double:: valor1 <- 3 end;
                    var:char[]:: labelAprobar <- "Nota Minima" end;
                    var:char[]:: nuevo <- "Este es un pArrafo para comprobar la nueva lectura" end;
                    var:double:: suma2 <- RES(5,valor1) end;
                    var:double:: suma3 <- MUL(2,3) end;
                    var:double:: suma4 <- DIV(10,5) end;
                    var:double:: suma5 <- MOD(25,3) end;
                    VAr:double:: prueba <-SUM(SUM(1,1),SUM(1,SUM(2,4))) END; 
                    var:double::prueba2 <- MUL(SUM(7,3),RES(7,DIV(25,5)))end;
                    var:double:: arreglo <- Media([DIV(15,3),SUM(14,5),43,53]) end;
                    var:double:: arreglo2 <- Media([MUL(SUM(7,3),RES(7,DIV(25,5))),14]) end;
                    
                    
                    console::print = "Media", "Mediana", "Moda", "Varianza", "Max", "Min" end;
                    console::print = "Hola Mundo", notaAprobar, labelAprobar end;
                    console::print = nuevo end; 
                    console::print = suma2 end;
                    console::print = suma3 end;
                    console::print = suma4 end;
                    console::print = suma5 end;
                    CONSOLE::PRINT = prueba END;
                    CONSOLE::PRINT = prueba2 END;
                    console::print = arreglo end;
                    console::print = arreglo2 end;
                    

                     
                     
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

