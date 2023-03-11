/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclase4;

/**
 * Esta clase tiene los metodos para realizar la codificación y decodificación
 * de un string, dado un número de desplazamiento
 * @author pbarzaghi
 */
public class FileCodeAndDeco {
    
    private  String strCode="abcdefghijklmnñopqrstuvwxyz";
    
     public String codificarStr(String cadena,int desplazamiento){
            
         char[] cadenaChar= cadena.toCharArray();
         String resultado="";
         int posicion=0;
       for(int i=0; i < cadenaChar.length;i++){
                   
            posicion = strCode.indexOf(cadenaChar[i]);
            if(posicion != -1 ){
            resultado+=strCode.charAt(posicion+desplazamiento);
           }else{
              resultado+=strCode.charAt(0);
         }
       
       }
    return resultado;
    }
    
    
   public  String decoStr(String cadena,int desplazamiento){
    char[] cadenaChar= cadena.toCharArray();
         String resultado="";
         int posicion=0;
       for(int i=0; i < cadenaChar.length;i++){
                   
            posicion = strCode.indexOf(cadenaChar[i]);
             if(posicion == 0 )
                   resultado+=" ";
             else 
                 resultado+=strCode.charAt(posicion-desplazamiento);
        
       
       }
    return resultado;
    }
    
}
