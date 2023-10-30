package n1e3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		String readPath = "./src/n1e3/countries.txt";
		
		String name = pideString("Introduce tu nombre");
		
		int score = start(newHashMap(readPath));
		
		newFile(name, score);
		
		System.out.println("Tu puntuacion es " + score + ". Test terminado");
		
		
	}
	
	public static HashMap<String, String> newHashMap(String filePath) {
		
		HashMap<String, String> newHash = new HashMap<String, String>();

		try {
			File newFile = new File(filePath);
			BufferedReader br = new BufferedReader(new FileReader(newFile));
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(" ");
				newHash.put(parts[0], parts[1]);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return newHash;
	}
	
	
	public static int start (HashMap<String, String> countries) {
	
		Object[] keys = countries.keySet().toArray();
		int score = 0;
		
		for(int i = 0; i < 10; i++) {
			Object key = keys[new Random().nextInt(keys.length)];
			String city = pideString("Cual es la capital de " + key + " ?");
			
			if(city.equalsIgnoreCase(countries.get(key))) {
				System.out.println("Respuesta correcta");
				score ++;
			} else {
				System.out.println("Respuesta incorrecta, la respuesta era: " + countries.get(key));
			}
		}
		
		return score;
	}
	
	public static void newFile(String name, int score) {
		
		try {
			File file = new File("./src/n1e3/resultado.txt");
			if(file.createNewFile()) {
				System.out.println("Nuevo archivo creado");
			}
			FileWriter fw = new FileWriter(file, true);
			fw.write("Usuario: " + name + " - Puntuacion: " + score + "\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int pideInt(String mensaje) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(mensaje);
		return scan.nextInt();
	}
	public static String pideString(String mensaje) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(mensaje);
		return scan.nextLine();
	}
}
