/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pokemon> po = new ArrayList();

        int opc = 0;
        while (opc != 7) {
            System.out.println("---MENU PRINCIPAL---");
            System.out.println("1. CREAR POKEMON");
            System.out.println("2. CREAR POKEBOLA");
            System.out.println("3. LISTAR POKEMON");
            System.out.println("4. ELIMINAR POKEMON");
            System.out.println("5. CAPTURAR POKEMON");
            System.out.println("6. MODIFICAR POKEMON");
            System.out.println("7. SALIR DEL PROGRAMA");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Ingrese nombre del pokemon: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese un numero de entrada en la pokedex: ");
                    int numeroPokedex = sc.nextInt();

                    System.out.println("Ingrese la naturaleza (Timido, Energetico, Misterioso): ");
                    sc.nextLine();
                    String naturaleza= sc.nextLine();
                    
                    
                    
                    if (naturaleza.equalsIgnoreCase("timido")) {
                        
                        
                    }
                    
                    Pokemon nuevoPokemon = new Pokemon(nombre, numeroPokedex, naturaleza);
                    po.add(nuevoPokemon);
                    
                    break;
                default:
                    System.out.println("Esa opcion no esta disponible.");
            }

        }

    }

}
