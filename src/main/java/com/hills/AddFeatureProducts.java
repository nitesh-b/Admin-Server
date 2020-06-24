/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hills;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;

import com.google.cloud.firestore.WriteResult;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.hills.data.FirebaseInitializaton;
import com.hills.data.FullProductDetails;
import com.hills.data.ProductDetails;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author nitesh.banskota
 */
public class AddFeatureProducts extends javax.swing.JFrame {

    
    private String filename;
    private Query firebaseQuery;
    ArrayList<FullProductDetails> myList;
   
    
    /**
     * Creates new form AddFeatureProducts
     * @throws java.io.IOException
     */
    public AddFeatureProducts() throws IOException {
       
        initComponents();
        imageUploadButton.setEnabled(false);
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
        sku = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        supplierTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        linkWebsiteTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productDescriptionTextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        imageUploadButton = new javax.swing.JButton();
        celarAllButton = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        addDataButton = new javax.swing.JButton();
        imageIconLabel = new javax.swing.JLabel();
        optionSelector = new javax.swing.JComboBox<>();
        imageUrlTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Feature Product");

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Add New featured product");

        jLabel2.setText("SKU");

        sku.setToolTipText("Enter SKU Number");
        sku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skuActionPerformed(evt);
            }
        });

        jLabel3.setText("Product Name");

        productNameTextField.setToolTipText("Enter SKU Number");

        jLabel4.setText("Supplier");

        supplierTextField.setToolTipText("Enter SKU Number");

        jLabel5.setText("Link to website");

        linkWebsiteTextField.setToolTipText("Enter SKU Number");

        jLabel6.setText("Description");

        productDescriptionTextArea.setColumns(20);
        productDescriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(productDescriptionTextArea);

        jLabel7.setText("Image URL");

        imageUploadButton.setText("Add Image");
        imageUploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUploadButtonActionPerformed(evt);
            }
        });

        celarAllButton.setText("Clear");
        celarAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celarAllButtonActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        addDataButton.setText("Add");
        addDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataButtonActionPerformed(evt);
            }
        });

        imageIconLabel.setBackground(new java.awt.Color(0, 255, 255));
        imageIconLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 255), null, null));

        optionSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "access_control", "cctv", "itc" }));
        optionSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionSelectorActionPerformed(evt);
            }
        });

        imageUrlTextField.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                imageUrlTextFieldComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                imageUrlTextFieldComponentRemoved(evt);
            }
        });
        imageUrlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUrlTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(sku, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(productNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(supplierTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(73, 73, 73))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linkWebsiteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imageUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imageUploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(27, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celarAllButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(optionSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(supplierTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(linkWebsiteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(imageUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageUploadButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(celarAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(imageIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imageUploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUploadButtonActionPerformed
      try{ 
       BufferedImage image = ImageIO.read(new URL(imageUrlTextField.getText()));
       Image scaledImage = new FirstFrame().getScaledImage(image, 290, 165);
        ImageIcon icon = new ImageIcon(scaledImage);
        imageIconLabel.setIcon(icon);
        } catch (MalformedURLException ex) {
                       JOptionPane.showMessageDialog(null, "Error retriving URL"); 
                        
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Image not Found");
                    } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Unknown error");
        }
        
    
    
    }//GEN-LAST:event_imageUploadButtonActionPerformed

    private void addDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataButtonActionPerformed
        
        /* Get from form into Variable */
         String imageUrl = imageUrlTextField.getText();
         String skuCode = sku.getText();
         String productName = productNameTextField.getText();
         String link = linkWebsiteTextField.getText();
         String supplier = supplierTextField.getText();
         String productDescription= productDescriptionTextArea.getText();
         String subCategory = optionSelector.getSelectedItem().toString().toLowerCase();
         
         ProductDetails details = new ProductDetails(
                 imageUrl,
                 link,
                 supplier,
                 productDescription,
                 skuCode
         );
        DocumentReference dRef = FirebaseInitializaton.firestore.collection("Products")
                .document("featured_products")
                .collection(subCategory)
                .document(skuCode);
        ApiFuture<WriteResult> result = dRef.set(details);
        
        clearAllFields();   
    }//GEN-LAST:event_addDataButtonActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
        try {
            new FirstFrame().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(AddFeatureProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void imageUrlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUrlTextFieldActionPerformed
        if(imageUrlTextField.getText().isEmpty()){
            imageUploadButton.setEnabled(false);
        }
        else {
            imageUploadButton.setEnabled(true);
        }
    }//GEN-LAST:event_imageUrlTextFieldActionPerformed

    private void imageUrlTextFieldComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_imageUrlTextFieldComponentAdded

    }//GEN-LAST:event_imageUrlTextFieldComponentAdded

    private void imageUrlTextFieldComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_imageUrlTextFieldComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_imageUrlTextFieldComponentRemoved

    private void skuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skuActionPerformed


        // TODO add your handling code here:
        firebaseQuery =  FirebaseInitializaton.firebaseDatabase.getReference("item")
              .orderByChild("ItemSKU")
              .equalTo(sku.getText().toUpperCase());
        myList = new ArrayList<>();
             firebaseQuery.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot ds) {
                myList.clear();
                if (ds.exists()){
                    for (DataSnapshot dataSnapshot: ds.getChildren()){
                        System.out.println(dataSnapshot);
                        FullProductDetails details = dataSnapshot.getValue(FullProductDetails.class);
                        myList.add(details);
                    }
                    productNameTextField.setText(myList.get(0).getItemName());
                    productDescriptionTextArea.setText(myList.get(0).getItemHCSDescription());
                    supplierTextField.setText(myList.get(0).getItemSupplier());
                    linkWebsiteTextField.setText("https://www.hills.com.au/search?query="+sku.getText().toUpperCase()+"&categoryId=31");

                }
            }

            @Override
            public void onCancelled(DatabaseError de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
                });
       
        
             
    }//GEN-LAST:event_skuActionPerformed

    private void optionSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionSelectorActionPerformed

    private void celarAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celarAllButtonActionPerformed
      clearAllFields();
    }//GEN-LAST:event_celarAllButtonActionPerformed

  
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(AddFeatureProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFeatureProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFeatureProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFeatureProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddFeatureProducts().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AddFeatureProducts.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDataButton;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton celarAllButton;
    private javax.swing.JLabel imageIconLabel;
    private javax.swing.JButton imageUploadButton;
    private javax.swing.JTextField imageUrlTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField linkWebsiteTextField;
    private javax.swing.JComboBox<String> optionSelector;
    private javax.swing.JTextArea productDescriptionTextArea;
    private javax.swing.JTextField productNameTextField;
    private javax.swing.JTextField sku;
    private javax.swing.JTextField supplierTextField;
    // End of variables declaration//GEN-END:variables

    private void clearAllFields() {
        sku.setText("");
        productDescriptionTextArea.setText("");
        productNameTextField.setText("");
        supplierTextField.setText("");
        imageUrlTextField.setText("");
        linkWebsiteTextField.setText("");
        imageIconLabel.setIcon(null);
        imageUploadButton.setEnabled(false);
        
    }

}