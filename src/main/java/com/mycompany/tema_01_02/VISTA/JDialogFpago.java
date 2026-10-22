
package com.mycompany.tema_01_02.VISTA;

import com.mycompany.tema_01_02.CONTROLADOR.FpagoController;
import com.mycompany.tema_01_02.MODELO.Fpago;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JDialogFpago extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JDialogFpago.class.getName());

    private FpagoController FPcontrolador;
    
    public JDialogFpago(java.awt.Frame parent, boolean modal, Connection con) {
        super(parent, modal);
        initComponents();
        FPcontrolador = new FpagoController(con);
        
        try 
        {
            ArrayList<Fpago> lista = FPcontrolador.readAll();
            CargarTabla(lista);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this,"Error al cargar la tabla: " + e.getMessage());
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        JButtonCreate = new javax.swing.JButton();
        JButtonUpdate = new javax.swing.JButton();
        JButtonDelete = new javax.swing.JButton();
        JButtonRead = new javax.swing.JButton();
        JButtonReadByID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableTabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        TITULO1 = new javax.swing.JLabel();
        TITULO2 = new javax.swing.JLabel();
        TITULO3 = new javax.swing.JLabel();
        TITULO4 = new javax.swing.JLabel();
        JTextFieldCodigo = new javax.swing.JTextField();
        JTextFieldRecibos = new javax.swing.JTextField();
        JTextFieldDescripcion = new javax.swing.JTextField();
        JTextFieldReadID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        JButtonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        JButtonCreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButtonCreate.setFocusable(false);
        JButtonCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JButtonCreate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JButtonCreate.addActionListener(this::JButtonCreateActionPerformed);
        jToolBar1.add(JButtonCreate);

        JButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        JButtonUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButtonUpdate.setFocusable(false);
        JButtonUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JButtonUpdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(JButtonUpdate);

        JButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        JButtonDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButtonDelete.setFocusable(false);
        JButtonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JButtonDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JButtonDelete.addActionListener(this::JButtonDeleteActionPerformed);
        jToolBar1.add(JButtonDelete);

        JButtonRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/readAllback.png"))); // NOI18N
        JButtonRead.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButtonRead.setFocusable(false);
        JButtonRead.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JButtonRead.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JButtonRead.addActionListener(this::JButtonReadActionPerformed);
        jToolBar1.add(JButtonRead);

        JButtonReadByID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        JButtonReadByID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButtonReadByID.setFocusable(false);
        JButtonReadByID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JButtonReadByID.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JButtonReadByID.addActionListener(this::JButtonReadByIDActionPerformed);
        jToolBar1.add(JButtonReadByID);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JTableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTableTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableTabla);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TITULO1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TITULO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITULO1.setText("Añadir / Modificar Formas de Pago");
        TITULO1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TITULO2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TITULO2.setText("Recibos");

        TITULO3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TITULO3.setText("Codigo");

        TITULO4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TITULO4.setText("Descripcion");

        JTextFieldCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JTextFieldRecibos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JTextFieldDescripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TITULO1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TITULO2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TITULO4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(TITULO3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextFieldCodigo)
                            .addComponent(JTextFieldRecibos)
                            .addComponent(JTextFieldDescripcion, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITULO1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TITULO3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TITULO4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TITULO2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        JTextFieldReadID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTextFieldReadID.addActionListener(this::JTextFieldReadIDActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextFieldReadID))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JTextFieldReadID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void JButtonReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonReadActionPerformed
        // TODO add your handling code here:
        
        try 
        {
            ArrayList<Fpago> lista = FPcontrolador.readAll();
            
            if (lista.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "La lista esta vacia");
            }
            
            CargarTabla(lista);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage());
        }
        
    }//GEN-LAST:event_JButtonReadActionPerformed

    private void JButtonReadByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonReadByIDActionPerformed
        // TODO add your handling code here:
        
        if (validarIdBusqueda() == false) 
        {
            return;
        }
        
        try 
        {
            String id = JTextFieldReadID.getText().trim().toUpperCase();
            Fpago fpBuscado = FPcontrolador.readById(id);
            
            if (fpBuscado == null) 
            {
                JOptionPane.showMessageDialog(this, "No existe el metodo de pago introducido");
                return;
            }
            cargarCamposFpago(fpBuscado);
            CargarTablaBusquedaID(fpBuscado);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage());
        }
        
    }//GEN-LAST:event_JButtonReadByIDActionPerformed

    private void JTextFieldReadIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldReadIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldReadIDActionPerformed

    private void JButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCreateActionPerformed
        // TODO add your handling code here:
        
        if (validarAñadirFpago() == false) 
        {
            return;
        }
        
        try 
        {
            String codigo = JTextFieldCodigo.getText().trim();
            String descripcion = JTextFieldDescripcion.getText().trim();
            long recibos = Long.parseLong(JTextFieldRecibos.getText().trim());
            
            if (crearSIoNo() == false) 
            {
                return;
            }
            
            Fpago nuevo = new Fpago(codigo, descripcion, recibos);
            FPcontrolador.create(nuevo);
            
            ArrayList<Fpago> lista = FPcontrolador.readAll();
            
            if (lista.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "La lista esta vacia");
            }
            
            CargarTabla(lista);
            
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage());
        }
        
    }//GEN-LAST:event_JButtonCreateActionPerformed

    private void JButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonDeleteActionPerformed
        // TODO add your handling code here:
        
        
        if (seleccionarTablaBorrar()== false) 
        {
            return;
        }
        
        try 
        {
            Fpago fpEliminado = obneterFpago();
            
            if (fpEliminado == null) 
            {
                //CAMBIAR EL MENSAJE DE ERROR 
                JOptionPane.showMessageDialog(this, "ERROR: el objeto es null");
                return;
            }
            
            if (EliminarSIoNo() == false) 
            {
                return;
            }
            
            int filasAfectadas = FPcontrolador.deleteById(fpEliminado.getCCODFPAGO());
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Eliminado correctamente" );
            
            ArrayList<Fpago> lista = FPcontrolador.readAll();
            
            if (lista.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "La lista esta vacia");
            }
            
            CargarTabla(lista);
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage());
        }
        
    }//GEN-LAST:event_JButtonDeleteActionPerformed

    private void JTableTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableTablaMouseClicked
        // TODO add your handling code here:
        
        seleccionarTabla();
    }//GEN-LAST:event_JTableTablaMouseClicked

    /**
     * @param args the command line arguments
     */
    //
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //try {
          //  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            //    if ("Nimbus".equals(info.getName())) {
              //      javax.swing.UIManager.setLookAndFeel(info.getClassName());
                //    break;
                //}
            //}
        //} catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
          //  logger.log(java.util.logging.Level.SEVERE, null, ex);
        //}
        //</editor-fold>

        /* Create and display the dialog */
        //java.awt.EventQueue.invokeLater(new Runnable() {
          //  @Override
            //public void run() {
              //  JDialogFpago dialog = new JDialogFpago(new javax.swing.JFrame(), true);
                //dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                  //  @Override
                    //public void windowClosing(java.awt.event.WindowEvent e) {
                       // System.exit(0);
                    //}
                //});
                //dialog.setVisible(true);
           // }
        //});
   // }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCreate;
    private javax.swing.JButton JButtonDelete;
    private javax.swing.JButton JButtonRead;
    private javax.swing.JButton JButtonReadByID;
    private javax.swing.JButton JButtonUpdate;
    private javax.swing.JTable JTableTabla;
    private javax.swing.JTextField JTextFieldCodigo;
    private javax.swing.JTextField JTextFieldDescripcion;
    private javax.swing.JTextField JTextFieldReadID;
    private javax.swing.JTextField JTextFieldRecibos;
    private javax.swing.JLabel TITULO1;
    private javax.swing.JLabel TITULO2;
    private javax.swing.JLabel TITULO3;
    private javax.swing.JLabel TITULO4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    
    public void CargarTabla(ArrayList<Fpago> lista)
    {
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripción");
        modelo.addColumn("Recibos");
        
        for (Fpago fp : lista) 
        {
            Object[] fila = new Object[3];
                fila[0] = fp.getCCODFPAGO();
                fila[1] = fp.getCDESFPAGO();
                fila[2] = fp.getNRECIBOS();
            modelo.addRow(fila);
        }
        JTableTabla.setModel(modelo);
    }
    
    public void CargarTablaBusquedaID(Fpago fp)
    {
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripción");
        modelo.addColumn("Recibos");
        
        
        Object[] fila = new Object[3];
            fila[0] = fp.getCCODFPAGO();
            fila[1] = fp.getCDESFPAGO();
            fila[2] = fp.getNRECIBOS();
        modelo.addRow(fila);
        
        JTableTabla.setModel(modelo);
    }

    
    public boolean validarIdBusqueda()
    {
        String id = JTextFieldReadID.getText().trim().toUpperCase();
        
        if (id.length() > 2) 
        {
            JOptionPane.showMessageDialog(this, "El codigo solo puede tener 2 caracteres");
            return false;
        }
        if (id.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "El espacio no puede estar vacio");
            return false;
        }
        
        return true;
    }
    
    public void cargarCamposFpago(Fpago fp)
    {
        JTextFieldCodigo.setText(fp.getCCODFPAGO());
        JTextFieldDescripcion.setText(fp.getCDESFPAGO());
        JTextFieldRecibos.setText(String.valueOf(fp.getNRECIBOS()));
        
    }
    
    
    public boolean validarAñadirFpago()
    {
        String codigo = JTextFieldCodigo.getText().trim().toUpperCase();
        String descripcion = JTextFieldDescripcion.getText().trim();
        String recibos = JTextFieldRecibos.getText().trim();
        
        if (codigo.isEmpty() || descripcion.isEmpty() || recibos.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
            return false;
        }
        if (codigo.length() > 2) 
        {
            JOptionPane.showMessageDialog(this, "El codido solo puede contener un maximo de 2 caracteres o numeros");
            return false;
        }
        if (descripcion.length() > 100) 
        {
            JOptionPane.showMessageDialog(this, "La descripcion tiene un maximo de 100 caracteres");
            return false;
        }
        
        try 
        {
            Long nRecibos = Long.parseLong(JTextFieldRecibos.getText());
            
            if (nRecibos < 0) 
            {
                JOptionPane.showMessageDialog(this, "El numero de recibos no puede ser negativo");
                return false;
            }
            if (nRecibos > 9999999999L) 
            {
               JOptionPane.showMessageDialog(this, "El numero de recibos no puede superar los 10 digitos");
               return false; 
            }
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage());
            return false;
        }
        JTextFieldCodigo.setText(codigo);
        return true;
    }
    
    
    public void seleccionarTabla()
    {
        int filaSeleccionada = JTableTabla.getSelectedRow();
        
        if (filaSeleccionada == -1) 
        {
            JOptionPane.showMessageDialog(rootPane, "No hay fila seleccionada");
            return;
        }
        
        JTextFieldCodigo.setText(JTableTabla.getValueAt(filaSeleccionada, 0).toString());
        JTextFieldDescripcion.setText(JTableTabla.getValueAt(filaSeleccionada, 1).toString());
        JTextFieldRecibos.setText(JTableTabla.getValueAt(filaSeleccionada, 2).toString());
    }
    
    
    public boolean seleccionarTablaBorrar()
    {
        int filaSeleccionada = JTableTabla.getSelectedRow();
        
        if (filaSeleccionada == -1) 
        {
            JOptionPane.showMessageDialog(rootPane, "No hay fila seleccionada");
            return false;
        }
        
        JTextFieldCodigo.setText(JTableTabla.getValueAt(filaSeleccionada, 0).toString());
        JTextFieldDescripcion.setText(JTableTabla.getValueAt(filaSeleccionada, 1).toString());
        JTextFieldRecibos.setText(JTableTabla.getValueAt(filaSeleccionada, 2).toString());
        return true;
    }
    
    
    public Fpago obneterFpago()
    {
        Fpago fp = null;
        
        String codigo = JTextFieldCodigo.getText().trim().toUpperCase();
        String descripcion = JTextFieldDescripcion.getText().trim();
        Long recibos = Long.parseLong(JTextFieldRecibos.getText().trim());
                
        fp = new Fpago(codigo, descripcion, recibos);
                
        return fp; 
    }
    
    
    public boolean EliminarSIoNo()
    {
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estas seguro de eliminar la forma de pago?",
                                                            "",
                                                            JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) 
        {
            return true;
        }
        return false;
    }
    
    public boolean ActualizarSIoNo()
    {
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estas seguro de modificar la forma de pago?",
                                                            "",
                                                            JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) 
        {
            return true;
        }
        return false;
    }
    
    public boolean crearSIoNo()
    {
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estas seguro de modificar la forma de pago?",
                                                            "",
                                                            JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) 
        {
            return true;
        }
        return false;
    }
    
    public void limpiarCampos()
    {
        JTextFieldCodigo.setText("");
        JTextFieldDescripcion.setText("");
        JTextFieldRecibos.setText("");
    }
    
    
    public boolean pkNoModificada()
    {
        int filaSeleccionada = JTableTabla.getSelectedRow();
        
        if (filaSeleccionada == -1) 
        {
            JOptionPane.showMessageDialog(rootPane, "No hay fila seleccionada");
            return false;
        }
        String pk = JTableTabla.getValueAt(filaSeleccionada, 0).toString().trim().toUpperCase();
        String codigo = JTextFieldCodigo.getText().trim().toUpperCase();
        
        if (pk.equals(codigo)) 
        {
            return true;
        }
        
        JOptionPane.showMessageDialog(this, "No se puede modificar la clave primaria");
        return false;
    }
    //findall 
    //findallranger
}
