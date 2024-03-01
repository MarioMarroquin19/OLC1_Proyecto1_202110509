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
import org.jfree.chart.ChartPanel;





/**
 *
 * @author mario
 */
public class Interfaz extends javax.swing.JFrame {
    
    private CardLayout cardLayout = new CardLayout();
    private JPanel panelDeGraficas = new JPanel(cardLayout);
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
        Reportes.add(TablaSimbolosBoton);

        menuBar.add(Reportes);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(anteriorBoton)
                        .addGap(18, 18, 18)
                        .addComponent(siguienteBoton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConsolaLabelText)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EntradaText))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(VerGraficasText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PanelGraficas)))))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntradaText)
                    .addComponent(VerGraficasText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(PanelGraficas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConsolaLabelText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(anteriorBoton)
                        .addComponent(siguienteBoton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        String contenido = entradaText.getText();
        Analizar.analizar(contenido, this);        
    }//GEN-LAST:event_ejecutarBotonActionPerformed

    private void TablaTokensBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablaTokensBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaTokensBotonActionPerformed

    private void TablaErroresBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablaErroresBotonActionPerformed
        // TODO add your handling code here:
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
