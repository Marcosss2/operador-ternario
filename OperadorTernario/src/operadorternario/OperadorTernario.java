/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

import java.util.Scanner;


public class OperadorTernario {

   
   
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
     
    
       var nota = 4; 
       var mensaje ="";
       
       if (nota <5) {
           
           mensaje = "suspenso";
       }else{
           
           mensaje = "aprobado";
       }
        System.out.println(mensaje);
  
         var otromensaje = (nota < 5)? "suspenso":"aprobado";
         
         System.out.println(otromensaje);
       
    
         Scanner en = new Scanner(System.in);
         var numero = 0;
         do {
           System.out.println("introduce un numero");  
            numero = en.nextInt();
            if(numero %2 == 0){
                
              System.out.println("el numero" + numero + "es par");   
                
            }else if (numero == 1){
                continue;
                
            }else {
                
                System.out.println("el numero" + numero + "es impar");
                
                
            }
             
         
         
         
         
         
         
         
         }while(numero != 10);
         
         
         
         
         
         
         
         
     
    }
    
}
