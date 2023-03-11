/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclase4;

/**
 * a. haga un main, donde por parámetro ponga 3 números y una letra que
 *     represente ascendente o descendente y los muestre ordenados por tal criterio
 * @author pBatzaghi
 */
public class Clase4Ejercicio1a {
  
    
    
    public int[] imprimirOrdenArreglo(int[] numeros, char orden){
   
       int auxiliar;
       boolean desendiente =(orden =='d');
       for(int i=1; i< numeros.length;){
       
           if(desendiente){
             if(numeros[i-1]> numeros[i]){
              auxiliar=numeros[i-1];
              numeros[i-1]=numeros[i];
              numeros[i]=auxiliar;
              i=1;
             }else {
              i++;
             }
           }else {
                 if(numeros[i-1]  < numeros[i]){
                    auxiliar=numeros[i];
                    numeros[i]=numeros[i-1];
                    numeros[i-1]=auxiliar;
                      i=1;
                  }else {
                      i++;
                  }//Fin If
           
           }// fin else
       
       }// fin del for
       return numeros;
   }  
}
