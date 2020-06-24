/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hills;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.hills.data.CarauselImagesData;
import com.hills.data.FirebaseInitializaton;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author nitesh.banskota
 */
public class BannerImageInitialization extends javax.swing.JFrame {

    private List<CarauselImagesData> pList;

    public BannerImageInitialization() throws InterruptedException, ExecutionException {
        this.pList = new ArrayList<>();
        ApiFuture<QuerySnapshot> result = FirebaseInitializaton.firestore
                .collection("CarouselImages")
                .get();
        QuerySnapshot snapshot = result.get();
        List<QueryDocumentSnapshot> docList = snapshot.getDocuments();
        docList.forEach((document) -> {
            pList.add(document.toObject(CarauselImagesData.class));
        });
    }

    public List<CarauselImagesData> getpList() {
        return pList;
    }

    void updateTable(JTable table) throws MalformedURLException, IOException {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        Object[] row = new Object[2];
        for (int i = 0; i < pList.size(); i++) {
            row[0] = pList.get(i).getImage();
            row[1] = pList.get(i).getLink();
            tableModel.addRow(row);
        }
    }

   

}
