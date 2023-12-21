
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Adrian
 */
public class Oradores extends javax.swing.JFrame {

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        labelIName = new javax.swing.JLabel();
        labelILastName = new javax.swing.JLabel();
        labelTema = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        inputLastName = new javax.swing.JTextField();
        textAreaTemaScroll = new javax.swing.JScrollPane();
        InputTextAreaTema = new javax.swing.JTextArea();
        btnGuardar = new java.awt.Button();
        btnUpdate = new java.awt.Button();
        btnDelete = new java.awt.Button();
        btnClean = new javax.swing.JButton();
        btnCreateXML = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_oradores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("ORADORES");
        jLabel1.setToolTipText("");

        labelID.setText("ID");

        labelIName.setText("Nombre");

        labelILastName.setText("Apellido");

        labelTema.setText("Tema");

        inputID.setEditable(false);
        inputID.setBackground(new java.awt.Color(204, 204, 204));

        InputTextAreaTema.setColumns(20);
        InputTextAreaTema.setRows(5);
        textAreaTemaScroll.setViewportView(InputTextAreaTema);

        btnGuardar.setActionCommand("btnGuardar");
        btnGuardar.setLabel("Guardar");
        btnGuardar.setName("btnGuardar"); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnUpdate.setActionCommand("btnUpdate");
        btnUpdate.setLabel("Update");
        btnUpdate.setName(""); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setActionCommand("btnDelete");
        btnDelete.setLabel("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClean.setText("Limpiar Campos");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnCreateXML.setText("Crear XML");
        btnCreateXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateXMLActionPerformed(evt);
            }
        });

        jLabel2.setText("By for Finochio Adrián E ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelIName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelILastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTema, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClean)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateXML)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textAreaTemaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(inputLastName)
                            .addComponent(inputName)
                            .addComponent(inputID))
                        .addContainerGap(92, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIName))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelILastName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(textAreaTemaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(labelTema)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClean)
                    .addComponent(btnCreateXML))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        labelILastName.getAccessibleContext().setAccessibleDescription("");
        inputID.getAccessibleContext().setAccessibleName("");
        inputID.getAccessibleContext().setAccessibleDescription("");
        btnGuardar.getAccessibleContext().setAccessibleName("btnGuardar");

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        table_oradores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_oradores.setModel(new javax.swing.table.DefaultTableModel(
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
        table_oradores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(table_oradores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String id = inputID.getText();
        String name = inputName.getText();
        String lastName = inputLastName.getText();
        String tema = InputTextAreaTema.getText();

        if (!isReallyEmpty(name)) {
            JOptionPane.showMessageDialog(null, "Porfavor ingrese nombre");
            inputName.requestFocus();
            return;
        }
        if (!isReallyEmpty(lastName)) {
            JOptionPane.showMessageDialog(null, "Porfavor ingrese apellido");
            inputLastName.requestFocus();
            return;
        }
        if (!isReallyEmpty(tema)) {
            JOptionPane.showMessageDialog(null, "Porfavor ingrese el tema");
            InputTextAreaTema.requestFocus();
            return;
        }

        if (id.isEmpty()) {

            try {
                String sql = "Insert into oradores (Nombre,Apellido,Tema) values (?,?,?)";

                pst = con.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, lastName);
                pst.setString(3, tema);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
                clear();
                loadData();
                
                CrearXML();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se puede asignar un ID");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        clear();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id = inputID.getText();
        String name = inputName.getText();
        String lastName = inputLastName.getText();
        String tema = InputTextAreaTema.getText();

        if (!isReallyEmpty(name)) {
            JOptionPane.showMessageDialog(null, "Porfavor ingrese nombre");
            inputName.requestFocus();
            return;
        }
        if (!isReallyEmpty(lastName)) {
            JOptionPane.showMessageDialog(null, "Porfavor ingrese apellido");
            inputLastName.requestFocus();
            return;
        }
        if (!isReallyEmpty(tema)) {
            JOptionPane.showMessageDialog(null, "Porfavor ingrese el tema");
            InputTextAreaTema.requestFocus();
            return;
        }

        if (!id.isEmpty()) {

            try {
                String sql = "update oradores set Nombre = ?,  Apellido=? ,Tema=? where ID = ?";

                pst = con.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, lastName);
                pst.setString(3, tema);
                pst.setString(4, id);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos modificados correctamente");
                clear();
                loadData();
                CrearXML();
            } catch (Exception e) {
                e.printStackTrace();
            }
            

        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra el ID");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id = inputID.getText();

        if (!id.isEmpty()) {
            int res = JOptionPane.showConfirmDialog(null, "Está seguro? esta operacion no se puede desahacer", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                try {
                    String sql = "delete from oradores where ID = ?";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Datos eliminados correctamente");
                    clear();
                    loadData();
                    CrearXML();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Eliminacion cancelada");

            }

        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra el ID");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        int index = table_oradores.getSelectedRow();
        TableModel model = table_oradores.getModel();
        inputID.setText(model.getValueAt(index, 0).toString());
        inputName.setText(model.getValueAt(index, 1).toString());
        inputLastName.setText(model.getValueAt(index, 2).toString());
        InputTextAreaTema.setText(model.getValueAt(index, 3).toString());


    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void btnCreateXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateXMLActionPerformed
        try {
            // TODO add your handling code here:
            CrearXML();
        } catch (SQLException ex) {
            Logger.getLogger(Oradores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Oradores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreateXMLActionPerformed

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
            java.util.logging.Logger.getLogger(Oradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea InputTextAreaTema;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnCreateXML;
    private java.awt.Button btnDelete;
    private java.awt.Button btnGuardar;
    private java.awt.Button btnUpdate;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JTextField inputName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelILastName;
    private javax.swing.JLabel labelIName;
    private javax.swing.JLabel labelTema;
    private javax.swing.JTable table_oradores;
    private javax.swing.JScrollPane textAreaTemaScroll;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form NewJFrame
     */
    public Oradores() {
        initComponents();
        connect();
        loadData();
    }
// database Connection
    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbName = "integrador_cac";

            String url = String.format("jdbc:mysql://localhost:3306/%s?characterEncoding=utf8", dbName);
            String username = "root";
            String password = "Root@1234";
            con = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clear() {
        inputID.setText("");
        inputName.setText("");
        inputLastName.setText("");
        InputTextAreaTema.setText("");
        inputName.requestFocus();

    }

    public void loadData() {
        try {
            pst = con.prepareStatement("Select * from oradores");
            rs = pst.executeQuery();
            table_oradores.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private boolean isReallyEmpty(String string1) {
        if (string1 == null || string1.isEmpty() || string1.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public void CrearXML() throws SQLException, IOException {
        
                    String filePath = crearArchivo("oradoresXML.xml");
                    Path path = Paths.get(filePath);
                    Files.delete(path);

       
        

        try {
            pst = con.prepareStatement("Select * from oradores");
            rs = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String line= "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
        FileWriter cb = new FileWriter(filePath);
        cb.write(line);
         cb.close();
       
        line= "<Oradores>";
        FileWriter fw = new FileWriter(filePath, true);
        fw.write(line);
        
       
        while (rs.next()) {
            line = "<Orador> <ID>"+ rs.getString("ID")+"</ID><Nombre>" + rs.getString("Nombre") + "</Nombre> <Apellido>" 
                    + rs.getString("Apellido") + "</Apellido> <Tema>" + rs.getString("Tema")+"</Tema></Orador>";
            
            fw.write(line);
            
            
        } 
        
        line= "</Oradores>";
        
        fw.write(line);
        fw.close();
        
        JOptionPane.showMessageDialog(null, "XML Creado correctamente en: "+filePath);
    }
    
    
    
    public String crearArchivo (String nombreDelArchivo) {
       File file = new File(nombreDelArchivo);

       // Verificar si el archivo existe
       if (!file.exists()) {
           // Si el archivo no existe, intentar crearlo
           try {
               if (file.createNewFile()) {
                  System.out.println("Archivo creado exitosamente");
               } else {
                  System.out.println("No se pudo crear el archivo");
               }
           } catch (IOException e) {
               System.out.println("Un error ocurrió al crear el archivo");
               e.printStackTrace();
           }
       } else {
           System.out.println("El archivo ya existe");
       }
       System.out.println("Ruta del archivo: " + file.getAbsolutePath());
       return file.getAbsolutePath();
   }

}
