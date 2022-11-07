package homework_2;

import java.util.Scanner;

public class ucgen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int kenar1, kenar2, kenar3;

		System.out.println("kenar1 gir  ");
		kenar1 = input.nextInt();
		System.out.println("kenar2 gir  ");
		kenar2 = input.nextInt();
		System.out.println("kenar3 gir  ");
		kenar3 = input.nextInt();

		if(kenar1 == kenar2 && kenar2 == kenar3) {
			System.out.println("Eşkenar üçgen");
		}else if((kenar1 == kenar2 || kenar2 == kenar3) || kenar1 == kenar3) {
			System.out.println("İkizkenar üçgen");
		}else {
			System.out.println("Çeşit kenar üçgen");
		}
	}

}
