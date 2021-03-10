/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruleta;

import java.util.Scanner;

/**
 *
 * @author Victor Galdamez
 */
public class Ruleta {  
    
    public static void main(String args[]) {
        
        //Define variables
        int numero = 0, creditos = 100, apuesta = 10;
        String strContinuar = null;        
        
        System.out.println("--------------------------------");
        System.out.println("BIENVENIDO AL JUEGO DE LA RULETA");
        System.out.println("--------------------------------");
        System.out.println("Numeros color negro: 2,4,6,8,10");
        System.out.println("Numeros color blanco: 1,3,5,7,9");
        System.out.println("Valor de cada apuesta: 10 Creditos");
        System.out.println(""); 
        
        do {
            System.out.println("Saldo: " + creditos + " Creditos");     
                        
            //Solicita y captura un numero
            System.out.print("Ingresa el numero por el que deseas apostar: ");
            Scanner objInput = new Scanner(System.in);
            numero = objInput.nextInt();
            creditos = creditos - apuesta;
            
            //Genera un numero aleatorio de 1-10
            int aleatorio = (int)(Math.random()*10)+1;
            System.out.println("");
            System.out.println("El numero generado por la ruleta fue: " + aleatorio);
            
            //Compara el numero elegido con el aleatorio
            if(numero==aleatorio) {
                creditos = creditos + apuesta*3;
                System.out.println("Has ganado el triple de la apuesta");
            }
            else if(numero%2==0 && aleatorio%2==0) {
                creditos = creditos + apuesta*2;
                System.out.println("Has ganado el doble de la apuesta");
            }
            else if(numero%2==1 && aleatorio%2==1) {
                creditos = creditos + apuesta*2;
                System.out.println("Has ganado el doble de la apuesta");
            }           
            else {
                System.out.println("Has perdido la apuesta");
            }
                                      
            System.out.println("");
            System.out.print("Continuar apostando S/N: ");
            
            //Captura el buffer para continuar
            Scanner objInput2 = new Scanner(System.in);
            strContinuar = objInput2.nextLine();
            System.out.println("");
        }        
        while(strContinuar.equals("S") && creditos>=10);
        
        if(creditos==0) {
            System.out.println("No tienes creditos suficientes");
        }
        else{
            System.out.println("Saldo final: " + creditos + " Creditos");
        }
    }
}