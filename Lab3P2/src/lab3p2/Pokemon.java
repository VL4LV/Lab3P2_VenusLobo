/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2;

public class Pokemon {

    protected String nombrePokemon;
    protected int numeroEntrada;
    protected String naturaleza;
    protected boolean atrapado = false;
    protected Pokeball ball;

    public Pokemon() {
    }

    public Pokemon(String nombrePokemon, int numeroEntrada, String naturaleza) {
        this.nombrePokemon = nombrePokemon;
        this.numeroEntrada = numeroEntrada;
        this.naturaleza = naturaleza;
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
        return "Nombre del Pokemon = " + nombrePokemon +"\n"
                + "Numero de entrada = " + numeroEntrada +"\n"
                + "Naturaleza = " + naturaleza +"\n"
                + "Atrapado = " + atrapado +"\n"
                + "PokeBall = " + ball;

    }

}
