package week4_homeworks;

import java.util.Scanner;

public class terstensayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı gir");
		int sayi = input.nextInt();


		System.out.println("---------------------");
		System.out.print("Sayının tersi: ");

		while(sayi > 0) {
			System.out.print (sayi % 10);
			sayi = sayi/10;
		}




	}

}
