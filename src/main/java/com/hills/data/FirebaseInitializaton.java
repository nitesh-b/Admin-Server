/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hills.data;

import com.google.api.services.storage.model.Bucket;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.cloud.StorageClient;
import com.google.firebase.database.FirebaseDatabase;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author nitesh.banskota
 */
public class FirebaseInitializaton {
    public static FirebaseApp firebaseApp;
    public static Firestore firestore;
    public static FirebaseDatabase firebaseDatabase;
    public static Bucket bucket;
    public static Storage storage;
    
    public FirebaseInitializaton(){
        try{
        InputStream serviceAccount = new FileInputStream("hillsapp-5b438-firebase-adminsdk-k6hsl-7f248dff5d.json");
        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(credentials)
             .setStorageBucket("hillsapp-5b438.appspot.com")
            .build();
        
        FirebaseInitializaton.firebaseApp = FirebaseApp.initializeApp(options);
        FirebaseInitializaton.firestore = FirestoreClient.getFirestore();
        FirebaseInitializaton.firebaseDatabase= FirebaseDatabase.getInstance("https://hillsapp-5b438.firebaseio.com/");
        
        storage = StorageOptions.newBuilder()
                .setCredentials(credentials)
                .build()
                .getService();
        
        }catch(IOException exception){
            System.out.println("Error occured:" + exception);
        }
        
    }
    
}
