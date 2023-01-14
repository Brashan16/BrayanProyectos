/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author USUARIO
 */
public class MateriasConocedoras {
    private String matematicas;
    private String lenguajeLiteratura;
    private String biologia;
    private String historia;
    private String ingles;
    private String educacionFisica;

    public MateriasConocedoras() {
    }

    public MateriasConocedoras(String matematicas, String lenguajeLiteratura, String biologia, String historia, String ingles, String educacionFisica) {
        this.matematicas = matematicas;
        this.lenguajeLiteratura = lenguajeLiteratura;
        this.biologia = biologia;
        this.historia = historia;
        this.ingles = ingles;
        this.educacionFisica = educacionFisica;
    }

    public String getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(String matematicas) {
        this.matematicas = matematicas;
    }

    public String getLenguajeLiteratura() {
        return lenguajeLiteratura;
    }

    public void setLenguajeLiteratura(String lenguajeLiteratura) {
        this.lenguajeLiteratura = lenguajeLiteratura;
    }

    public String getBiologia() {
        return biologia;
    }

    public void setBiologia(String biologia) {
        this.biologia = biologia;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getEducacionFisica() {
        return educacionFisica;
    }

    public void setEducacionFisica(String educacionFisica) {
        this.educacionFisica = educacionFisica;
    }
   
}
