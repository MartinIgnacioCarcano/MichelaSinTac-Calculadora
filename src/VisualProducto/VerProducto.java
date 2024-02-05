package VisualProducto;

import Controllers.PicController;
import Controllers.ProductoController;
import Entidades.Pic;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VerProducto extends javax.swing.JFrame {

    //ATRIBUTOS
    ArrayList<Pic> listaPic = new ArrayList();
    PicController pic = new PicController();
    ProductoController pc = new ProductoController();
    DefaultListModel ingredientes = new DefaultListModel();
    ListaProducto listaProducto;
    boolean contadorClick;
    int idProducto;

    //CONSTRUCTORES
    public VerProducto() {
        initComponents();
    }

    public VerProducto(int idPro, ListaProducto listaProducto) {
        initComponents();
        idProducto = idPro;
        this.listaProducto = listaProducto;
        listaIngredientes.setModel(ingredientes);
        listaPic = pic.llenarPics(idPro);
        this.setLocationRelativeTo(listaProducto);
        llenarPantalla(idPro);
    }

    public VerProducto(ListaProducto listaProducto) {
        initComponents();
        this.listaProducto = listaProducto;
        listaIngredientes.setModel(ingredientes);
        listaPic = new ArrayList();
        this.setLocationRelativeTo(listaProducto);
        idProducto = pc.crearProducto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaCompleta = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();
        pantallaPanel = new javax.swing.JPanel();
        nombreTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaIngredientes = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        eliminarIngredienteBtn = new javax.swing.JButton();
        agregarIngredienteBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        precioTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pantallaCompleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(204, 204, 204));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Receta");
        menuPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        guardarBtn.setText("GUARDAR");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });
        menuPanel.add(guardarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        pantallaCompleta.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 70));

        pantallaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pantallaPanel.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 360, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ingredientes:");
        pantallaPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        listaIngredientes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaIngredientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaIngredientes);

        pantallaPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 460, 270));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Nombre:");
        pantallaPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        eliminarIngredienteBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        eliminarIngredienteBtn.setText("Eliminar");
        eliminarIngredienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarIngredienteBtnActionPerformed(evt);
            }
        });
        pantallaPanel.add(eliminarIngredienteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        agregarIngredienteBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        agregarIngredienteBtn.setText("Agregar");
        agregarIngredienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarIngredienteBtnActionPerformed(evt);
            }
        });
        pantallaPanel.add(agregarIngredienteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Precio:");
        pantallaPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        precioTxt.setEditable(false);
        precioTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pantallaPanel.add(precioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 260, -1));

        pantallaCompleta.add(pantallaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 620, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantallaCompleta, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pantallaCompleta, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarIngredienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarIngredienteBtnActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Seguro quiere eliminar?", "Eliminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            int index = listaIngredientes.getSelectedIndex();
            pic.eliminarPic(listaPic.get(index).getId());
            actualizarDatos();
        }
    }//GEN-LAST:event_eliminarIngredienteBtnActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        if (nombreTxt.getText().isEmpty() && listaPic.isEmpty()) {
            System.out.println("xd");
        } else {
            pc.actualizarNombre(idProducto, nombreTxt.getText());
            pic.actualizarProducto(listaPic);
            llenarPantalla(idProducto);
            listaProducto.actualizarDatos();
            this.dispose();
        }

    }//GEN-LAST:event_guardarBtnActionPerformed

    private void agregarIngredienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarIngredienteBtnActionPerformed
        if (nombreTxt.getText().isEmpty()) {
            AgregarIngrediente agregar = new AgregarIngrediente(this);
            agregar.setVisible(true);
        } else {
            pc.actualizarNombre(idProducto, nombreTxt.getText());
            pic.actualizarProducto(listaPic);
            llenarPantalla(idProducto);
            AgregarIngrediente agregar = new AgregarIngrediente(this);
            agregar.setVisible(true);
        }

    }//GEN-LAST:event_agregarIngredienteBtnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (nombreTxt.getText().isEmpty() && listaPic.isEmpty()) {
            listaProducto.eliminarProducto(idProducto);
        }
    }//GEN-LAST:event_formWindowClosed

    private void listaIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaIngredientesMouseClicked
        contadorClick = false;
        if (evt.getClickCount() == 2) {
            int index = listaIngredientes.getSelectedIndex();
            int id = listaPic.get(index).getId();
            AgregarIngrediente agregar = new AgregarIngrediente(id, this);
            agregar.setVisible(true);
        }
    }//GEN-LAST:event_listaIngredientesMouseClicked

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
            java.util.logging.Logger.getLogger(VerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarIngredienteBtn;
    private javax.swing.JButton eliminarIngredienteBtn;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaIngredientes;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPanel pantallaCompleta;
    private javax.swing.JPanel pantallaPanel;
    private javax.swing.JTextField precioTxt;
    // End of variables declaration//GEN-END:variables

    public void llenarPantalla(int idPro) {
        nombreTxt.setText(pc.llenarNombre(idPro));
        precioTxt.setText(pc.llenarPrecio(idPro));
        ingredientes.removeAllElements();
        String[] lista = pic.llenarPantalla(listaPic);
        for (String listas : lista) {
            ingredientes.addElement(listas);
        }
    }

    public void actualizarDatos() {
        pc.actualizarDatos(idProducto);
        listaPic = pic.llenarPics(idProducto);
        listaProducto.actualizarDatos();
        llenarPantalla(idProducto);
    }

}
