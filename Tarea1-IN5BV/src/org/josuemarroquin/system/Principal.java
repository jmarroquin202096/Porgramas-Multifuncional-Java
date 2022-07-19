package org.josuemarroquin.system;
import java.util.Scanner;
/**
 *
 * @author $ { Josué Daniel Marroquín Hernández 
 * Codigo Tecnico: IN5BV 
 * Carnet: 2020296 }
 */
public class Principal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
            int Opcion;
            
            System.out.println("Joué Daniel Marroquín Hernández.");
            System.out.println("IN5BV");
            System.out.println("2020296");
            
            System.out.println("-----------------------------MENÚ-------------------------");
            System.out.println("1-  Ejercicio #1: Segundo a H:M:S");
            System.out.println("2-  Ejercicio #2: Convertidor de Billetes");
            System.out.println("3-  Ejercicio #3: Par o Impar");
            System.out.println("4-  Ejercicio #4: Numeros Perfectos");
            System.out.println("5-  Ejercicio #5: Fibonacci");
           
            System.out.println("Ingrese el Numero del Ejercicio que desea: ");
            Opcion = in.nextInt();

            switch (Opcion) {
                case 1:
                    int Segundos; 
                    int Horas;
                    int Minutos;
                    System.out.println("Ingrese los Segundos: ");
                    Segundos = in.nextInt();
                    
                  Horas = Segundos / 3600;
                  Minutos = Segundos / 60 - Horas * 60;
                  Segundos = Segundos - Minutos * 60 - Horas * 3600;
                    
                    System.out.println("La conversion es: "  + "Horas:"+ Horas +" "  + ",  Minutos:"+ Minutos +" " + ", Segundos:"+ Segundos);    
                    break;
                case 2:
                     int Dinero; 
                     int  Doscientos = 0; 
                     int Cien = 0; 
                     int Cincuenta = 0; 
                     int Veinte = 0; 
                     int Diez = 0 ;
                     int Cinco = 0; 
                     int Uno = 0;
                    System.out.println("Ingrese la cantidad de Dinero que tiene: ");
                    Dinero = in.nextInt();
                     
                    Doscientos =  Dinero / 200;
                    Cien = (Dinero - 200 * Doscientos)/ 100;
                    Cincuenta = (Dinero - 200 * Doscientos - 100 * Cien) / 50;
                    Veinte = (Dinero - 200 * Doscientos - 100 * Cien - 50 * Cincuenta) / 20;
                    Diez = (Dinero - 200 * Doscientos - 100 * Cien - 50 * Cincuenta - 20 * Veinte) / 10;
                    Cinco = (Dinero - 200 * Doscientos - 100 * Cien - 50 * Cincuenta - 20 * Veinte - 10 * Diez) / 5;
                    Uno = (Dinero - 200 * Doscientos - 100 * Cien - 50 * Cincuenta - 20 * Veinte - 10 * Diez -5 * Cinco ) / 1;
                    
                    System.out.println("Necesita Billetes de " + "Doscientos: " + Doscientos + ", Cien: " + Cien + ", Cincuenta: " + 
                     Cincuenta + ", Veinte: " + Veinte + ", Diez: " + Diez + ", Cinco: " + Cinco + ", Uno: " + Uno);
                     break;
                case 3:
                    int Numero;
                    System.out.println("Ingrese un Numero: ");
                    Numero = in.nextInt();
                     if ((Numero % 2) == 0) {
                         System.out.println("El Numero es Par.");
                     } else { 
                         System.out.println("El Numero es Impar.");
                     }
                    break;
                case 4:
                   int  Nperfecto;
                   int Contador;
                   int operacion = 0;
                    System.out.println("Ingrese su Numero: ");
                    Nperfecto = in.nextInt();
                   for (Contador = 1; Contador < Nperfecto; Contador++) {
                        if (Nperfecto % Contador == 0) {
                              operacion = operacion + Contador;
                              }
                    } 
                    if (operacion == Nperfecto) {
                        System.out.println("El Numero es Perfecto");
                    } else {
                        System.out.println("El Numero no es Perfecto");
                    } 
                    break;
                case 5:
                    int Fn;
                    int N1 = 0;
                    int N2 = 1;
                    int Tem;
                    int Conta = 2;
                    System.out.println("Ingrese el Numero que quiere la Sucesión Fibonacci: ");
                    Fn = in.nextInt();
                    
                    System.out.println(N1);
                    System.out.println(N2);
                    
                       while (Conta < Fn) {
                        Conta ++;
                        Tem = N1;
                        N1 = N2;
                        N2 = Tem + N2;
                        System.out.println(N2);
                        }
                    break;

        }

    }

}
