package n1e2;

import java.util.ArrayList;
import java.util.ListIterator;


public class App {
	public static void main(String[] args) {
	
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		System.out.println("Lista 1");
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = (list1.size()-1); i >= 0; i--) {
			list2.add(list1.get(i));
		}
		System.out.println("Lista 2");
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		ListIterator<Integer> list1Iterator = list1.listIterator();

		while(list1Iterator.hasNext()) {
			list2.add(list1Iterator.next());
		} //aqui afegeix els numeros de la llista 1 a la 2
		
		ListIterator<Integer> list2Iterator = list2.listIterator();
		
		System.out.println("Lista final");
		while(list2Iterator.hasNext()) {
			System.out.println(list2Iterator.next());
		} //i aqui imprimeix els de la llista 2 per comprobar que siguin correctes
	}
}
