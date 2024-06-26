/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package main;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import main.Analizar; 
import Errores.ErroresTipo;
import Errores.SimboloInfo;
import Errores.Tokens;
import Errores.Simbolos;
import funciones.Variables;
import analizador.Parser;
import analizador.Lexer;
import java.awt.Desktop;
import java.util.ArrayList;
import java.util.HashMap;

import org.jfree.chart.ChartPanel;





/**
 *
 * @author mario
 */
public class Interfaz extends javax.swing.JFrame {
    
    private CardLayout cardLayout = new CardLayout();
    private JPanel panelDeGraficas = new JPanel(cardLayout);
    //ErrorManager errores = new ErrorManager();
    private static int contadorVentanas = 0;
       

    /**
     * Creates new form NewJFrame
     */
    public Interfaz() {
        initComponents();
        setTitle("Ventana #"+""+(contadorVentanas++));
        PanelGraficas.setViewportView(panelDeGraficas);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EntradaText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        entradaText = new javax.swing.JTextArea();
        VerGraficasText = new javax.swing.JLabel();
        PanelGraficas = new javax.swing.JScrollPane();
        anteriorBoton = new javax.swing.JButton();
        siguienteBoton = new javax.swing.JButton();
        ConsolaLabelText = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        consolaText = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        nuevoArchivo = new javax.swing.JMenuItem();
        abrirArchivo = new javax.swing.JMenuItem();
        guardarArchivo = new javax.swing.JMenuItem();
        GuardarComoBoton = new javax.swing.JMenuItem();
        Pestania = new javax.swing.JMenu();
        nuevaPestania = new javax.swing.JMenuItem();
        eliminarPestania = new javax.swing.JMenuItem();
        EjecutarPesta = new javax.swing.JMenu();
        ejecutarBoton = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        TablaTokensBoton = new javax.swing.JMenuItem();
        TablaErroresBoton = new javax.swing.JMenuItem();
        TablaSimbolosBoton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EntradaText.setText("Entrada");

        entradaText.setColumns(20);
        entradaText.setRows(5);
        jScrollPane1.setViewportView(entradaText);

        VerGraficasText.setText("Ver graficas");

        anteriorBoton.setText("Anterior");
        anteriorBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorBotonActionPerformed(evt);
            }
        });

        siguienteBoton.setText("Siguiente");
        siguienteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBotonActionPerformed(evt);
            }
        });

        ConsolaLabelText.setText("Consola");

        consolaText.setEditable(false);
        consolaText.setColumns(20);
        consolaText.setRows(5);
        jScrollPane4.setViewportView(consolaText);

        Archivo.setLabel("Archivo");
        Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoActionPerformed(evt);
            }
        });

        nuevoArchivo.setText("Nuevo archivo");
        nuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoArchivoActionPerformed(evt);
            }
        });
        Archivo.add(nuevoArchivo);

        abrirArchivo.setText("Abrir archivo");
        abrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirArchivoActionPerformed(evt);
            }
        });
        Archivo.add(abrirArchivo);

        guardarArchivo.setText("Guardar");
        guardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarArchivoActionPerformed(evt);
            }
        });
        Archivo.add(guardarArchivo);

        GuardarComoBoton.setText("Guardar Como");
        GuardarComoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarComoBotonActionPerformed(evt);
            }
        });
        Archivo.add(GuardarComoBoton);

        menuBar.add(Archivo);

        Pestania.setText("Ventanas");

        nuevaPestania.setText("Nueva ventana");
        nuevaPestania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaPestaniaActionPerformed(evt);
            }
        });
        Pestania.add(nuevaPestania);

        eliminarPestania.setText("Eliminar ventana");
        eliminarPestania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPestaniaActionPerformed(evt);
            }
        });
        Pestania.add(eliminarPestania);

        menuBar.add(Pestania);

        EjecutarPesta.setText("Ejecutar");
        EjecutarPesta.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                EjecutarPestaMenuSelected(evt);
            }
        });

        ejecutarBoton.setText("Ejecutar");
        ejecutarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarBotonActionPerformed(evt);
            }
        });
        EjecutarPesta.add(ejecutarBoton);

        menuBar.add(EjecutarPesta);

        Reportes.setText("Reportes");

        TablaTokensBoton.setText("Tabla de Tokens");
        TablaTokensBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablaTokensBotonActionPerformed(evt);
            }
        });
        Reportes.add(TablaTokensBoton);

        TablaErroresBoton.setText("Tabla de errores");
        TablaErroresBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablaErroresBotonActionPerformed(evt);
            }
        });
        Reportes.add(TablaErroresBoton);

        TablaSimbolosBoton.setText("Tabla de Simbolos");
        TablaSimbolosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablaSimbolosBotonActionPerformed(evt);
            }
        });
        Reportes.add(TablaSimbolosBoton);

        menuBar.add(Reportes);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EntradaText)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelGraficas, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VerGraficasText)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(ConsolaLabelText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(anteriorBoton)
                        .addGap(29, 29, 29)
                        .addComponent(siguienteBoton)
                        .addGap(98, 98, 98)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntradaText)
                    .addComponent(VerGraficasText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(PanelGraficas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConsolaLabelText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(anteriorBoton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(siguienteBoton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private File archivoActual = null;
    
    
    //AGREGAR GRAFICAS A LA INTERFAZ
    
    public void agregarGráficaAlPanel(ChartPanel panelGráfica, String nombreGráfica) {
        panelDeGraficas.add(panelGráfica, nombreGráfica);
        panelDeGraficas.revalidate();
        panelDeGraficas.repaint();
    }

    public Dimension getPanelGraficasViewportSize() {
        return PanelGraficas.getViewport().getSize();
    }
    
    private void nuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoArchivoActionPerformed
        entradaText.setText("");
        consolaText.setText("");
        archivoActual = null;
        panelDeGraficas.removeAll();
        panelDeGraficas.revalidate();
        panelDeGraficas.repaint();
    }//GEN-LAST:event_nuevoArchivoActionPerformed

    private void abrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArchivoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivoActual = fileChooser.getSelectedFile();
            Path ruta = Paths.get(archivoActual.getAbsolutePath());

            try {
                String contenido = new String(Files.readAllBytes(ruta));
                entradaText.setText(contenido);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_abrirArchivoActionPerformed

    private void eliminarPestaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPestaniaActionPerformed
        this.dispose();
    }//GEN-LAST:event_eliminarPestaniaActionPerformed

    private void guardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarArchivoActionPerformed
        if (archivoActual != null) {
            Path ruta = Paths.get(archivoActual.getAbsolutePath());

            try {
                String contenido = entradaText.getText();
                Files.write(ruta, contenido.getBytes());
                JOptionPane.showMessageDialog(null, "Archivo guardado");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            //mostrar un mensaje al usuario.
            JOptionPane.showMessageDialog(null, "No se ha abierto ningún archivo.");
        }
    }//GEN-LAST:event_guardarArchivoActionPerformed

    private void ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoActionPerformed

    }//GEN-LAST:event_ArchivoActionPerformed

    private void EjecutarPestaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_EjecutarPestaMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_EjecutarPestaMenuSelected

    private void ejecutarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarBotonActionPerformed
        // TODO add your handling code here:
        consolaText.setText("");
        panelDeGraficas.removeAll();
        panelDeGraficas.revalidate();
        panelDeGraficas.repaint();
        analizador.Parser parser;
        analizador.Lexer lexer;
        //String contenido = entradaText.getText();
        //Analizar.analizar(contenido, this);
        ArrayList<ErroresTipo> fails = new ArrayList();
        ArrayList<Tokens> tokens = new ArrayList();
        ArrayList<Simbolos> simbolos = new ArrayList();
        
        
        
        
        try{
           lexer = new Lexer(new BufferedReader(new StringReader(entradaText.getText())));
           parser = new Parser(lexer);
           parser.setInterfaz(Interfaz.this);
           parser.parse();
           
           fails.addAll(lexer.fails);
           fails.addAll(parser.getFails());
           tokens.addAll(lexer.obtenerTokens());
           simbolos.addAll(parser.getSimbol());

           FailsGenerateHTML(fails);
           TokensGenerateHTML(tokens);
           simbolosGenerateHTML(simbolos, tokens);

        }catch(Exception e){
            consolaText.setText("Error fatal en la compilacion de entrada. \n"+e.getMessage());
        }
        
        
        
        
        
        
    }//GEN-LAST:event_ejecutarBotonActionPerformed

    public static void FailsGenerateHTML(ArrayList<ErroresTipo> errores) {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            String path = "Reportes/Fails.html";
            fichero = new FileWriter(path);
            pw = new PrintWriter(fichero);

            pw.println("<!DOCTYPE html>");
            pw.println("<html lang=\"es\">");
            pw.println("<head>");
            pw.println("<meta charset=\"UTF-8\">");
            pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            pw.println("<title>Errores</title>");
            pw.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">");
            pw.println("<style>");
            pw.println("body { background-color: #343a40; color: white; }");
            pw.println("h1 { text-align: center; color: white; }");
            pw.println("table { background-color: #343a40; }");
            pw.println("th, td { border: 1px solid #dee2e6; }");
            pw.println("th { background-color: #6c757d; }");
            pw.println("tr:nth-child(even) { background-color: #495057; }");
            pw.println("</style>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<div class=\"container mt-5\">");
            pw.println("<h1>Reporte de Errores</h1>");
            pw.println("<table class=\"table table-dark table-striped mt-3\">");
            pw.println("<thead>");
            pw.println("<tr>");
            pw.println("<th>#</th>");
            pw.println("<th>Tipo</th>");
            pw.println("<th>Descripción</th>");
            pw.println("<th>Fila</th>");
            pw.println("<th>Columna</th>");
            pw.println("</tr>");
            pw.println("</thead>");
            pw.println("<tbody>");

            int numError = 1;
            for (ErroresTipo err : errores) {
                pw.println("<tr>");
                pw.println("<td>" + numError++ + "</td>");
                pw.println("<td>" + err.tipo + "</td>");
                pw.println("<td>" + err.des + "</td>");
                pw.println("<td>" + err.fila + "</td>");
                pw.println("<td>" + err.columna + "</td>");
                pw.println("</tr>");
            }

            pw.println("</tbody>");
            pw.println("</table>");
            pw.println("</div>");
            pw.println("</body>");
            pw.println("</html>");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void TokensGenerateHTML(ArrayList<Tokens> tokens) {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            String path = "Reportes/Tokens.html";
            fichero = new FileWriter(path);
            pw = new PrintWriter(fichero);

            pw.println("<!DOCTYPE html>");
            pw.println("<html lang=\"es\">");
            pw.println("<head>");
            pw.println("<meta charset=\"UTF-8\">");
            pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            pw.println("<title>Tokens</title>");
            pw.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">");
            pw.println("<style>");
            pw.println("body { background-color: #343a40; color: white; }");
            pw.println("h1 { text-align: center; color: white; }");
            pw.println("table { background-color: #343a40; }");
            pw.println("th, td { border: 1px solid #dee2e6; }");
            pw.println("th { background-color: #6c757d; }");
            pw.println("tr:nth-child(even) { background-color: #495057; }");
            pw.println("</style>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<div class=\"container mt-5\">");
            pw.println("<h1>Reporte Tokens</h1>");
            pw.println("<table class=\"table table-dark table-striped mt-3\">");
            pw.println("<thead>");
            pw.println("<tr>");
            pw.println("<th>#</th>");
            pw.println("<th>Lexema</th>");
            pw.println("<th>Token</th>");
            pw.println("<th>Fila</th>");
            pw.println("<th>Columna</th>");
            pw.println("</tr>");
            pw.println("</thead>");
            pw.println("<tbody>");

            int tokenCount = 1;
            for (Tokens token : tokens) {
                pw.println("<tr>");
                pw.println("<td>" + tokenCount++ + "</td>");
                pw.println("<td>" + token.getLexema() + "</td>");
                pw.println("<td>" + token.getToken() + "</td>");
                pw.println("<td>" + token.getFila() + "</td>");
                pw.println("<td>" + token.getColumna() + "</td>");
                pw.println("</tr>");
            }

            pw.println("</tbody>");
            pw.println("</table>");

            pw.println("</div>");
            pw.println("</body>");
            pw.println("</html>");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
  

    private void simbolosGenerateHTML(ArrayList<Simbolos> simbol, ArrayList<Tokens> tokens) {

        HashMap<String, int[]> posicion = new HashMap<>();

        for (Tokens token : tokens) {
            if((token.getToken().equals("ID") || token.getToken().equals("ID_ARREGLO")) && !posicion.containsKey(token.getLexema())){
                posicion.put(token.getLexema(), new int[]{token.getFila(), token.getColumna()});
            }
        }

        for (Simbolos simbolo : simbol) {
            if(posicion.containsKey(simbolo.getNombre())){
                int[] pos = posicion.get(simbolo.getNombre());
                simbolo.setFila(pos[0]);
                simbolo.setColumna(pos[1]);

            }
            //System.out.println("Nombre: " + simbolo.getNombre() + " Tipo: " + simbolo.getTipo() + " Valor: " + simbolo.getValor()+ " Fila: " + simbolo.getFila() + " Columna: " + simbolo.getColumna());
        }

        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            String path = "Reportes/Simbolos.html";
            fichero = new FileWriter(path);
            pw = new PrintWriter(fichero);

            pw.println("<!DOCTYPE html>");
            pw.println("<html lang=\"es\">");
            pw.println("<head>");
            pw.println("<meta charset=\"UTF-8\">");
            pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            pw.println("<title>Simbolos</title>");
            pw.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">");
            pw.println("<style>");
            pw.println("body { background-color: #343a40; color: white; }");
            pw.println("h1 { text-align: center; color: white; }");
            pw.println("table { background-color: #343a40; }");
            pw.println("th, td { border: 1px solid #dee2e6; }");
            pw.println("th { background-color: #6c757d; }");
            pw.println("tr:nth-child(even) { background-color: #495057; }");
            pw.println("</style>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<div class=\"container mt-5\">");
            pw.println("<h1>Reporte Simbolos</h1>");
            pw.println("<table class=\"table table-dark table-striped mt-3\">");
            pw.println("<thead>");
            pw.println("<tr>");
            pw.println("<th>#</th>");
            pw.println("<th>Nombre</th>");
            pw.println("<th>Tipo</th>");
            pw.println("<th>Valor</th>");
            pw.println("<th>Fila</th>");
            pw.println("<th>Columna</th>");
            pw.println("</tr>");
            pw.println("</thead>");
            pw.println("<tbody>");

            int tokenCount = 1;
            for (Simbolos simbolo : simbol) {
                pw.println("<tr>");
                pw.println("<td>" + tokenCount++ + "</td>");
                pw.println("<td>" + simbolo.getNombre() + "</td>");
                pw.println("<td>" + simbolo.getTipo()+ "</td>");
                pw.println("<td>" + simbolo.getValor() + "</td>");
                pw.println("<td>" + simbolo.getFila() + "</td>");
                pw.println("<td>" + simbolo.getColumna() + "</td>");
                pw.println("</tr>");
            }

            pw.println("</tbody>");
            pw.println("</table>");

            pw.println("</div>");
            pw.println("</body>");
            pw.println("</html>");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }


    private void TablaTokensBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablaTokensBotonActionPerformed
        // TODO add your handling code here:
        try {
            String path =  "Reportes/Tokens.html";               
            File file = new File(path);
            if (file.exists()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
             }else {
                JOptionPane.showMessageDialog(this, "El archivo no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
                 }
     }catch(IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al abrir el archivo .", "ERROR", JOptionPane.ERROR_MESSAGE);
                             }
    }//GEN-LAST:event_TablaTokensBotonActionPerformed

    private void TablaErroresBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablaErroresBotonActionPerformed

        try {
               String path =  "Reportes/Fails.html";               
               File file = new File(path);
               if (file.exists()) {
                   Desktop desktop = Desktop.getDesktop();
                   desktop.open(file);
                }else {
                   JOptionPane.showMessageDialog(this, "El archivo no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
        }catch(IOException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(this, "Error al abrir el archivo .", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
        
    }//GEN-LAST:event_TablaErroresBotonActionPerformed

    private void nuevaPestaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaPestaniaActionPerformed
        Interfaz nuevaVentana = new Interfaz();
        nuevaVentana.setVisible(true);
    }//GEN-LAST:event_nuevaPestaniaActionPerformed

    private void anteriorBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorBotonActionPerformed
        cardLayout.previous(panelDeGraficas);
    }//GEN-LAST:event_anteriorBotonActionPerformed

    //botones para controlar el scroll de las gráficas

    private void siguienteBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBotonActionPerformed
        cardLayout.next(panelDeGraficas);
    }//GEN-LAST:event_siguienteBotonActionPerformed

    private void GuardarComoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarComoBotonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar como");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            Path ruta = Paths.get(fileToSave.getAbsolutePath());

            try {
                String contenido = entradaText.getText();
                Files.write(ruta, contenido.getBytes());
                archivoActual = fileToSave; // Actualiza el archivo actual
                JOptionPane.showMessageDialog(null, "Archivo guardado como: " + fileToSave.getName());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_GuardarComoBotonActionPerformed

    private void TablaSimbolosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablaSimbolosBotonActionPerformed
        // TODO add your handling code here:
        try {
               String path = "Reportes/Simbolos.html";               
               File file = new File(path);
               if (file.exists()) {
                   Desktop desktop = Desktop.getDesktop();
                   desktop.open(file);
                }else {
                   JOptionPane.showMessageDialog(this, "El archivo no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
        }catch(IOException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(this, "Error al abrir el archivo .", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
    }//GEN-LAST:event_TablaSimbolosBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    
    public void appendConsolaText(String message, boolean newLine){
        if (newLine){
            consolaText.append(message+"\n");
        }else{
            consolaText.append(message);
        }
    }
    
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JLabel ConsolaLabelText;
    private javax.swing.JMenu EjecutarPesta;
    private javax.swing.JLabel EntradaText;
    private javax.swing.JMenuItem GuardarComoBoton;
    private javax.swing.JScrollPane PanelGraficas;
    private javax.swing.JMenu Pestania;
    private javax.swing.JMenu Reportes;
    private javax.swing.JMenuItem TablaErroresBoton;
    private javax.swing.JMenuItem TablaSimbolosBoton;
    private javax.swing.JMenuItem TablaTokensBoton;
    private javax.swing.JLabel VerGraficasText;
    private javax.swing.JMenuItem abrirArchivo;
    private javax.swing.JButton anteriorBoton;
    private javax.swing.JTextArea consolaText;
    private javax.swing.JMenuItem ejecutarBoton;
    private javax.swing.JMenuItem eliminarPestania;
    private javax.swing.JTextArea entradaText;
    private javax.swing.JMenuItem guardarArchivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem nuevaPestania;
    private javax.swing.JMenuItem nuevoArchivo;
    private javax.swing.JButton siguienteBoton;
    // End of variables declaration//GEN-END:variables
}
