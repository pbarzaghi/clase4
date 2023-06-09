/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclase4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



/**
 * Se realizo esta clase para todos metodos y manejos de archivos
 * @author pBarzaghi
 */
public class Clase4Archivo {
    private  String path;

    Clase4Archivo(String path) {
       this.path=path;  }
     
      Clase4Archivo() {
       this.path="";  }
 
   public String getPath(){
      return this.path;
   }
   
   public void setPath(String path){
     this.path=path;
   }
   
   /*
     Metodo retorna el contenido del archivo que fue instaciada la 
     clase con el path
      
   */
    public  List <String> getArchivo(){
          
            List <String> fileOut = new ArrayList<>();
          try {
            fileOut = Files.readAllLines(Paths.get(getPath()));
              
            }
          catch (IOException ex) {
            System.out.println(" Error al leer el Archivo "+Clase4Archivo.class +"  Mensaje "+ ex.getMessage());
        }
     return fileOut;
   }
    
    public void crearFile(String contenido){
        
        try {
         
            File file = new File(path);
             // Si el archivo no existe es creado
            if (!file.exists()) {
                 file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (IOException ex) {
                    System.out.print("Clase :"+ Clase4Archivo.class.getName()+" error: " +ex.getMessage());
          }
         
         
         }
             
    
  }
