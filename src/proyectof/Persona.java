/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectof;

/**
 *
 * @author HP
 */
public class Persona 
{
protected int Cedula;
protected String Nombre;
protected String Apellido1;
protected String Apellido2;
protected String Correo;
protected int Edad;

    public Persona(int Cedula, String Nombre, String Apellido1, String Apellido2, String Correo, int Edad) 
    {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Correo = Correo;
        this.Edad = Edad;
    }

    public Persona()
    {
        this.Cedula = 0;
        this.Nombre = "";
        this.Apellido1 = "";
        this.Apellido2 = "";
        this.Correo = "";
        this.Edad = 0;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    

        
}
