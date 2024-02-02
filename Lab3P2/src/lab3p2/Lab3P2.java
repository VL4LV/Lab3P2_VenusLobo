/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pokemon> po = new ArrayList();

        int opc = 0;
        while (opc != 7) {
            System.out.println();
            System.out.println("---MENU PRINCIPAL---");
            System.out.println("1. CREAR POKEMON");
            System.out.println("2. CREAR POKEBOLA");
            System.out.println("3. LISTAR POKEMON");
            System.out.println("4. ELIMINAR POKEMON");
            System.out.println("5. CAPTURAR POKEMON");
            System.out.println("6. MODIFICAR POKEMON");
            System.out.println("7. SALIR DEL PROGRAMA");
            System.out.print("Que vamos hacer: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println();
                    System.out.print("Ingrese nombre del pokemon: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese un numero de entrada en la pokedex: ");
                    int numeroPokedex = sc.nextInt();

                    System.out.print("Ingrese la naturaleza (Timido, Energetico, Misterioso): ");
                    sc.nextLine();
                    String naturaleza = sc.nextLine();

                    System.out.print("Ingrese el tipo de pokemon (Fire, Water, Grass): ");
                    String type = sc.nextLine();

                    Pokemon nuevoPokemon;

                    if (type.equalsIgnoreCase("fire")) {
                        int potencia;

                        do {
                            System.out.print("Ingrese la potencia de sus llamas: ");
                            potencia = sc.nextInt();

                            if (potencia < 0) {
                                System.out.println("La potencia no puede ser negativa.");
                            }

                        } while (potencia < 0);

                        // Crear un FireType especifico
                        FireType firePokemon = new FireType();
                        firePokemon.setNombrePokemon(nombre);
                        firePokemon.setNumeroEntrada(numeroPokedex);
                        firePokemon.setNaturaleza(naturaleza);
                        firePokemon.setPotenciaLlamas(potencia);

                        po.add(firePokemon);

                    } else if (type.equalsIgnoreCase("water")) {
                        int vive;
                        do {
                            System.out.print("Puede vivir fuera del agua (1.Si/2.No): ");
                            vive = sc.nextInt();
                            sc.nextLine(); // Consumir nueva línea

                            if (vive < 1 || vive > 2) {
                                System.out.println("Ingrese 1 para 'Si' o 2 para 'No'.");
                            }
                        } while (vive < 1 || vive > 2);

                        boolean puedeVivirFueraAgua = (vive == 1);

                        int rapidez;
                        do {
                            System.out.print("Ingrese rapidez al nadar: ");
                            rapidez = sc.nextInt();

                            if (rapidez < 0) {
                                System.out.println("La rapidez no puede ser negativa.");
                            }

                        } while (rapidez < 0);

                        // Crear un WaterType especifico
                        WaterType waterPokemon = new WaterType();
                        waterPokemon.setNombrePokemon(nombre);
                        waterPokemon.setNumeroEntrada(numeroPokedex);
                        waterPokemon.setNaturaleza(naturaleza);
                        waterPokemon.setVivirFueraAgua(puedeVivirFueraAgua);
                        waterPokemon.setRapidezNadar(rapidez);

                        po.add(waterPokemon);

                    } else if (type.equalsIgnoreCase("grass")) {
                        System.out.println("Ingrese el habitat: ");
                        String habitat = sc.nextLine();

                        int dominio;
                        do {
                            System.out.print("Ingrese el dominio sobre las plantas (1-100): ");
                            dominio = sc.nextInt();

                            if (dominio < 1 || dominio > 100) {
                                System.out.println("El dominio debe estar en el rango de 1 a 100.");
                            } else if (dominio < 0) {
                                System.out.println("El dominio no puede ser un numero negativo.");
                            }

                        } while (dominio < 0 || dominio < 1 || dominio > 100);



                            // Crear un GrassType especifico
                        GrassType grassPokemon = new GrassType();
                        grassPokemon.setNombrePokemon(nombre);
                        grassPokemon.setNumeroEntrada(numeroPokedex);
                        grassPokemon.setNaturaleza(naturaleza);
                        grassPokemon.setHabitad(habitat);
                        grassPokemon.setDominioPlantas(dominio);

                        po.add(grassPokemon);
                    }

                    System.out.println("Pokemon creado.");

                    break; //FIN DEL CASE 1

                case 2:
                    System.out.print("Ingrese color de la Pokeball: ");
                    String color = sc.nextLine();
                    
                    
                    System.out.print("Ingrese el numero de serie: ");
                    int numeroSerie = sc.nextInt(); 
                    
                    int eficienciaAtrapado = new Random().nextInt(3) + 1;
                    System.out.print("Eficiencia de atrapado: "+eficienciaAtrapado);
                    
                    Pokeball ball = new Pokeball(color, numeroSerie,eficienciaAtrapado);
                    break;

                case 3:
                    System.out.println("POKEMONS");
                    if (po.isEmpty()) {
                        System.out.println("No hay pokemons.");
                    } else {
                        for (Pokemon p : po) {
                            System.out.println(p.toString());
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;
                default:
                    System.out.println("Esa opcion no esta disponible.");
            }

        }

    }

}
