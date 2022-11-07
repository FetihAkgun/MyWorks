package homework_2;

import java.util.Scanner;

public class carpma {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

		int sayi, sayi2, toplam ;

		System.out.println("Sayı giriniz ");
		sayi = input.nextInt();

		System.out.println("Sayı giriniz  ");
		sayi2 = input.nextInt();
		toplam = 0;
		for(int i=0; i < sayi; i++) {
			toplam = toplam + sayi2;
		}
		System.out.println(toplam);
	}

}
