/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2;

public class FireType extends Pokemon {

    private int potenciaLlamas;

    public FireType() {
    }

    public FireType(int potenciaLlamas, String nombrePokemon, int numeroEntrada, String naturaleza) {
        super(nombrePokemon, numeroEntrada, naturaleza);
        this.potenciaLlamas = potenciaLlamas;
    }

    public int getPotenciaLlamas() {
        return potenciaLlamas;
    }

    public void setPotenciaLlamas(int potenciaLlamas) {
        this.potenciaLlamas = potenciaLlamas;
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

}
