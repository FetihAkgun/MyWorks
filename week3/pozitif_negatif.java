package homework_2;

import java.util.Scanner;

public class pozitif_negatif {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sayi ;

		System.out.println("Sayı gir  ");
		sayi = input.nextInt();

		if(sayi < 0) {
			System.out.println("Sayı negatif ");
		}else if(sayi > 0) {
			System.out.println("Sayı pozitif ");
		}else {
			System.out.println("Sayı sıfıra eşit");
		}

	}

}
