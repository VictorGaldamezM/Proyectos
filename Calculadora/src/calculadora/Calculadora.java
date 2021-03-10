/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Victor Galdamez
 */
public class Calculadora {
    
    //Metodo principal
    public static void main(String[] args) {     
        
        //Definir variables
        Scanner objInput = new Scanner(System.in);
        String strContinuar = null;
        
        do {
            System.out.println("Seleccionar una opcion");
            System.out.println("a. Sumar");
            System.out.println("b. Restar");
            System.out.println("c. Multiplicar");
            System.out.println("d. Dividir");
            System.out.print("Escribir la opcion: ");
            
            //Recibir el valor del buffer del teclado
            String strOpcion = objInput.nextLine();
            
            //Definir variables para las operaciones
            float[] fltArrNumeros = new float[2];
            float fltResultado = 0;
            
            //Definir variable de error
            boolean blnError = true;
            
            switch(strOpcion) {
                case "a":
                    strOpcion = "Sumar";
                    System.out.println("");
                    
                    //Solicitar los valores numericos            
                    for (int i=0; i<2; i++) {
                        System.out.print("Ingresar el numero " + (i+1) + ": ");
                        fltArrNumeros[i] = objInput.nextFloat();
                        objInput.nextLine();
                    }
                    
                    fltResultado = fltArrNumeros[0] + fltArrNumeros[1];
                    
                    //Control
                    blnError = false;
                    
                    //Salir del case
                    break;
                    
                case "b":
                    strOpcion = "Restar";
                    System.out.println("");
                    
                    //Solicitar los valores numericos            
                    for (int i=0; i<2; i++) {
                        System.out.print("Ingresar el numero " + (i+1) + ": ");
                        fltArrNumeros[i] = objInput.nextFloat();
                        objInput.nextLine();
                    }
                    
                    fltResultado = fltArrNumeros[0] - fltArrNumeros[1];
                    
                    //Control
                    blnError = false;
                    
                    //Salir del case
                    break;  
                    
                case "c":
                    strOpcion = "Multiplicar";
                    System.out.println("");
                    
                    //Solicitar los valores numericos            
                    for (int i=0; i<2; i++) {
                        System.out.print("Ingresar el numero " + (i+1) + ": ");
                        fltArrNumeros[i] = objInput.nextFloat();
                        objInput.nextLine();
                    }
                    
                    fltResultado = fltArrNumeros[0] * fltArrNumeros[1];
                    
                    //Control
                    blnError = false;
                    
                    //Salir del case
                    break;  
                    
                    case "d":
                    strOpcion = "Dividir";
                    System.out.println("");
                    
                    //Solicitar los valores numericos            
                    for (int i=0; i<2; i++) {
                        System.out.print("Ingresar el numero " + (i+1) + ": ");
                        fltArrNumeros[i] = objInput.nextFloat();
                        objInput.nextLine();
                    }
                    
                    if (fltArrNumeros[1]==0) {
                        System.out.println("El denominador no puede ser cero");
                        
                        //Cobtrol
                        blnError = true;
                    }
                    else {
                        fltResultado = fltArrNumeros[0] / fltArrNumeros[1];
                        
                        //Control
                        blnError = false;                        
                    }        
        
                    //Salir del case
                    break;      
                    
                default:
                    //Error
                    blnError = true;
                    
                    //Salir del case
                    break;                               
            }
            
            System.out.println("");
            
            //Desplegar los datos, si no hay error
            if (blnError==false) {
                System.out.println("El resultado es: " + fltResultado);
            }
            else if (blnError==true) {
                System.out.println("No se puede realizar la operacion");
            }
            
            System.out.println("La opcion seleccionada fue " + strOpcion);            
            System.out.println("");
            System.out.print("Desea continuar S/N: ");
            
            //Capturar el buffer para continuar
            Scanner objInput2 = new Scanner(System.in);
            strContinuar = objInput2.nextLine();
            System.out.println("");
        }
        while (strContinuar.equals("s") || strContinuar.equals("S"));
    }    
}