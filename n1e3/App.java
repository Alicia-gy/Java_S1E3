import java.util.Scanner;
import java.util.ArrayList;
public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> paraules = new ArrayList<String>();

		System.out.println("Quantes paraules vols?");
		int num = scan.nextInt();
		
		scan.nextLine();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Intrudeix la paraula");
			paraules.add(scan.nextLine());
		}
		
		for (int i = 0; i < paraules.size(); i++) {
			System.out.println(paraules.get(i));
		}
		
	}
}