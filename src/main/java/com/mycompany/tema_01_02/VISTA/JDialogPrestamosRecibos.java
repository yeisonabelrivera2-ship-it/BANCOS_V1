package com.mycompany.tema_01_02.VISTA;

import com.mycompany.tema_01_02.CONTROLADOR.FpagoController;
import com.mycompany.tema_01_02.CONTROLADOR.PrestamosController;
import com.mycompany.tema_01_02.CONTROLADOR.RecibosController;
import com.mycompany.tema_01_02.MODELO.Fpago;
import com.mycompany.tema_01_02.MODELO.Prestamos;
import com.mycompany.tema_01_02.MODELO.Recibos;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
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
        jTextFieldNumeroReciboAPagar = new javax.swing.JTextField();
        jToolBar2 = new javax.swing.JToolBar();
        jButtonPagarRerecibo = new javax.swing.JButton();
        jButtonImprimirRecibo = new javax.swing.JButton();
        jButtonImporteRestantePorPagar = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
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
        jTableRecibos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRecibosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableRecibos);

        jTextFieldNumeroReciboAPagar.setEditable(false);

        jToolBar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar2.setRollover(true);

        jButtonPagarRerecibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagarRecibo.png"))); // NOI18N
        jButtonPagarRerecibo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPagarRerecibo.addActionListener(this::jButtonPagarRereciboActionPerformed);
        jToolBar2.add(jButtonPagarRerecibo);

        jButtonImprimirRecibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reciboImprimir.png"))); // NOI18N
        jButtonImprimirRecibo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonImprimirRecibo.setFocusable(false);
        jButtonImprimirRecibo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonImprimirRecibo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonImprimirRecibo.addActionListener(this::jButtonImprimirReciboActionPerformed);
        jToolBar2.add(jButtonImprimirRecibo);

        jButtonImporteRestantePorPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restanteDeuda.png"))); // NOI18N
        jButtonImporteRestantePorPagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonImporteRestantePorPagar.addActionListener(this::jButtonImporteRestantePorPagarActionPerformed);
        jToolBar2.add(jButtonImporteRestantePorPagar);

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
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNumeroReciboAPagar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumeroReciboAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
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
        
        if (impReci > impPrest) {
              JOptionPane.showMessageDialog(this, "El importe del recibo (" + impReci + ") no puede ser mayor que el importe total del préstamo (" + impPrest + ").");
              return; 
          }
        
        LocalDate fecha = fechaTexto.isEmpty() ? LocalDate.now() : LocalDate.parse(fechaTexto);
        String codFPago = jComboBoxFormasPago.getSelectedItem().toString();
        Prestamos nuevoPrestamo = new Prestamos(numPrest, fecha, impPrest, impReci, codFPago);

        int filasAfectadas = PScontrolador.create(nuevoPrestamo); 

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "¡Préstamo creado correctamente!");

            cargarTablaPrestamos(PScontrolador.readAll());

            int prestamosGenerados = RScontrolador.generarRecibos2(numPrest, impReci);

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
       
        cargarCamposTabla();
        
        String id = jTextFieldNumero.getText().trim();        
        ArrayList<Recibos> lista = RScontrolador.findById(id);
        cargarTablaRecibos(lista);
    }//GEN-LAST:event_jTablePrestamosMouseClicked

    private void jButtonReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadActionPerformed
              
        ArrayList<Prestamos> lista = PScontrolador.readAll();
        cargarTablaPrestamos(lista);
        
    }//GEN-LAST:event_jButtonReadActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        
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
       
        if (validarBusquedaId() == false) { 
        return;
        }
    
        if (validarPKModificar() == false) {
            return;
        }

        if (ActualizarSIoNo() == false) { 
            return;
        }

        if (validarNoTocarPrestamo() == false) 
        {
            return;
        }
        if (validarPagoNoSuperiorPrestamo() == false) 
        {
            return;
        }

        try {
            int numPrest = Integer.parseInt(jTextFieldNumero.getText().trim());
            String fechaTexto = jTextFieldFecha.getText().trim();
            double impPrest = Double.parseDouble(jTextFieldImporte.getText().trim());
            double impReci = Double.parseDouble(jTextFieldImporteRecibo.getText().trim());

            LocalDate fecha = fechaTexto.isEmpty() ? java.time.LocalDate.now() : java.time.LocalDate.parse(fechaTexto);
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

    private void jTableRecibosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRecibosMouseClicked

    }//GEN-LAST:event_jTableRecibosMouseClicked

    private void jButtonPagarRereciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarRereciboActionPerformed
        if (!validarBusquedaId()) {
            return;
        }

        String numPrestTexto = jTextFieldNumero.getText().trim();

        int filaSeleccionada = jTableRecibos.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un recibo de la tabla para pagar.", "Recibo no seleccionado", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Object valorRecibo = jTableRecibos.getValueAt(filaSeleccionada, 1);
        String numRecibTexto = valorRecibo != null ? valorRecibo.toString().trim() : "";

        if (numRecibTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un número de recibo válido de la tabla.");
            return;
        }

        try {
            int numPrest = Integer.parseInt(numPrestTexto);
            int numRecib = Integer.parseInt(numRecibTexto);

            if (RScontrolador.estaPagado(numPrest, numRecib)) {
                JOptionPane.showMessageDialog(this, "Este recibo ya se encuentra pagado.");
                return;
            }

            LocalDate fechaActual = LocalDate.now();

            int respuesta = JOptionPane.showConfirmDialog(this, "¿Deseas registrar el pago del recibo " + numRecib + " con fecha de hoy (" + fechaActual + ")?", "Confirmacion de Pago", JOptionPane.YES_NO_OPTION);

            if (respuesta != JOptionPane.YES_OPTION) {
                return;
            }

            int filasAfectadas = RScontrolador.pagarRecibo(numPrest, numRecib, fechaActual);

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "¡Recibo pagado correctamente!");

                ArrayList<Recibos> listaRecibos = RScontrolador.findById(numPrestTexto);
                cargarTablaRecibos(listaRecibos);

            } else {
                JOptionPane.showMessageDialog(this, "No se encontro el recibo.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ERROR: El valor introducido es incorrecto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage());
        }

    }//GEN-LAST:event_jButtonPagarRereciboActionPerformed

    private void jButtonImporteRestantePorPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImporteRestantePorPagarActionPerformed
        String numTexto = jTextFieldNumero.getText().trim();

        if (numTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce o selecciona un número de prestamo.");
            return;
        }

        try {
            int numPrestamo = Integer.parseInt(numTexto);

            double deudaPendiente = PScontrolador.calcularDeudaPrestamo(numPrestamo);

            jTextFieldNumeroReciboAPagar.setText(String.valueOf(deudaPendiente));

            JOptionPane.showMessageDialog(this, "El importe pendiente de pago para el prestamo " + numPrestamo + " es de: " + deudaPendiente + " €", "Deuda Pendiente", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El numero de prestamo debe ser un valor numerico.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error al calcular la deuda: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonImporteRestantePorPagarActionPerformed

    private void jButtonImprimirReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirReciboActionPerformed
     
        if (validarImprimirRecibo() == false) 
        {
            return;
        }
        
        int fila = jTableRecibos.getSelectedRow();
        
        String numPrestamo = jTableRecibos.getValueAt(fila, 0).toString().trim();
        String numRecibo = jTableRecibos.getValueAt(fila, 1).toString().trim();
        String fechaRecibo = jTableRecibos.getValueAt(fila, 2).toString().trim();
        String importe = jTableRecibos.getValueAt(fila, 3).toString().trim();
        String fechaPago = jTableRecibos.getValueAt(fila, 4).toString().trim();
        
        generarPDF(numPrestamo,numRecibo,fechaRecibo,importe,fechaPago);
    }//GEN-LAST:event_jButtonImprimirReciboActionPerformed
    
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
    private javax.swing.JButton jButtonImporteRestantePorPagar;
    private javax.swing.JButton jButtonImprimirRecibo;
    private javax.swing.JButton jButtonPagarRerecibo;
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
    private javax.swing.JTextField jTextFieldNumeroReciboAPagar;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
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
    
    public boolean validarNoTocarPrestamo()
    {
        int seleccion = jTablePrestamos.getSelectedRow();
        
        if (seleccion == -1) 
        {
            JOptionPane.showMessageDialog(this, "No hay ninguna fila seleccionada");
            return false;
        }
        
        String importePrestamoTabla = jTablePrestamos.getValueAt(seleccion, 2).toString().trim();
        String importePrestamoCampo = jTextFieldImporte.getText().trim();
        double importeTabla = Double.parseDouble(importePrestamoTabla);
        double importeCampo = Double.parseDouble(importePrestamoCampo);
        
        if (Double.compare(importeTabla, importeCampo) != 0) 
        {
            JOptionPane.showMessageDialog(this, "No esta permitido modificar el importe del prestamo");
            return false;
        }     
        return true;
    }

    
    public boolean validarImprimirRecibo()
    {
        int seleccion = jTableRecibos.getSelectedRow();
        
        if (seleccion == -1) 
        {
            JOptionPane.showMessageDialog(this, "Selecciona un recibo para imprimir.");
            return false;
        }
        
        Object fechaPago = jTableRecibos.getValueAt(seleccion,4);

        if (fechaPago == null || fechaPago.toString().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this,"Solo puedes imprimir recibos que estén pagados.");
            return false;
        }
        
        return true;
    }
    
    public boolean validarPagoNoSuperiorPrestamo()
    {
        int seleccion = jTableRecibos.getSelectedRow();
        
        if (seleccion == -1) 
        {
            JOptionPane.showMessageDialog(this, "Selecciona un recibo para imprimir.");
            return false;
        }
        
        String txtprestamo = jTablePrestamos.getValueAt(seleccion, 2).toString().trim();
        String txtpago = jTextFieldImporteRecibo.getText().trim();
        int prestamo = Integer.parseInt(txtprestamo);
        int pago = Integer.parseInt(txtpago);
        
        if (prestamo != pago) 
        {
            JOptionPane.showMessageDialog(this, "No puedes pagar un monto mayor al prestamo");
            return false;
        }
        
        return true;
    }
   
    
   private void generarPDF(String numPrestamo, String numRecibo,
        String fechaRecibo, String importe, String fechaPago) {

    javax.swing.JFileChooser selector = new javax.swing.JFileChooser();

    selector.setSelectedFile(
            new java.io.File("Recibo_" + numPrestamo + "_" + numRecibo + ".pdf")
    );

    if (selector.showSaveDialog(this)
            != javax.swing.JFileChooser.APPROVE_OPTION) {
        return;
    }

    java.io.File archivo = selector.getSelectedFile();

    if (!archivo.getName().toLowerCase().endsWith(".pdf")) {
        archivo = new java.io.File(archivo.getAbsolutePath() + ".pdf");
    }

    try (org.apache.pdfbox.pdmodel.PDDocument documento
            = new org.apache.pdfbox.pdmodel.PDDocument()) {

        org.apache.pdfbox.pdmodel.PDPage pagina =
                new org.apache.pdfbox.pdmodel.PDPage(
                        org.apache.pdfbox.pdmodel.common.PDRectangle.A4);

        documento.addPage(pagina);

        org.apache.pdfbox.pdmodel.font.PDFont normal =
                new org.apache.pdfbox.pdmodel.font.PDType1Font(
                        org.apache.pdfbox.pdmodel.font.Standard14Fonts.FontName.HELVETICA);

        org.apache.pdfbox.pdmodel.font.PDFont negrita =
                new org.apache.pdfbox.pdmodel.font.PDType1Font(
                        org.apache.pdfbox.pdmodel.font.Standard14Fonts.FontName.HELVETICA_BOLD);

        try (org.apache.pdfbox.pdmodel.PDPageContentStream cs =
                new org.apache.pdfbox.pdmodel.PDPageContentStream(documento, pagina)) {

            float ancho = pagina.getMediaBox().getWidth();
            float margen = 55;
            float derecha = ancho - margen;

            // Marco exterior
            cs.setStrokingColor(0.75f, 0.78f, 0.82f);
            cs.setLineWidth(1);
            cs.addRect(margen, 90, ancho - 2 * margen, 660);
            cs.stroke();

            // Encabezado
            cs.setNonStrokingColor(0.10f, 0.22f, 0.33f);
            cs.beginText();
            cs.setFont(negrita, 22);
            cs.newLineAtOffset(margen + 20, 705);
            cs.showText("JUSTIFICANTE DE PAGO");
            cs.endText();

            cs.setNonStrokingColor(0.35f, 0.39f, 0.43f);
            cs.beginText();
            cs.setFont(normal, 10);
            cs.newLineAtOffset(margen + 20, 685);
            cs.showText("DOCUMENTO ACREDITATIVO DEL PAGO");
            cs.endText();

            // Línea del encabezado
            cs.setStrokingColor(0.10f, 0.35f, 0.55f);
            cs.setLineWidth(2);
            cs.moveTo(margen + 20, 665);
            cs.lineTo(derecha - 20, 665);
            cs.stroke();

            // Sección de datos
            cs.setNonStrokingColor(0.10f, 0.22f, 0.33f);
            cs.beginText();
            cs.setFont(negrita, 12);
            cs.newLineAtOffset(margen + 20, 630);
            cs.showText("DATOS DEL RECIBO");
            cs.endText();

            // Datos del recibo
            escribirLinea(cs, negrita, normal,
                    "Numero de prestamo", numPrestamo, 600, margen + 20);

            escribirLinea(cs, negrita, normal,
                    "Numero de recibo", numRecibo, 565, margen + 20);

            escribirLinea(cs, negrita, normal,
                    "Fecha del recibo", fechaRecibo, 530, margen + 20);

            escribirLinea(cs, negrita, normal,
                    "Fecha de pago", fechaPago, 495, margen + 20);

            // Separador
            cs.setStrokingColor(0.82f, 0.84f, 0.86f);
            cs.setLineWidth(1);
            cs.moveTo(margen + 20, 465);
            cs.lineTo(derecha - 20, 465);
            cs.stroke();

            // Importe destacado
            cs.setNonStrokingColor(0.10f, 0.35f, 0.55f);
            cs.beginText();
            cs.setFont(negrita, 13);
            cs.newLineAtOffset(margen + 20, 425);
            cs.showText("IMPORTE PAGADO");
            cs.endText();

            cs.setNonStrokingColor(0.10f, 0.22f, 0.33f);
            cs.beginText();
            cs.setFont(negrita, 25);
            cs.newLineAtOffset(margen + 20, 385);
            cs.showText(importe + " EUR");
            cs.endText();

            // Mensaje final
            cs.setNonStrokingColor(0.29f, 0.33f, 0.37f);
            cs.beginText();
            cs.setFont(normal, 10);
            cs.newLineAtOffset(margen + 20, 325);
            cs.showText("Este documento acredita el pago del recibo indicado.");
            cs.endText();

            cs.beginText();
            cs.setFont(normal, 10);
            cs.newLineAtOffset(margen + 20, 307);
            cs.showText("Conserve este justificante como comprobante.");
            cs.endText();

            // Pie del documento
            cs.setStrokingColor(0.82f, 0.84f, 0.86f);
            cs.moveTo(margen + 20, 145);
            cs.lineTo(derecha - 20, 145);
            cs.stroke();

            cs.setNonStrokingColor(0.43f, 0.47f, 0.51f);
            cs.beginText();
            cs.setFont(normal, 9);
            cs.newLineAtOffset(margen + 20, 125);
            cs.showText("Gracias por su pago.");
            cs.endText();
        }

        documento.save(archivo);

        JOptionPane.showMessageDialog(this,
                "Recibo PDF generado correctamente:\n"
                + archivo.getAbsolutePath());

    } catch (java.io.IOException e) {
        JOptionPane.showMessageDialog(this,
                "Error al generar el PDF: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void escribirLinea(
        org.apache.pdfbox.pdmodel.PDPageContentStream cs,
        org.apache.pdfbox.pdmodel.font.PDFont negrita,
        org.apache.pdfbox.pdmodel.font.PDFont normal,
        String etiqueta, String valor, float y, float x)
        throws java.io.IOException {

    cs.setNonStrokingColor(0.27f, 0.31f, 0.35f);
    cs.beginText();
    cs.setFont(negrita, 11);
    cs.newLineAtOffset(x, y);
    cs.showText(etiqueta + ":");
    cs.endText();

    cs.setNonStrokingColor(0.14f, 0.16f, 0.18f);
    cs.beginText();
    cs.setFont(normal, 11);
    cs.newLineAtOffset(x + 190, y);
    cs.showText(valor);
    cs.endText();
}
   
}



