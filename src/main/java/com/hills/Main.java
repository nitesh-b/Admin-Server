/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hills;

import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.hills.data.FirebaseInitializaton;

/**
 *
 * @author nitesh.banskota
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        FirebaseInitializaton firebaseInitializaton = new FirebaseInitializaton();
        FirstFrame firstFrame = new FirstFrame();
        System.out.println("I am at Main fragment");
        firstFrame.setVisible(true);
         
    }
    
}
