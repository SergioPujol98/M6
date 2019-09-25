package UF1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Pt1_SergioPujol {
	public static void main(String[] args) {
		float precio_juego;
		String nombre_juego;
		int eleccion;
		Map<String, Float> juegos = new HashMap<String, Float>();

		boolean falso = false;
		while (!falso) {
			System.out.println();
			System.out.println("Selecciona la accion que quieras hacer: ");
			System.out.println("1. Insertar");
			System.out.println("2. Modificar");
			System.out.println("3. Borrar Videojuego");
			System.out.println("4. Mostrar Productos");
			System.out.println("5. Salir del programa\n");
			Scanner n1 = new Scanner(System.in);
			eleccion = n1.nextInt();

			switch (eleccion) {
			case 1:
				System.out.println("Introduce el nombre del juego: ");
				nombre_juego = n1.next();
				if (juegos.containsKey(nombre_juego.toLowerCase())) {
					System.out.println("El juego introducido ya existe");
					n1.nextLine();
					break;
				}
				System.out.println("Introduce el precio del juego");
				precio_juego = n1.nextFloat();
				juegos.put(nombre_juego.toLowerCase(), precio_juego);
				System.out.println("El juego ha sido introducido correctamente");
				break;
			case 2:
				System.out.println("Introduce el nombre del juego que quieras modificar: ");
				nombre_juego = n1.next();
				if (juegos.containsKey(nombre_juego.toLowerCase())) {
					System.out.println("Introduce el nuevo precio del juego ");
					precio_juego = n1.nextFloat();
					juegos.remove(nombre_juego);
					juegos.put(nombre_juego, precio_juego);
					System.out.println("El juego ha sido modificado correctamente");
				} else {
					System.out.println("El juego introducido no existe");
					n1.nextLine();
					break;
				}
				break;
			case 3:
				String comprobacion;
				System.out.println("Introduce el  juego que quieres borrar");
				nombre_juego = n1.next();
				if (juegos.containsKey(nombre_juego.toLowerCase())) {
					System.out.println("Esta seguro de que quiere borrar el juego? Y/N");
					n1.hasNextLine();
					comprobacion = n1.next();
					if (comprobacion.equalsIgnoreCase("y")) {
						juegos.remove(nombre_juego);
						System.out.println("Juego borrado correctamente");
					} else {
						System.out.println("Se ha cancelado la eliminacion del juego");
						break;
					}
				} else {
					System.out.println("El juego introducido no existe, vuelva a introducirlo");
					n1.nextLine();
					break;
				}
				break;
			case 4:
				Map<String, Float> Ordenado = new TreeMap<String, Float>(juegos);
				Set set = Ordenado.entrySet();
				Iterator it = set.iterator();
				 while(it.hasNext()) {
				      Map.Entry me = (Map.Entry)it.next();
				      System.out.println("Juego: "+me.getKey() + ", precio:  " + me.getValue()+"€");
				      
				    } 
				
				/* No funcionan
				Set ref = Ordenado.keySet();
				for(Map.Entry<String,Float> entry : Ordenado.entrySet()) { 
					String nombre_juegos = entry.getKey(); 
					Float precio_juegos = entry.getValue(); 
					System.out.println(nombre_juegos + ": " + precio_juegos);
				}
				*/
				/*
				Iterator it = ref.iterator();
				while (it.hasNext()) {
					System.out.println((String)it.next());
				}
				*/
				break;
			case 5:
				System.out.println("Has salido del programa correctamente");
				falso = true;
				System.exit(0);
				
				
			default:
				System.out.println("Fuera de rango");
			}
			n1.close();
		}
		
	}

}
