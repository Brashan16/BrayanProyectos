/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author USUARIO
 */
public class Persona {
   private String cedula;
   private String Prinombre;
   private String Segnombre;
   private String Priapellido;
   private String Segapellido;
   private String telefono;
   private String direccion;
   private String correo;

    public Persona() {
    }

    public Persona(String cedula, String Prinombre, String Segnombre, String Priapellido, String Segapellido, String telefono, String direccion, String correo) {
        this.cedula = cedula;
        this.Prinombre = Prinombre;
        this.Segnombre = Segnombre;
        this.Priapellido = Priapellido;
        this.Segapellido = Segapellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPrinombre() {
        return Prinombre;
    }

    public void setPrinombre(String Prinombre) {
        this.Prinombre = Prinombre;
    }

    public String getSegnombre() {
        return Segnombre;
    }

    public void setSegnombre(String Segnombre) {
        this.Segnombre = Segnombre;
    }

    public String getPriapellido() {
        return Priapellido;
    }

    public void setPriapellido(String Priapellido) {
        this.Priapellido = Priapellido;
    }

    public String getSegapellido() {
        return Segapellido;
    }

    public void setSegapellido(String Segapellido) {
        this.Segapellido = Segapellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
   
   
}

