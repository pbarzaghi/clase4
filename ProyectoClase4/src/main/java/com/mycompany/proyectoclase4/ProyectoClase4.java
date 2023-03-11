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
   
    String nro1=JOptionPane.showInputDialog("Ingrese un munero 1 ");
    String nro2=JOptionPane.showInputDialog("Ingrese un munero 2 ");
    String nro3=JOptionPane.showInputDialog("//Ingrese un munero 3 ");
    
    numeros[0]= Integer.parseInt(nro1);
    numeros[1]= Integer.parseInt(nro2);
    numeros[2]= Integer.parseInt(nro3);
    
 
    
     char orden =  JOptionPane.showInputDialog("Order Desendiente (D)- Ascendiente (A)").toLowerCase().charAt(0);
   
     System.out.println("INGRESO Nros Originales " +nro1+" "+ nro2+" "+nro3);
     Clase4Ejercicio1 ejemplo1=new  Clase4Ejercicio1();
     numeros=ejemplo1.imprimirOrdenArreglo(numeros, orden);
     System.out.println("Orden "+orden + " Vector "+numeros[0]+" "+numeros[1]+" "+numeros[2]);
    
    
    }
}
