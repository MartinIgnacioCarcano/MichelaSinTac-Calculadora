package VisualProducto;

import Controllers.IngredienteController;
import Controllers.PicController;
import Entidades.Ingrediente;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class AgregarIngrediente extends javax.swing.JFrame {

    VerProducto verProducto;
    ArrayList<Ingrediente> listaIngredientes;
    IngredienteController ic = new IngredienteController();
    PicController pic = new PicController();
    DefaultListModel ingredientes = new DefaultListModel();
    int idPic;

    public AgregarIngrediente() {
        initComponents();
    }

    public AgregarIngrediente(VerProducto verProducto) {
        initComponents();
        this.idPic = -1;
        this.verProducto = verProducto;
        listaIngredientes = ic.devolverListaIngredientes();
        ingredientesList.setModel(ingredientes);
        llenarPantalla();
        this.setLocationRelativeTo(verProducto);
    }

    public AgregarIngrediente(int idPic, VerProducto verProducto) {
        initComponents();
        this.idPic = idPic;
        this.verProducto = verProducto;
        listaIngredientes = ic.devolverListaIngredientes();
        ingredientesList.setModel(ingredientes);
        llenarPantalla();
        this.setLocationRelativeTo(verProducto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaCompleta = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        guardarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingredientesList = new javax.swing.JList<>();
        ingredienteBox = new javax.swing.JComboBox<>();
        cantidadTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buscarTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        cerrarBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pantallaCompleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Agregar Ingredientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pantallaCompleta.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(guardarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        ingredientesList.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(ingredientesList);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 290, 220));

        ingredienteBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ingredienteBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilo", "Gramos", "Litro", "Mililitro (ml)", "Unidad", "Cucharada", "Cucharadita" }));
        jPanel2.add(ingredienteBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 170, -1));

        cantidadTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(cantidadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 170, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("- Cantidad");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("- Ingredientes");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        buscarTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buscarTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarTxtKeyPressed(evt);
            }
        });
        jPanel2.add(buscarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 50));

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });
        jPanel2.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 110, 50));

        cerrarBtn.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cerrarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarBtn.setText("X");
        cerrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarBtnMouseClicked(evt);
            }
        });
        jPanel2.add(cerrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 60, 70));

        pantallaCompleta.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 510, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantallaCompleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantallaCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        guardar();
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void buscarTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarTxtKeyPressed
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER) {
            buscar();
        }
    }//GEN-LAST:event_buscarTxtKeyPressed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        buscar();
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void cerrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarBtnMouseClicked
        buscarTxt.setText("");
        actualizarDatos();
        llenarPantalla();
    }//GEN-LAST:event_cerrarBtnMouseClicked

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
            java.util.logging.Logger.getLogger(AgregarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarIngrediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTxt;
    private javax.swing.JTextField cantidadTxt;
    private javax.swing.JLabel cerrarBtn;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JComboBox<String> ingredienteBox;
    private javax.swing.JList<String> ingredientesList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pantallaCompleta;
    // End of variables declaration//GEN-END:variables

    private void llenarPantalla() {
        ingredientes.removeAllElements();
        String[] lista = ic.llenarPantalla(listaIngredientes);
        for (String listas : lista) {
            ingredientes.addElement(listas);
        }
        ingredienteBox.setSelectedIndex(1);
        if (idPic != -1) {
            String cantidad = pic.devolverCantidad(idPic);
            int idIngre = pic.devolverIdIngre(idPic);
            int index = ic.buscarIndice(idIngre, listaIngredientes);
            int indice = obtenerIndice();
            ingredienteBox.setSelectedIndex(indice);
            cantidadTxt.setText(cantidad);
            ingredientesList.setSelectedIndex(index);
        }
    }

    private double obtenerCantidad() {
        int index = ingredienteBox.getSelectedIndex();
        double cantidad = Double.parseDouble(cantidadTxt.getText());
        switch (index) {
            case 0:
                cantidad = cantidad * 1000;
                break;
            case 2:
                cantidad = cantidad * 1000;
                break;
            case 5:
                cantidad = cantidad * 10;
                break;
            case 6:
                cantidad = cantidad * 5;
                break;
        }
        return cantidad;
    }

    private int obtenerIdIngre() {
        int aux = ingredientesList.getSelectedIndex();
        int id = listaIngredientes.get(aux).getId();
        return id;
    }

    private String obtenerUnidad() {
        int index = ingredienteBox.getSelectedIndex();
        String unidad = "";
        switch (index) {
            case 0:
                //KILO
                unidad = "k";
                break;
            case 1:
                //GRAMO
                unidad = "g";
                break;
            case 2:
                //LITRO
                unidad = "l";
                break;
            case 3:
                //CENTIMETRO CUBICO / MILILITRO
                unidad = "c";
                break;
            case 4:
                //UNIDAD
                unidad = "u";
                break;
            case 5:
                //CUCHARADA
                unidad = "s";
                break;
            case 6:
                //CUCHARADITA
                unidad = "n";
                break;
        }
        return unidad;
    }

    private void guardar() {
        double cantidad = obtenerCantidad();
        int idIngre = obtenerIdIngre();
        int idProducto = verProducto.idProducto;
        String unidad = obtenerUnidad();
        if (idPic == -1) {
            if (ic.agregarNuevoIngrediente(idIngre, idProducto, cantidad, unidad)) {
                verProducto.actualizarDatos();
                this.dispose();
            } else {
                verProducto.llenarPantalla(idProducto);
            }
        } else {
            if (pic.actualizarPic(idPic, idIngre, idProducto, cantidad,unidad )) {
                verProducto.actualizarDatos();
                this.dispose();
            } else {
                verProducto.llenarPantalla(idProducto);
            }
        }

    }

    private void buscar() {
        listaIngredientes = ic.devolverListaIngredientes();
        String buscar = buscarTxt.getText();
        listaIngredientes = ic.buscar(buscar, listaIngredientes);
        llenarPantalla();
    }

    private void actualizarDatos() {
        listaIngredientes = ic.devolverListaIngredientes();
    }

    private int obtenerIndice() {
        ArrayList<String> listaUnidades = new ArrayList();
        listaUnidades.add("k");
        listaUnidades.add("g");
        listaUnidades.add("l");
        listaUnidades.add("c");
        listaUnidades.add("u");
        listaUnidades.add("s");
        listaUnidades.add("n");
        String unidad = pic.devolverUnidad(idPic);
        return pic.indiceDelBox(unidad, listaUnidades);
    }

}
