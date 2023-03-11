/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclase4;

import javax.swing.JOptionPane;

/**
 *
 * @author pBarzaghi
 */
public class Clase4Ejercicio1bc {
    
/**
 * Metodo de ingresarOrden pregunta si desea que sea Desendiente o Asendiente
 * En caso que no ingrese la letra "a" o "d" , se sigue preguntando indefinidamente
 * la pregunta. Retornando solo un caracter del orden deseado "a"o "d"
 * @return chat
 */


public char ingreseOrden(){
    
    String cadenaOrden="";
    boolean salida=true;
    while(salida){ 
       cadenaOrden=JOptionPane.showInputDialog("Orden Desendiente (D)- Ascendiente (A)").toLowerCase();
          if(cadenaOrden.equals("a")||cadenaOrden.equals("d")   )
             salida=false;
    }
    return cadenaOrden.charAt(0);
  
}// fin ingreseOrden

 public int ingreseNumero(int indice){
 
      String nro="";
    boolean salida=true;
    int numero=0;
    while(salida){ 
       nro=JOptionPane.showInputDialog("Ingrese un munero "+indice+" ");
       
       try{
          numero= Integer.parseInt(nro);
           salida=false;
       }catch( NumberFormatException e){
         System.out.println("Ingreso un fornato de numero incorrecto "+e.getMessage());
       }
            
    }
       
    return numero;
  
}// fin ingreseOrden
     
     
    
    
  
}
