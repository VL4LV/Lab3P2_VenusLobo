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
        ArrayList<Pokeball> ball = new ArrayList();

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

                    boolean numeroPokedexRepetido;
                    int numeroPokedex;

                    do {
                        System.out.print("Ingrese un numero de entrada en la pokedex: ");
                        numeroPokedex = sc.nextInt();

                        // Ver si el numero ya existe
                        numeroPokedexRepetido = false;
                        for (Pokemon pokemon : po) {
                            if (pokemon.getNumeroEntrada() == numeroPokedex) {
                                System.out.println("Ya existe un Pokemon con ese numero en la Pokedex.");
                                numeroPokedexRepetido = true;
                                break;
                            }
                        }

                    } while (numeroPokedexRepetido);

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
                        System.out.print("Ingrese el habitat: ");
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
                    System.out.println("");
                    System.out.print("Ingrese color de la Pokeball: ");
                    sc.nextLine();
                    String color = sc.nextLine();

                    System.out.print("Ingrese el numero de serie: ");
                    int numeroSerie = sc.nextInt();

                    int eficienciaAtrapado;

                    do {
                        System.out.print("Ingrese la eficiencia de atrapado (1-3): ");
                        eficienciaAtrapado = sc.nextInt();

                        if (eficienciaAtrapado < 1 || eficienciaAtrapado > 3) {
                            System.out.println("Ingrese un valor del 1 a 3.");
                        }

                    } while (eficienciaAtrapado < 1 || eficienciaAtrapado > 3);

                    //Gruardar la pokeball
                    Pokeball nuevaBall = new Pokeball(color, numeroSerie, eficienciaAtrapado);
                    ball.add(nuevaBall);
                    break; //FIN DEL CASE 2

                case 3:
                    System.out.println("");
                    System.out.println("+++POKEMONS+++");

                    // Imprimir todos los pokemons de fuego
                    System.out.println("+++POKEMONS DE FUEGO+++");
                    for (Pokemon pokemon : po) {
                        if (pokemon instanceof FireType) {
                            System.out.println(pokemon.toString());
                            System.out.println("-----------------------------------");
                        }
                    }
                    // Imprimir todos los pokemons de agua
                    System.out.println("+++POKEMONS DE AGUA+++");
                    for (Pokemon pokemon : po) {
                        if (pokemon instanceof WaterType) {
                            System.out.println(pokemon.toString());
                            System.out.println("-----------------------------------");
                        }
                    }
                    // Imprimir todos los pokemons de planta
                    System.out.println("+++POKEMONS DE PLANTA+++");
                    for (Pokemon pokemon : po) {
                        if (pokemon instanceof GrassType) {
                            System.out.println(pokemon.toString());
                            System.out.println("-----------------------------------");
                        }
                    }
                    break; // FIN DEL CASE 3

                case 4:
                    System.out.println("");
                    System.out.print("Ingrese el tipo de Pokemon que desea eliminar (Fire, Water, Grass): ");
                    sc.nextLine();
                    String pokemonEliminar = sc.nextLine().toLowerCase();

                    switch (pokemonEliminar) {
                        case "fire":
                            System.out.println("+++POKEMONS DE FUEGO+++");
                            for (Pokemon pokemon : po) {
                                if (pokemon instanceof FireType) {
                                    System.out.println(pokemon.toString());
                                    System.out.println("-----------------------------------");
                                }
                            }

                            System.out.print("Ingrese el nombre del Pokemon a eliminar: ");
                            String nombreEliminar = sc.nextLine();

                            boolean encontrado = false;

                            for (int i = 0; i < po.size(); i++) {
                                Pokemon pokemon = po.get(i);
                                if (pokemon instanceof FireType && pokemon.getNombrePokemon().equalsIgnoreCase(nombreEliminar)) {
                                    System.out.println("Pokemon eliminado: " + pokemon.getNombrePokemon());
                                    po.remove(i);
                                    encontrado = true;
                                    break;
                                }
                            }

                            if (!encontrado) {
                                System.out.println("No se encontro el pokemon.");
                            }

                            break; //FIN DE LOS FIRE

                        case "water":
                            System.out.println("+++POKEMONS DE AGUA+++");
                            for (Pokemon pokemon : po) {
                                if (pokemon instanceof WaterType) {
                                    System.out.println(pokemon.toString());
                                    System.out.println("-----------------------------------");
                                }
                            }

                            System.out.print("Ingrese el nombre del Pokemon a eliminar: ");
                            String nombreEliminarWater = sc.nextLine();

                            boolean encontra = false;

                            for (int i = 0; i < po.size(); i++) {
                                Pokemon pokemon = po.get(i);
                                if (pokemon instanceof WaterType && pokemon.getNombrePokemon().equalsIgnoreCase(nombreEliminarWater)) {
                                    System.out.println("Pokemon eliminado: " + pokemon.getNombrePokemon());
                                    po.remove(i);
                                    encontra = true;
                                    break;
                                }
                            }

                            if (!encontra) {
                                System.out.println("No se encontro el pokemon.");
                            }
                            break; //FIN DE LOS WATER

                        case "grass":
                            System.out.println("+++POKEMONS DE PLANTA+++");
                            for (Pokemon pokemon : po) {
                                if (pokemon instanceof GrassType) {
                                    System.out.println(pokemon.toString());
                                    System.out.println("-----------------------------------");
                                }
                            }

                            System.out.print("Ingrese el nombre del Pokemon a eliminar: ");
                            String nombreEliminarGrass = sc.nextLine();

                            boolean encont = false;

                            for (int i = 0; i < po.size(); i++) {
                                Pokemon pokemon = po.get(i);
                                if (pokemon instanceof GrassType && pokemon.getNombrePokemon().equalsIgnoreCase(nombreEliminarGrass)) {
                                    System.out.println("Pokemon eliminado: " + pokemon.getNombrePokemon());
                                    po.remove(i);
                                    encont = true;
                                    break;
                                }
                            }

                            if (!encont) {
                                System.out.println("No se encontro el pokemon.");
                            }
                            break; //FIN DE LOS GRASS
                        default:
                            System.out.println("Ese Pokemon no esta.");
                    }

                    break; //FIN DEL CASE 4

                case 5:
                    System.out.println("");
                    System.out.println("+++POKEBOLAS+++");

                    if (ball.isEmpty()) {
                        System.out.println("No hay Pokebolas. Vaya, agregue.");
                    } else {
                        for (int i = 0; i < ball.size(); i++) {
                            System.out.println((i + 1) + ". " + ball.get(i).toString());
                            System.out.println("-----------------------------------");
                        }
                    }

                    int pokeball;
                    do {
                        System.out.print("Ingrese el numero de la Pokeball a usar: ");
                        pokeball = sc.nextInt();

                        // Validar el numero de la pokeball
                        if (pokeball < 1 || pokeball > ball.size()) {
                            System.out.println("Numero de Pokebola no valido.");
                        }
                    } while (pokeball < 1 || pokeball > ball.size());

                    boolean PokemonsNoAtrapados = false;

                    for (Pokemon pokemon : po) {
                        if (!pokemon.isAtrapado()) {
                            PokemonsNoAtrapados = true;
                            System.out.println("EL POKEMON " + pokemon.getNombrePokemon() + " HA APARECIDO");

                            // Preguntar al usuario si quiere capturar el pokemon o huir
                            System.out.print("Quieres capturar al Pokemon? (1. Si / 2. Huir): ");
                            int opcion = sc.nextInt();

                            if (opcion == 1) {
                                // Generar un numero aleatorio del 1 al 3
                                int resultadoCaptura = new Random().nextInt(3) + 1;

                                // Obtener la Pokebola seleccionada
                                Pokeball selectedBall = ball.get(pokeball - 1);

                                // Comparar con la eficiencia de la Pokebola
                                if (resultadoCaptura <= selectedBall.getEficiencia()) {
                                    System.out.println("¡Has atrapado a " + pokemon.getNombrePokemon() + " con exito!");

                                    // Asignar la Pokebola al Pokemon y marcarlo como atrapado
                                    pokemon.setBall(selectedBall);
                                    pokemon.setAtrapado(true);

                                    // Eliminar la Pokebola del ArrayList de Pokebolas
                                    ball.remove(selectedBall);
                                } else {
                                    System.out.println("¡Oh no! El Pokemon escapo.");
                                }
                            } else if (opcion == 2) {
                                System.out.println("Has huido del encuentro. Regresando al menu principal.");
                                break;
                            } else {
                                System.out.println("Opcion no valida. Regresando al menu principal.");
                                break;
                            }
                        }
                    }

                    if (!PokemonsNoAtrapados) {
                        System.out.println("No hay pokemons disponibles para atrapar.");
                    }

                    break; // FIN DEL CASE 5

                case 6:
                    break; //FIN DEL CASE 6
                default:
                    System.out.println("Esa opcion no esta disponible.");
            }

        }

    }

}
