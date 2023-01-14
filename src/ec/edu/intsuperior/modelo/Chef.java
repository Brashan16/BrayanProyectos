/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author USUARIO
 */
public class Chef extends Persona{
    private String sexo;
    private int aniosExperiencia;

    public Chef() {
    }

    public Chef(String sexo, int aniosExperiencia) {
        this.sexo = sexo;
        this.aniosExperiencia = aniosExperiencia;
        
    }

    public Chef(String maculino, String string, String string0, String brayan, String styven, String jimenez, String conlago, String string1, String av_La_bota, String brayanjimenezintsuperioreduec) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

}
