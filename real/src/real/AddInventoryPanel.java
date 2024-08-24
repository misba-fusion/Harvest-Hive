package real;

import java.sql.Date;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class AddInventoryPanel extends javax.swing.JPanel {

    DAO dao;
    public AddInventoryPanel() {
        dao = new DAO();
        initComponents();
        GetPaddy();
        DisplayInventory();
        
        JPanel panel = this;
        
        /*addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String paddyId = paddyIdField.getSelectedItem().toString();
                String riceQuantity = riceQuantityField.getText().toString();
                String brokenRiceQuantity = brokenRiceQuantityField.getText().toString();
                String branQuantity = branQuantityField.getText().toString();
                String storageLocation = storageLocationField.getText().toString();
                
                if(paddyId.isEmpty() || riceQuantity.isEmpty() || brokenRiceQuantity.isEmpty() || branQuantity.isEmpty() || storageLocation.isEmpty()){
                    JOptionPane.showMessageDialog((JFrame) SwingUtilities.getWindowAncestor(panel),
                    "Required field is empty",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if(dao.addInventory(Integer.parseInt(paddyId),Double.parseDouble(riceQuantity),Double.parseDouble(brokenRiceQuantity),Double.parseDouble(branQuantity),storageLocation)){
                    JOptionPane.showMessageDialog((JFrame) SwingUtilities.getWindowAncestor(panel),
                    "Succesfully added to Inventory",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog((JFrame) SwingUtilities.getWindowAncestor(panel),
                    "Unknow error",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
                           
            }
        });*/
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        riceQuantityField = new javax.swing.JTextField();
        brokenRiceQuantityField = new javax.swing.JTextField();
        branQuantityField = new javax.swing.JTextField();
        storageLocationField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        paddyIdField = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(960, 540));
        setPreferredSize(new java.awt.Dimension(960, 540));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Inventory");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PaddyID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Rice_Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Broken_Rice_Quantity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Bran_Quantity");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Storage_Location");

        addButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        riceQuantityField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        riceQuantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riceQuantityFieldActionPerformed(evt);
            }
        });

        brokenRiceQuantityField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        brokenRiceQuantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brokenRiceQuantityFieldActionPerformed(evt);
            }
        });

        branQuantityField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        branQuantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branQuantityFieldActionPerformed(evt);
            }
        });

        storageLocationField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        storageLocationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storageLocationFieldActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 102, 102));
        clearButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        paddyIdField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        inventoryTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "InventoryID", "PaddyID", "Rice Quantity", "Broken Rice Quantity", "Bran Quantity", "Storage Location"
            }
        ));
        inventoryTable.setToolTipText("");
        inventoryTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inventoryTable.setSelectionBackground(new java.awt.Color(255, 102, 102));
        inventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(inventoryTable);

        updateButton.setBackground(new java.awt.Color(153, 255, 153));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(storageLocationField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                .addComponent(branQuantityField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                .addComponent(brokenRiceQuantityField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                .addComponent(riceQuantityField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                .addComponent(paddyIdField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(clearButton)
                                .addGap(147, 147, 147)
                                .addComponent(updateButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paddyIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(riceQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brokenRiceQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storageLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Clear()
    {
        paddyIdField.setSelectedItem("");
        riceQuantityField.setText("");
        brokenRiceQuantityField.setText("");
        branQuantityField.setText("");
        storageLocationField.setText("");
    }
    
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    private void GetPaddy()
    {
        try{
             Con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
             St=Con.createStatement();
             String Query = "select * from Paddy";
             Rs=St.executeQuery(Query);
             while(Rs.next())
             {
                 String paddyId=String.valueOf(Rs.getInt("PaddyID"));
                 paddyIdField.addItem(paddyId);
             }
        }catch(Exception e){
            
        }
    }
    
    Connection Con1 = null;
    PreparedStatement pst1 = null;
    ResultSet Rs2 = null, Rs3 = null;
    Statement St2 = null, St3 = null;
    private void DisplayInventory()
    {
        try{
            Con1 = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            St2 = Con1.createStatement();
            Rs2 = St2.executeQuery("select * from Inventory");
            inventoryTable.setModel(DbUtils.resultSetToTableModel(Rs2));
        }catch(Exception e){
            
        }
    }
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if(riceQuantityField.getText().isEmpty() || brokenRiceQuantityField.getText().isEmpty() || branQuantityField.getText().isEmpty() || storageLocationField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } 
        else 
        {
              try{
                        
                   Con1 = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
                   PreparedStatement Add = Con1.prepareStatement("INSERT INTO Inventory(PaddyID,Rice_Quantity,Broken_Rice_Quantity,Bran_Quantity,Storage_Location) VALUES(?,?,?,?,?)");
                   Add.setString(1, paddyIdField.getSelectedItem().toString());
                   Add.setDouble(2, Double.valueOf(riceQuantityField.getText()));
                   Add.setDouble(3, Double.valueOf(brokenRiceQuantityField.getText()));
                   Add.setDouble(4, Double.valueOf(branQuantityField.getText()));
                   Add.setString(5, storageLocationField.getText().toString());
                
                   
                   int row = Add.executeUpdate();
                   JOptionPane.showMessageDialog(this, "Inventory Added");
                   Con.close();
                   DisplayInventory();
                   
              }catch(Exception e){
                   JOptionPane.showMessageDialog(this, e);
              }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void riceQuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riceQuantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_riceQuantityFieldActionPerformed

    private void brokenRiceQuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brokenRiceQuantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brokenRiceQuantityFieldActionPerformed

    private void branQuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branQuantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branQuantityFieldActionPerformed

    private void storageLocationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storageLocationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storageLocationFieldActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        Clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(Key=="")
        {
            JOptionPane.showMessageDialog(this, "Select a Inventory");
        } 
        else 
        {
              try{           
                   Con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
                   String Query = "Update Inventory set PaddyID=?,Rice_Quantity=?,Broken_Rice_Quantity=?,Bran_Quantity=?,Storage_Location=? where InventoryId=?";
                   
                   PreparedStatement Add = Con1.prepareStatement(Query);
                   Add.setString(6,Key);
                   
                   Add.setString(1, paddyIdField.getSelectedItem().toString());
                   Add.setString(2, riceQuantityField.getText().toString());
                   Add.setString(3, brokenRiceQuantityField.getText().toString());
                   Add.setString(4, branQuantityField.getText().toString());
                   Add.setString(5, storageLocationField.getText().toString());
                  
                   
                   int row = Add.executeUpdate();
                   JOptionPane.showMessageDialog(this, "Inventory Updated");
                   Con1.close();
                   DisplayInventory();
                   Clear();
              }catch(Exception e){
                   JOptionPane.showMessageDialog(this, e);
              }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    
    String  Key= "";
    private void inventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)inventoryTable.getModel();
        int MyIndex = inventoryTable.getSelectedRow();
        Key =model.getValueAt(MyIndex, 0).toString();
        
        paddyIdField.setSelectedItem(model.getValueAt(MyIndex,1).toString());
        riceQuantityField.setText(model.getValueAt(MyIndex,2).toString());
        brokenRiceQuantityField.setText(model.getValueAt(MyIndex,3).toString()); 
        branQuantityField.setText(model.getValueAt(MyIndex,4).toString());
        storageLocationField.setText(model.getValueAt(MyIndex,5).toString());
         
    }//GEN-LAST:event_inventoryTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField branQuantityField;
    private javax.swing.JTextField brokenRiceQuantityField;
    private javax.swing.JButton clearButton;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> paddyIdField;
    private javax.swing.JTextField riceQuantityField;
    private javax.swing.JTextField storageLocationField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}