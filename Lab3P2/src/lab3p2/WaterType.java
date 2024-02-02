/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2;

public class WaterType extends Pokemon {

    private boolean vivirFueraAgua;
    private int rapidezNadar;

    public WaterType() {
    }

    public WaterType(boolean vivirFueraAgua, int rapidezNadar, String nombrePokemon, int numeroEntrada, String naturaleza) {
        super(nombrePokemon, numeroEntrada, naturaleza);
        this.vivirFueraAgua = vivirFueraAgua;
        this.rapidezNadar = rapidezNadar;
    }

    public boolean isVivirFueraAgua() {
        return vivirFueraAgua;
    }

    public void setVivirFueraAgua(boolean vivirFueraAgua) {
        this.vivirFueraAgua = vivirFueraAgua;
    }

    public int getRapidezNadar() {
        return rapidezNadar;
    }

    public void setRapidezNadar(int rapidezNadar) {
        this.rapidezNadar = rapidezNadar;
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
        return super.toString() + "\nVive fuera del agua=" + vivirFueraAgua + "\n"
                + "Rapidez al nadar = " + rapidezNadar;
    }

}
