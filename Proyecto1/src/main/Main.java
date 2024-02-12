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
                    var:double:: arreglo1 <- Mediana([DIV(15,3),SUM(14,5),43,53]) end;
                    var:double:: arreglo2 <- Moda([DIV(15,3),SUM(14,5),43,53,19,5,5,19,54,19]) end;
                    var:double:: arreglo3 <- Varianza([DIV(15,3),SUM(14,5),43,53]) end;
                    var:double:: arreglo4 <- Max([4,3,54,23,5,43,34,65,423,524,23,4,324,2]) end;
                    var:double:: arreglo5 <- Min([4,3,54,23,5,43,34,65,423,524,23,4,324,2]) end;
                    !var:double:: arreglo6 <- Media([MUL(SUM(7,3),RES(7,DIV(25,5))),14]) end;

                    !arreglos
                    arr:double::@arreglo6 <- [1,2,3,4,5,6,7,8,9,10] end; !arreglo tipo double
                    arr:char[]::@arreglo7 <- ["a","b","c","d","e","f","g"] end; !arreglo tipo char
                    arr:double::@arreglo8 <-[notaAprobar, a, valor1, suma2] end; !usando variables
                    arr:double::@darray <- [ SUM(7,3), DIV(25,5)] end;

                    
                    
                    <!console::print = "Media", "Mediana", "Moda", "Varianza", "Max", "Min" end;
                    console::print = "Hola Mundo", notaAprobar, labelAprobar end;
                    console::print = nuevo end; 
                    console::print = suma2 end;
                    console::print = suma3 end;
                    console::print = suma4 end;
                    console::print = suma5 end;
                    CONSOLE::PRINT = prueba END;
                    CONSOLE::PRINT = prueba2 END;!>
                    console::print = "VARIABLES CON FUNCIONES ESTADISTICAS" END;
                    console::print = arreglo end;
                    console::print = arreglo1 end;
                    console::print = arreglo2 end;
                    console::print = arreglo3 end;
                    console::print = arreglo4 end;
                    console::print = arreglo5 end;
                    !console::print = arreglo6 end;
                    console::print = "ARREGLOS" END;
                    console::print = @arreglo6 end;
                    console::print = @arreglo7 end;
                    console::print = @arreglo8 end;
                    console::print = @darray end;
                    

                     
                     
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

