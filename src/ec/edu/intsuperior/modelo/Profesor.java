/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author USUARIO
 */
public class Profesor extends Persona{
    private String edad;
    private MateriasConocedoras materiaDominate;

    public Profesor() {
    }

    public Profesor(String edad, MateriasConocedoras materiaDominate) {
        this.edad = edad;
        this.materiaDominate = materiaDominate;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public MateriasConocedoras getMateriaDominate() {
        return materiaDominate;
    }

    public void setMateriaDominate(MateriasConocedoras materiaDominate) {
        this.materiaDominate = materiaDominate;
    }
    
}
