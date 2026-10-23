package com.mycompany.tema_01_02.VISTA;

import com.mycompany.tema_01_02.CONTROLADOR.FpagoController;
import com.mycompany.tema_01_02.CONTROLADOR.PrestamosController;
import com.mycompany.tema_01_02.CONTROLADOR.RecibosController;
import com.mycompany.tema_01_02.MODELO.Fpago;
import com.mycompany.tema_01_02.MODELO.Prestamos;
import com.mycompany.tema_01_02.MODELO.Recibos;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDialogPrestamosRecibos extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JDialogPrestamosRecibos.class.getName());

    private PrestamosController PScontrolador;
    private FpagoController FPcontrolador;
    private RecibosController RScontrolador;
    
    public JDialogPrestamosRecibos(java.awt.Frame parent, boolean modal, Connection con) {
        super(parent, modal);
        
        initComponents();
        PScontrolador = new PrestamosController(con);
        FPcontrolador = new FpagoController(con);
        RScontrolador = new RecibosController(con);
        
        tablaFija();
       
        ArrayList<Prestamos> lista = PScontrolador.readAll();
        cargarTablaPrestamos(lista);
        
        
        try 
        {
            ArrayList<Fpago> listaFpago = FPcontrolador.readAll();
            jComboBoxFormasPago.removeAllItems();
            for (Fpago fp : listaFpago)
            {
                jComboBoxFormasPago.addItem(fp.getCCODFPAGO());
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage());
        }
        
        cargarTablaRecibosVacio();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButtonCreate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonRead = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrestamos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldImporteRecibo = new javax.swing.JTextField();
        jButtonReadById = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldImporte = new javax.swing.JTextField();
        jComboBoxFormasPago = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRecibos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        jButtonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        jButtonCreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCreate.setFocusable(false);
        jButtonCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCreate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCreate.addActionListener(this::jButtonCreateActionPerformed);
        jToolBar1.add(jButtonCreate);

        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jButtonDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDelete.setFocusable(false);
        jButtonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDelete.addActionListener(this::jButtonDeleteActionPerformed);
        jToolBar1.add(jButtonDelete);

        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        jButtonUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonUpdate.setFocusable(false);
        jButtonUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUpdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonUpdate.addActionListener(this::jButtonUpdateActionPerformed);
        jToolBar1.add(jButtonUpdate);

        jButtonRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/readAllback.png"))); // NOI18N
        jButtonRead.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRead.setFocusable(false);
        jButtonRead.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRead.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRead.addActionListener(this::jButtonReadActionPerformed);
        jToolBar1.add(jButtonRead);

        jTablePrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePrestamos);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prestamos");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Formas de Pago");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Numero");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Importe Prestamo");

        jButtonReadById.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonReadById.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButtonReadById.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonReadById.addActionListener(this::jButtonReadByIdActionPerformed);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Importe Recibo");

        jComboBoxFormasPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFormasPago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldImporteRecibo)
                            .addComponent(jTextFieldFecha)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonReadById, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldImporte, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxFormasPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonReadById, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldImporteRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFormasPago, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTableRecibos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableRecibos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        try {
        
        String numTexto = jTextFieldNumero.getText().trim();
        String fechaTexto = jTextFieldFecha.getText().trim();
        String impPrestTexto = jTextFieldImporte.getText().trim();
        String impReciTexto = jTextFieldImporteRecibo.getText().trim();
        
       
        if (numTexto.isEmpty() || impPrestTexto.isEmpty() || impReciTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, rellena los campos obligatorios (Número e Importes).", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }
   
        int numPrest = Integer.parseInt(numTexto);
        
        if (validarPKCrear(numPrest) == false) {
            return; 
        }

        double impPrest = Double.parseDouble(impPrestTexto);
        double impReci = Double.parseDouble(impReciTexto);
            
        LocalDate fecha = fechaTexto.isEmpty() ? LocalDate.now() : LocalDate.parse(fechaTexto);
        
        String codFPago = jComboBoxFormasPago.getSelectedItem().toString();

        Prestamos nuevoPrestamo = new Prestamos(numPrest, fecha, impPrest, impReci, codFPago);

        int filasAfectadas = PScontrolador.create(nuevoPrestamo); 

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "¡Préstamo creado correctamente!");

            cargarTablaPrestamos(PScontrolador.readAll());

            int recibosGenerados = RScontrolador.generarRecibos(numTexto);
           
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo crear el préstamo en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error de formato: El número de préstamo y los importes deben ser valores numéricos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonReadByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadByIdActionPerformed
        // TODO add your handling code here:
        
        if (validarBusquedaId() == false) 
        {
            return;
        }
        
        try 
        {
            int numero = Integer.parseInt(jTextFieldNumero.getText().trim().toUpperCase());
            Prestamos prBuscado = PScontrolador.readById(numero);
            
            if (prBuscado == null) 
            {
                JOptionPane.showMessageDialog(this, "No existe el prestamo introducido");
                return;
            }
            
            cargarTablaBuscado(prBuscado);
            cargarCamposBuscado(prBuscado);
            
            String id = jTextFieldNumero.getText().trim();
            ArrayList<Recibos> lista = RScontrolador.findById(id);
            cargarTablaRecibos(lista);
            
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonReadByIdActionPerformed

    private void jTablePrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrestamosMouseClicked
        // TODO add your handling code here:
        cargarCamposTabla();
        
        
        String id = jTextFieldNumero.getText().trim();
        
        ArrayList<Recibos> lista = RScontrolador.findById(id);
        cargarTablaRecibos(lista);
    }//GEN-LAST:event_jTablePrestamosMouseClicked

    private void jButtonReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadActionPerformed
        // TODO add your handling code here:
        
        ArrayList<Prestamos> lista = PScontrolador.readAll();
        cargarTablaPrestamos(lista);
        
    }//GEN-LAST:event_jButtonReadActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        
        if (cargarCamposTabla() == false) 
        {
            return;
        }
        if (validarBusquedaId() == false) 
        {
            return;
        }
        if (EliminarSioNo() == false) 
        {
            return;
        }
        
        int id = Integer.parseInt(jTextFieldNumero.getText().trim());
        
        if (RScontrolador.tieneRecibosPagados(id)) {
            JOptionPane.showMessageDialog(this,"No se puede eliminar el prestamo porque tiene al menos un recibo pagado. ");
            return;
        }
        
        
        
        RScontrolador.deleteByPrestamoId(id);
        
        int filasAfectadas = PScontrolador.deleteById(id);
        
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "ELIMINADO CORRECTAMENTE");
            limpiarCampos();
            
            ArrayList<Prestamos> lista = PScontrolador.readAll();
            cargarTablaPrestamos(lista);
            
            cargarTablaRecibos(new ArrayList<>());
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar el prestamo en la base de datos.");
        }
        
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        
        
        if (validarBusquedaId() == false) { 
        return;
    }
    
    if (validarPKModificar() == false) {
        return;
    }
    
    if (ActualizarSIoNo() == false) { 
        return;
    }
    
    try {
        int numPrest = Integer.parseInt(jTextFieldNumero.getText().trim());
        String fechaTexto = jTextFieldFecha.getText().trim();
        double impPrest = Double.parseDouble(jTextFieldImporte.getText().trim());
        double impReci = Double.parseDouble(jTextFieldImporteRecibo.getText().trim());
        
        java.time.LocalDate fecha = fechaTexto.isEmpty() ? java.time.LocalDate.now() : java.time.LocalDate.parse(fechaTexto);
        String codFPago = jComboBoxFormasPago.getSelectedItem().toString();

        Prestamos prestamoModificado = new Prestamos(numPrest, fecha, impPrest, impReci, codFPago);
        int filasAfectadas = PScontrolador.update(prestamoModificado);
        
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "¡Préstamo modificado correctamente!");
        }
        
        ArrayList<Prestamos> lista = PScontrolador.readAll();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La lista está vacía");
        }
        cargarTablaPrestamos(lista);
        limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ERROR de formato numérico: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed
    
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDialogPrestamosRecibos dialog = new JDialogPrestamosRecibos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonRead;
    private javax.swing.JButton jButtonReadById;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxFormasPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePrestamos;
    private javax.swing.JTable jTableRecibos;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldImporte;
    private javax.swing.JTextField jTextFieldImporteRecibo;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    
    public void cargarTablaPrestamos(ArrayList<Prestamos> lista)
    {
        DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("Numero");
            modelo.addColumn("Fecha");
            modelo.addColumn("Importe prestamo");
            modelo.addColumn("Importe recibo");
            modelo.addColumn("Forma de pago");
            
            for (Prestamos pr : lista) 
            {
                Object[] fila = new Object[5];
                        fila[0] = pr.getNumPrest();
                        fila[1] = pr.getFecPrest();
                        fila[2] = pr.getImpPrest();
                        fila[3] = pr.getImpReci();
                        fila[4] = pr.getCodFPago();
                modelo.addRow(fila);
            }
        jTablePrestamos.setModel(modelo);
    }
    
    public void cargarTablaBuscado(Prestamos ps)
    {
        DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("Numero");
            modelo.addColumn("Fecha");
            modelo.addColumn("Importe prestamo");
            modelo.addColumn("Importe recibo");
            modelo.addColumn("Forma de pago");
            
            
                Object[] fila = new Object[5];
                        fila[0] = ps.getNumPrest();
                        fila[1] = ps.getFecPrest();
                        fila[2] = ps.getImpPrest();
                        fila[3] = ps.getImpReci();
                        fila[4] = ps.getCodFPago();
                modelo.addRow(fila);
            
        jTablePrestamos.setModel(modelo);
    }
    
    
    public void cargarTablaRecibos(ArrayList<Recibos> lista)
    {
        DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("Numero prestamo");
            modelo.addColumn("Numero recibo");
            modelo.addColumn("Fecha recibo");
            modelo.addColumn("Importe recibo");
            modelo.addColumn("fecha pago");
            
            for (Recibos rs : lista) 
            {
                Object[] fila = new Object[5];
                        fila[0] = rs.getNNUMPREST();
                        fila[1] = rs.getNNUMRECIB();
                        fila[2] = rs.getDFECREC();
                        fila[3] = rs.getNIMPREC();
                        fila[4] = rs.getDFECPAGO();
                modelo.addRow(fila);
            }
        jTableRecibos.setModel(modelo);
    }
    
    public void cargarTablaRecibosVacio()
    {
        DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("Numero prestamo");
            modelo.addColumn("Numero recibo");
            modelo.addColumn("Fecha recibo");
            modelo.addColumn("Importe recibo");
            modelo.addColumn("fecha pago");
            
            
        jTableRecibos.setModel(modelo);
    }

    
    public boolean validarBusquedaId()
    {
        String numeroTexto = jTextFieldNumero.getText().trim();
        
        if (numeroTexto.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "El campo numero esta vacio");
            return false;
        }
        if (numeroTexto.length() > 10) 
        {
            JOptionPane.showMessageDialog(this, "El numero no debe superar los 10 digitos");
            return false;
        }
        
        try 
        {
            int numero = Integer.parseInt(numeroTexto);
            
            if (numero < 0) 
            {
                JOptionPane.showMessageDialog(this, "El campo numero no puede ser negativo");
                return false;
            }
            if (numero > 2147483647) 
            {
                JOptionPane.showMessageDialog(this, "El campo numero no puede ser mayor de 2147483647");
                return false;
            }
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage());
            return false;
        }
        return true;
    }
    
    
    public boolean cargarCamposTabla()
    {
        int seleccionado = jTablePrestamos.getSelectedRow();
        
        if (seleccionado == -1) 
        {
            JOptionPane.showMessageDialog(this, "No hay ninguna fila seleccionada");
            return false;
        }
        
        jTextFieldNumero.setText(jTablePrestamos.getValueAt(seleccionado, 0).toString());
        jTextFieldFecha.setText(jTablePrestamos.getValueAt(seleccionado, 1).toString());
        jTextFieldImporte.setText(jTablePrestamos.getValueAt(seleccionado, 2).toString());
        jTextFieldImporteRecibo.setText(jTablePrestamos.getValueAt(seleccionado, 3).toString());
        String codigo = jTablePrestamos.getValueAt(seleccionado, 4).toString();
        jComboBoxFormasPago.setSelectedItem(codigo);
        return true;
    }
    
    
    public void cargarComboFormasPago()
    {
        try
        {
            ArrayList<Fpago> listaFp = FPcontrolador.readAll();

            jComboBoxFormasPago.removeAllItems();

            for (Fpago fp : listaFp)
            {
                jComboBoxFormasPago.addItem(fp.getCCODFPAGO());
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(this,
                    "Error al cargar formas de pago: " + e.getMessage());
        }
    }
    
    public void cargarCamposBuscado(Prestamos ps)
    {
        if (ps == null) 
        {
            JOptionPane.showMessageDialog(this, "No existe el prestamo");
            return;
        }
        
        jTextFieldNumero.setText(String.valueOf(ps.getNumPrest()).toString());
        jTextFieldFecha.setText(String.valueOf(ps.getFecPrest()));
        jTextFieldImporte.setText(String.valueOf(ps.getImpPrest()));
        jTextFieldImporteRecibo.setText(String.valueOf(ps.getImpReci()));
        String codigo = ps.getCodFPago();
        jComboBoxFormasPago.setSelectedItem(codigo);
    }
    
    public boolean EliminarSioNo()
    {
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar el prestamo?",
                                            "Eliminar",
                                            JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) 
        {
            return true;
        }
        return false;
    }
    
    public boolean crearSIoNo() 
    {
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estas seguro de que quieres crear el prestamo","Confirmacion",JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }
    
    public void limpiarCampos()
    {
        jTextFieldNumero.setText("");
        jTextFieldFecha.setText("");
        jTextFieldImporte.setText("");
        jTextFieldImporteRecibo.setText("");
        jComboBoxFormasPago.setSelectedItem("");
    }
    
    public void tablaFija()
    {
        jTablePrestamos.getTableHeader().setReorderingAllowed(false);
        jTableRecibos.getTableHeader().setReorderingAllowed(false);
        jTablePrestamos.getTableHeader().setResizingAllowed(false);
        jTableRecibos.getTableHeader().setResizingAllowed(false);
        jTablePrestamos.setDefaultEditor(Object.class, null);
        jTableRecibos.setDefaultEditor(Object.class, null);
    }
    
    public boolean ActualizarSIoNo()
    {
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estas seguro de modificar la forma de pago?",
                                                            "confirmar",
                                                            JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) 
        {
            return true;
        }
        return false;
    }
    
    public boolean validarPKModificar() {
       try {
           int filaSeleccionada = jTablePrestamos.getSelectedRow();
           if (filaSeleccionada != -1) {
               String pkOriginal = jTablePrestamos.getValueAt(filaSeleccionada, 0).toString();
               String pkActual = jTextFieldNumero.getText().trim();

               if (!pkOriginal.equals(pkActual)) {
                   throw new Exception("No se puede modificar el número de préstamo porque es la clave primaria (PK).");
               }
           }
           return true;

       } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);
           return false; 
       }
   }
    
    public boolean validarPKCrear(int nuevoNumPrestamo) {
        try {
            Prestamos prestamoExistente = PScontrolador.readById(nuevoNumPrestamo);

            if (prestamoExistente != null) {
                JOptionPane.showMessageDialog(this, "Ya existe un préstamo con el número " + nuevoNumPrestamo);
                return false; 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage());
            return false;
        }
        return true; 

    }
}



