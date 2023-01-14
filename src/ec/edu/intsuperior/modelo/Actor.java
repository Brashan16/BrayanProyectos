/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author USUARIO
 */
public class  Actor extends Persona{
    private String nacionalidad;
    private ColorOjos colorOjos;
    private String estatura;

    public Actor() {
    }

    public Actor(String nacionalidad, ColorOjos colorOjos, String estatura) {
        this.nacionalidad = nacionalidad;
        this.colorOjos = colorOjos;
        this.estatura = estatura;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public ColorOjos getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(ColorOjos colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }
 
}
