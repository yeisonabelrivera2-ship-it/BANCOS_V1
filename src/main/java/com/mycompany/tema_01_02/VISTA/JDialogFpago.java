
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

    private FpagoController controlador;
    
    public JDialogFpago(java.awt.Frame parent, boolean modal, Connection con) {
        super(parent, modal);
        initComponents();
        controlador = new FpagoController(con);
        
        try 
        {
            ArrayList<Fpago> lista = controlador.readAll();
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
        CREATE = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        READ = new javax.swing.JButton();
        READbyID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        TITULO1 = new javax.swing.JLabel();
        TITULO2 = new javax.swing.JLabel();
        TITULO3 = new javax.swing.JLabel();
        TITULO4 = new javax.swing.JLabel();
        CODIGO = new javax.swing.JTextField();
        RECIBOS = new javax.swing.JTextField();
        DESCRIPCION = new javax.swing.JTextField();
        READid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        CREATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        CREATE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CREATE.setFocusable(false);
        CREATE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CREATE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CREATE.addActionListener(this::CREATEActionPerformed);
        jToolBar1.add(CREATE);

        UPDATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        UPDATE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UPDATE.setFocusable(false);
        UPDATE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UPDATE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(UPDATE);

        DELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        DELETE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DELETE.setFocusable(false);
        DELETE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DELETE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DELETE.addActionListener(this::DELETEActionPerformed);
        jToolBar1.add(DELETE);

        READ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        READ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        READ.setFocusable(false);
        READ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        READ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        READ.addActionListener(this::READActionPerformed);
        jToolBar1.add(READ);

        READbyID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/searchById.jpg"))); // NOI18N
        READbyID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        READbyID.setFocusable(false);
        READbyID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        READbyID.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        READbyID.addActionListener(this::READbyIDActionPerformed);
        jToolBar1.add(READbyID);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
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
        TABLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLA);

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

        CODIGO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RECIBOS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DESCRIPCION.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                            .addComponent(CODIGO)
                            .addComponent(RECIBOS)
                            .addComponent(DESCRIPCION, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                    .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TITULO4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DESCRIPCION, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TITULO2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RECIBOS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        READid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        READid.addActionListener(this::READidActionPerformed);

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
                        .addComponent(READid))
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
                        .addComponent(READid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void READActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_READActionPerformed
        // TODO add your handling code here:
        
        try 
        {
            ArrayList<Fpago> lista = controlador.readAll();
            
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
        
    }//GEN-LAST:event_READActionPerformed

    private void READbyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_READbyIDActionPerformed
        // TODO add your handling code here:
        
        if (validarIdBusqueda() == false) 
        {
            return;
        }
        
        try 
        {
            String id = READid.getText().trim().toUpperCase();
            Fpago fpBuscado = controlador.readById(id);
            
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
        
    }//GEN-LAST:event_READbyIDActionPerformed

    private void READidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_READidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_READidActionPerformed

    private void CREATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEActionPerformed
        // TODO add your handling code here:
        
        if (validarAñadirFpago() == false) 
        {
            return;
        }
        
        try 
        {
            String codigo = CODIGO.getText().trim();
            String descripcion = DESCRIPCION.getText().trim();
            long recibos = Long.parseLong(RECIBOS.getText().trim());
            
            Fpago nuevo = new Fpago(codigo, descripcion, recibos);
            controlador.create(nuevo);
            
            ArrayList<Fpago> lista = controlador.readAll();
            
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
        
    }//GEN-LAST:event_CREATEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
        
        
        if (seleccionarTablaBorrar() == false) 
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
            
            int filasAfectadas = controlador.deleteById(fpEliminado.getCCODFPAGO());
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Eliminado correctamente" );
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage());
        }
        
    }//GEN-LAST:event_DELETEActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        // TODO add your handling code here:
        
        seleccionarTabla();
    }//GEN-LAST:event_TABLAMouseClicked

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
    private javax.swing.JTextField CODIGO;
    private javax.swing.JButton CREATE;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField DESCRIPCION;
    private javax.swing.JButton READ;
    private javax.swing.JButton READbyID;
    private javax.swing.JTextField READid;
    private javax.swing.JTextField RECIBOS;
    private javax.swing.JTable TABLA;
    private javax.swing.JLabel TITULO1;
    private javax.swing.JLabel TITULO2;
    private javax.swing.JLabel TITULO3;
    private javax.swing.JLabel TITULO4;
    private javax.swing.JButton UPDATE;
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
        TABLA.setModel(modelo);
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
        
        TABLA.setModel(modelo);
    }

    
    public boolean validarIdBusqueda()
    {
        String id = READid.getText().trim().toUpperCase();
        
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
        CODIGO.setText(fp.getCCODFPAGO());
        DESCRIPCION.setText(fp.getCDESFPAGO());
        RECIBOS.setText(String.valueOf(fp.getNRECIBOS()));
        
    }
    
    
    public boolean validarAñadirFpago()
    {
        String codigo = CODIGO.getText().trim().toUpperCase();
        String descripcion = DESCRIPCION.getText().trim();
        String recibos = RECIBOS.getText().trim();
        
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
            Long nRecibos = Long.parseLong(RECIBOS.getText());
            
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
        CODIGO.setText(codigo);
        return true;
    }
    
    
    public void seleccionarTabla()
    {
        int filaSeleccionada = TABLA.getSelectedRow();
        
        if (filaSeleccionada == -1) 
        {
            JOptionPane.showMessageDialog(rootPane, "No hay fila seleccionada");
            return;
        }
        
        CODIGO.setText(TABLA.getValueAt(filaSeleccionada, 0).toString());
        DESCRIPCION.setText(TABLA.getValueAt(filaSeleccionada, 1).toString());
        RECIBOS.setText(TABLA.getValueAt(filaSeleccionada, 2).toString());
    }
    
    
    public boolean seleccionarTablaBorrar()
    {
        int filaSeleccionada = TABLA.getSelectedRow();
        
        if (filaSeleccionada == -1) 
        {
            JOptionPane.showMessageDialog(rootPane, "No hay fila seleccionada");
            return false;
        }
     
        CODIGO.setText(TABLA.getValueAt(filaSeleccionada, 0).toString());
        DESCRIPCION.setText(TABLA.getValueAt(filaSeleccionada, 1).toString());
        RECIBOS.setText(TABLA.getValueAt(filaSeleccionada, 2).toString());
        return true;
    }
    
    
    public Fpago obneterFpago()
    {
        Fpago fp = null;
        
        String codigo = CODIGO.getText().trim().toUpperCase();
        String descripcion = DESCRIPCION.getText().trim();
        Long recibos = Long.parseLong(RECIBOS.getText().trim());
                
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
    
    public void limpiarCampos()
    {
        CODIGO.setText("");
        DESCRIPCION.setText("");
        RECIBOS.setText("");
    }
    //findall 
    //findallranger
}
