package n1e1;

import java.util.ArrayList;
import java.util.HashSet;

public class App {
	public static void main(String[] args) {
		
		ArrayList<Month> months = new ArrayList<Month>();
		
		months.add(new Month("Enero"));
		months.add(new Month("Febrero"));
		months.add(new Month("Marzo"));
		months.add(new Month("Abril"));
		months.add(new Month("Mayo"));
		months.add(new Month("Junio"));
		months.add(new Month("Julio"));
		months.add(new Month("Septiembre"));
		months.add(new Month("Octubre"));
		months.add(new Month("Noviembre"));
		months.add(new Month("Diciembre"));
		
		for(int i = 0; i < months.size(); i++) {
			System.out.println(months.get(i).getName());
		} //mostrara todos los meses excepto agosto
		
		months.add(7, new Month("Agosto"));
		
		for(int i = 0; i < months.size(); i++) {
			System.out.println(months.get(i).getName());
		} //mostrara todos los meses en orden, agosto incluido
		
		HashSet<Month> hashMonths = new HashSet<Month>(months);
		hashMonths.add(new Month("Agosto"));
		
		for(Month i : hashMonths) {
			System.out.println(i.getName());
		} //a pesar de haber 2 meses "Agosto", solo sale 1 ya que el Hash no permite duplicados, pero no los muestra en orden 


	}
}
