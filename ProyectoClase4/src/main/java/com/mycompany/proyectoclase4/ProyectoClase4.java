/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoclase4;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Paths;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class ProyectoClase4 {
    
    public static void main(String[] args) {
     
      
        // Ejercicio 1
             //ejercicio1();
        
        // Ejercicio 2
             // ejercicio2();
             
       // Ejercicio 3     
             ejercicio3();
    }
   
    
    private static void ejercicio1(){
    int[] numeros= new int[3];
    Clase4Ejercicio1bc ejercicio3= new Clase4Ejercicio1bc();
   
    // Invoco ingresar el numero y realizo la validacion que sea un numero    
    numeros[0]= ejercicio3.ingreseNumero(1);
    numeros[1]= ejercicio3.ingreseNumero(2);
    numeros[2]= ejercicio3.ingreseNumero(3);
    
    
    String cadenaOrden =JOptionPane.showInputDialog("Order Desendiente (D)- Ascendiente (A)");
    while (cadenaOrden.length()==0 )
        cadenaOrden =JOptionPane.showInputDialog("Order Desendiente (D)- Ascendiente (A)");
     
    // Reemplazamos esta linea para implementar el ejercicio 3
    //char orden =  JOptionPane.showInputDialog("Order Desendiente (D)- Ascendiente (A)").toLowerCase().charAt(0);
    
     // Implementacion del Ejercicio 3
    char orden =ejercicio3.ingreseOrden();
    Clase4Ejercicio1a ejemplo1=new  Clase4Ejercicio1a();
    
    numeros=ejemplo1.imprimirOrdenArreglo(numeros, orden);
     System.out.println("Order Desendiente (D)- Ascendiente (A) --> "+orden + "  Resultado del Vector: "+numeros[0]+" "+numeros[1]+" "+numeros[2]);
    
    
    }

    private static void ejercicio2() {
      String path="E:\\UTN\\Proyectos\\Clase4\\ProyectoClase4\\holaMundo.txt";
      Clase4Archivo file = new Clase4Archivo(path); 
      Clase4Ejercicio2a ejer2= new Clase4Ejercicio2a();
     // Se comenta este metodo para realizar el inciso a que es general 
      // ejer2.imprimirSumaFile(file);
      
        String operacion =JOptionPane.showInputDialog("Operacion Suma(+)- Multiplicacion (*)");
    while (operacion.length()==0 || !("+".equals(operacion) || "*".equals(operacion)) )
        operacion =JOptionPane.showInputDialog("Operacion Suma(+)- Multiplicacion (*)");
     
    ejer2.imprimirFileDadaOperacion(file, operacion);
     
    
    }

    private static void ejercicio3() {
        
        String path="E:\\UTN\\Proyectos\\Clase4\\ProyectoClase4\\";
        
        String fileSinCodificador="sinCodificado.txt";
        String fileCodificado="codificado.txt";
        
        String strOrigina=JOptionPane.showInputDialog("Ingrese la oracion a codificar");
        
        Clase4Archivo fileSinCodificar = new Clase4Archivo(path+fileSinCodificador);
        fileSinCodificar.crearFile(strOrigina);
        
        String strDesplazamiento= JOptionPane.showInputDialog("Ingrese un munero Desplazamiento ");
      
        int desplazamiento= Integer.parseInt(strDesplazamiento);
        
        FileCodeAndDeco fileCodeDeco= new FileCodeAndDeco();
        String strCodificado=fileCodeDeco.codificarStr(strOrigina, desplazamiento);
        
        Clase4Archivo filesCodificados = new Clase4Archivo(path+fileCodificado);
        filesCodificados.crearFile(strCodificado);
        
         JOptionPane.showMessageDialog(null, "El archivo: "+fileSinCodificador + " se codifico CORRECTAMENTE en el alchivo: "+fileCodificado);
          
       }
     
}
