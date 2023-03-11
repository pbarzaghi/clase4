/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclase4;

/**
 *
 * @author pBarzaghi
 */
public class Clase4Ejercicio2a {
    
    
    
    /*
   * Metodo generico que dado el archivo de numeros imprime segun la operacion que se
     le envie
   */
    public void imprimirFileDadaOperacion(Clase4Archivo file,String op){
     char[] cadena;   
      int sumaNros=0;
      for (String linea: file.getArchivo()){
          cadena=linea.toCharArray();
          sumaNros=operacionEntreLineas(cadena,op);
        
         
           System.out.println("********************************");
           System.out.println("Longitud de la cadena "+cadena.length);
            System.out.print(" Los numeros que aparecen ");  System.out.println(cadena);
            if("+".equals(op))
                System.out.println("SUMA ES : "+ sumaNros);  
            else 
                System.out.println("MULTIPLICACION ES : "+ sumaNros);  
      }
    }

      public void imprimirSumaFile(Clase4Archivo file){
          
         this.imprimirFileDadaOperacion(file,"+");
      
      }


  

    private  int operacionEntreLineas(char[] cadena, String op) {
        
        int suma=0;
        int mult=1;
        for(int i=0;i<cadena.length;i++ )
              if(! " ".equals(String.valueOf(cadena[i])))
                       if( "+".equals(op))
                         suma+=Integer.valueOf( String.valueOf(cadena[i])).intValue();
                        else if( "*".equals(op))  
                          mult*=Integer.valueOf( String.valueOf(cadena[i])).intValue();
                            else   
                                System.out.println("EL OPERADOR INVALIDO");
    
       if ( "+".equals(op))
               return suma;
         else return mult;
      
    }
    
    
    
}
