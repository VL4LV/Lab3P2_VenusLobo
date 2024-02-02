/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2;

public class GrassType extends Pokemon {

    private String habitad;
    private int dominioPlantas;

    public GrassType() {
    }

    public GrassType(String habitad, int dominioPlantas, String nombrePokemon, int numeroEntrada, String naturaleza) {
        super(nombrePokemon, numeroEntrada, naturaleza);
        this.habitad = habitad;
        this.dominioPlantas = dominioPlantas;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public int getDominioPlantas() {
        return dominioPlantas;
    }

    
    public void setDominioPlantas(int dominioPlantas) {
        this.dominioPlantas = dominioPlantas;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(int numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public Pokeball getBall() {
        return ball;
    }

    public void setBall(Pokeball ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "GrassType{" + "habitad=" + habitad + ", dominioPlantas=" + dominioPlantas + '}';
    }

    
}
