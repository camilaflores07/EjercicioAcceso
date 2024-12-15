/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acceso;

import java.util.Scanner;

public class Acceso {
    

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
            
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String CCorrecta = "Pam123@";
        String CClave;
        int intentos=0;
        int CIntentos = 4;
        
        
        
        do{
            System.out.println("Porfavor ingrese una clave");
            CClave = entrada.next();
            intentos++;
            
            if(!CCorrecta.equals(CClave)){
                System.out.print(ANSI_RED+"Contrasena incorrecta, has utilizado : " + intentos + " intentos "+ " de : " + CIntentos);
                
                
            
            }
     
        }while(!CCorrecta.equals(CClave)&& intentos < CIntentos);
        
        if(CCorrecta.equals(CClave)){
            System.out.println(ANSI_GREEN+"Clase correcta, puedes ingresar"); 
        }
        else{
            System.out.print(ANSI_RED+ "No tienes mas intentos");
        }
            
       
        
    }
    
}
