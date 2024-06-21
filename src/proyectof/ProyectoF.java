/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectof;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ProyectoF {
static Scanner entrada = new Scanner (System.in);
static Paciente [] VecPaciente;
static Paciente [][] MatriPaciente;
   
    public static void main(String[] args) 
    {
             System.out.println("ingrese la cantidad de pacientes a guardar");
        
        int F; 
        do {
            System.out.println("--------------------------------");
             System.out.println("Ingrese lo que desea hacer\n"
                + "1. Ingresar Pacientes\n"
                + "2. Mostrar Pacientes\n"
                + "3. Asignar Citas\n"
                + "4. Mostrar Citas\n"
                + "0. Salir\n"); 
             System.out.println("--------------------------------");
             F = entrada.nextInt(); 
             switch(F)
             {
                 case 1: 
                 {
                     
                   GuardarDatos();
                 break; 
                 }
                  case 2: 
                 {
                     MostrarDatos();
                 break; 
                 }
                  case 3: 
                 {
                   AsignarCitas();
           
        

                         break; 
                  }
                  case 4: 
                 {
                    MostrarCitas();
                 break; 
                 }
                  case 0: 
                 {
                     System.out.println("Saliendo del sistema. ¡Hasta luego!");
                 break; 
                 }
                  default: 
                 {
                     System.out.println("Dato no valido. Por favor, ingrese una opcion valida");
                 break; 
                 }
             }
        } while (F!=0);
          
        
       
        }
        static public void GuardarDatos()
        {
            {
            System.out.println("Ingrese la cantidad de pacientes a guardar");
        int a = entrada.nextInt();
        VecPaciente = new Paciente[a];
        }
        for (int i = 0; i < VecPaciente.length; i++) 
                                {
                                  Paciente P = new Paciente();
                                  P.GuardarDatos();
                                  VecPaciente[i] = P;
                                }
        }
        
        static public void MostrarDatos()
        {
             for (int i = 0; i < VecPaciente.length; i++) 
                                {
                                 VecPaciente[i].MostrarDatos();
                                }
        }
        
        static public void AsignarCitas()
        {
             //asignar citas
                    System.out.println("Ingrese la cantidad de citas");
                    int dias = entrada.nextInt(); 

                     MatriPaciente = new Paciente[dias][]; 
        
         // Pacientes por dia
                     for (int i = 0; i < MatriPaciente.length; i++) 
                  {
                       System.out.println("Ingrese la cantidad de pacientes del dia"+" "+i);
                        MatriPaciente [i] = new Paciente [entrada.nextInt()]; 
                    
                  }
                     // Asignar citas por ID de cédula
                      for (int i = 0; i < MatriPaciente.length; i++) {
            for (int j = 0; j < MatriPaciente[i].length; j++) {
                System.out.println("Ingrese el ID de la cédula del paciente para el día " +(i + 1)+" "+
                                 ", cita " +" "+(j + 1) + ": ");
                Paciente p = new Paciente();
                p.asignarcita();
               MatriPaciente [i][j]= p; 
            }
        }
        }
                     
        
                      
          static public void MostrarCitas()
          {
               System.out.println("Citas asignadas:");
                for (int i = 0; i < MatriPaciente.length; i++) {
                   System.out.println("Día " + (i + 1) + ":");
                for (int j = 0; j < MatriPaciente[i].length; j++) {
                System.out.print("Cita " + (j + 1) + ":\n" ); 
                MatriPaciente[i][j].MostrarCita();
                    System.out.println("\n\n");
            }
        }
          }
          
            
        
       
    }
       
    
    
     


