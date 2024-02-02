/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2;

public class Pokeball {

    protected String color;
    protected int numeroSerie;
    protected int eficiencia;

    public Pokeball() {
    }

    public Pokeball(String color, int numeroSerie, int eficiencia) {
        this.color = color;
        this.numeroSerie = numeroSerie;
        this.eficiencia = eficiencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {
        return "Pokeball{" + "color=" + color + ", numeroSerie=" + numeroSerie + ", eficiencia=" + eficiencia + '}';
    }
    

}
