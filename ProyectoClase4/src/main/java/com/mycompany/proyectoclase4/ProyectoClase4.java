/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoclase4;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ProyectoClase4 {

    public static void main(String[] args) {
        // Ejercicio 1
        ejercicio1();
    }
    
    
    private static void ejercicio1(){
    int[] numeros= new int[3];
    Clase4Ejercicio3 ejercicio3= new Clase4Ejercicio3();
   
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
    Clase4Ejercicio1 ejemplo1=new  Clase4Ejercicio1();
    
    numeros=ejemplo1.imprimirOrdenArreglo(numeros, orden);
     System.out.println("Order Desendiente (D)- Ascendiente (A) --> "+orden + "  Resultado del Vector: "+numeros[0]+" "+numeros[1]+" "+numeros[2]);
    
    
    }
}
