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

            <! segundo 
                     comentario multilínea !>

            !Prints
            var:char[]:: titulo1 <- "Titulo histograma" end;
            console::column = "test" -> [10, 15.5, 61.1] end;
            console::column = "Notas" -> @notas end;
            console::column = titulo1 -> @labels end;

            console::print = "Media", "Mediana", "Moda", "Varianza", "Max", "Min" end;
            console::print = Media(@notas), Mediana(@notas), Moda(@notas), Varianza(@notas), Max(@notas), Min(@notas) end;
            console::print = "Hola Mundo", MOD(10, 9), notaAprobar, labelAprobar end;

            <! FELICIDADES
                    Lo de arriba ya es medio proyecto
                    Tu puedes !>
            	
            var:double:: gb1 <- 61 end;
            var:char[]:: gbt <- "Datos" end;
            

            graphBar(
                    !grafica 1
                    tituloX::char[] = "Actividades" end;
                    tituloY::char[] = gbt end;
                    titulo::char[] = "Estudiantes" end;
                    ejeX::char[] = ["UNO", "DOS", "TRES"] end;
                    ejeY::double = [gb1, 30, 70] end;
                     titulo::char[] = "Diferente" end;
                    EXEC graphBar end;
            ) end;
 
            graphBar(
                    !grafica 2
                    tituloX::char[] = "COLUMNAS" end;
                    tituloY::char[] = "NUMEROS" end;
                    titulo::char[] = "GRAFICA 2" end;
                    ejeX::char[] = ["CUATRO", "CINCO", "SEIS"] end;
                    ejeY::double = [40, 20, 10] end;
                    EXEC graphBar end;
            ) end;                     

                     
       END PROGRAM
                  """;
    
    // Generar Analizadores
    
    analizadores("src/analizador/", "Lexer.jflex", "Parser.cup");
    
    //analizar(entrada);
 
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

