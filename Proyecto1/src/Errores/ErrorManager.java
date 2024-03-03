/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Errores;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mario
 */
public class ErrorManager {


    private List<ErroresTipo> errores;

    public ErrorManager() {
        this.errores = new ArrayList<>();
    }

    public void addError(String tipo, Object descripcion, int linea, int columna) {
        //ErroresTipo error = new ErroresTipo(tipo, descripcion, linea, columna);
        //errores.add(error);
    }

    public String generateHTMLReport() {
        StringBuilder html = new StringBuilder();
    
        // Añade el inicio del documento HTML con su DOCTYPE y etiquetas básicas
        html.append("<!DOCTYPE html>\n")
            .append("<html lang='es'>\n")
            .append("<head>\n")
            .append("<meta charset='UTF-8'>\n")
            .append("<title>Reporte de Errores</title>\n")
            .append("<style>table { width: 100%; border-collapse: collapse; }")
            .append("th, td { border: 1px solid #dddddd; text-align: left; padding: 8px; }")
            .append("tr:nth-child(even) { background-color: #f2f2f2; }</style>\n")
            .append("</head>\n")
            .append("<body>\n")
            .append("<h1>Reporte de Errores</h1>\n")
            .append("<table>\n")
            .append("<tr>\n")
            .append("<th>#</th>\n")
            .append("<th>Tipo</th>\n")
            .append("<th>Descripción</th>\n")
            .append("<th>Línea</th>\n")
            .append("<th>Columna</th>\n")
            .append("</tr>\n");
    
        // Recorre la lista de errores y crea una fila para cada uno
        int errorCount = 1;
        for (ErroresTipo error : errores) {
            html.append("<tr>\n")
                .append("<td>").append(errorCount++).append("</td>\n")
                .append("<td>").append(error.tipo).append("</td>\n")
                .append("<td>").append(error.des).append("</td>\n")
                .append("<td>").append(error.fila).append("</td>\n")
                .append("<td>").append(error.columna).append("</td>\n")
                .append("</tr>\n");
        }
    
        // Añade el final del documento HTML
        html.append("</table>\n")
            .append("</body>\n")
            .append("</html>");
        
        System.out.println(html.toString());
        return html.toString();
    }
    
}
