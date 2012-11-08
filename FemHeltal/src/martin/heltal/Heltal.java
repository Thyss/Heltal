package martin.heltal;

import java.util.Scanner;

public class Heltal {

	public static void main(String[] args) {
		int heltal[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Skriv in 5 heltal och tryck på enter:");
		heltal[0] = sc.nextInt();
		heltal[1] = sc.nextInt();
		heltal[2] = sc.nextInt();
		heltal[3] = sc.nextInt();
		heltal[4] = sc.nextInt();

		System.out.println("-----------------");
		for (int i = 0; i < heltal.length; i++) {
			System.out.println("Du skrev:");
			System.out.println(heltal[i]);
			if (heltal[i] > 0 && heltal[i] <= 10) {
				System.out.println(heltal[i] + " är mellan 1 och 10");
			}else {
				System.out.println(heltal[i] + " är inte mellan 1 och 10");
			}				
		}
	}
}