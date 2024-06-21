/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectof;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Paciente extends Persona
{
    static Scanner entrada = new Scanner (System.in);
    
    private String DescripcionSintomas;

    public Paciente(String DescripcionSintomas, int Cedula, String Nombre, String Apellido1, String Apellido2, String Correo, int Edad) {
        super(Cedula, Nombre, Apellido1, Apellido2, Correo, Edad);
        this.DescripcionSintomas = DescripcionSintomas;
    }
public Paciente()
{
    this.DescripcionSintomas = "";
}
  

    public String getDescripcionSintomas() {
        return DescripcionSintomas;
    }

    public void setDescripcionSintomas(String DescripcionSintomas) {
        this.DescripcionSintomas = DescripcionSintomas;
    }
    
    public void GuardarDatos()
    {
        System.out.println("Describir sintomas");
        setDescripcionSintomas(entrada.next());
        System.out.println("Ingrese la cedula");
        setCedula(entrada.nextInt());
        System.out.println("Ingrese su nombre");
        setNombre(entrada.next());
        System.out.println("Ingrese primer apellido");
        setApellido1(entrada.next());
        System.out.println("Ingrese segundo apellido");
        setApellido2(entrada.next());
        System.out.println("Ingrese su correo");
        setCorreo(entrada.next());
        System.out.println("Ingrese su edad");
        setEdad(entrada.nextInt());
    }
     public void asignarcita()
    {
        System.out.println("Describir sintomas");
        setDescripcionSintomas(entrada.next());
         System.out.println("Ingrese su nombre");
        setNombre(entrada.next());
        System.out.println("Ingrese primer apellido");
        setApellido1(entrada.next());
        System.out.println("Ingrese segundo apellido");
        setApellido2(entrada.next());
        System.out.println("Ingrese la cedula");
        setCedula(entrada.nextInt());
    }
    
    public void MostrarDatos()
    {
        System.out.println("Sintomas: "+getDescripcionSintomas());
        System.out.println("Cedula: "+getCedula());
        System.out.println("Nombre: "+getNombre()+" "+getApellido1()+" "+getApellido2());
        System.out.println("Correo: "+getCorreo());
        System.out.println("Edad: "+getEdad()+"años");
         System.out.println("------------------------");
    }
    public void MostrarCita()
    {
        System.out.println("------------------------");
        System.out.println("Sintomas: "+getDescripcionSintomas());
       System.out.println("Nombre: "+getNombre()+" "+getApellido1()+" "+getApellido2());
        System.out.println("Cedula: "+getCedula());
         System.out.println("------------------------");
    }

    
            
}
