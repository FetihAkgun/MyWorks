package homework_2;

import java.util.Scanner;

public class teksayitoplam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sayi, toplam=0 ;

		System.out.println("Sayı gir  ");
		sayi = input.nextInt();


		for(int i=0; i < sayi; i++) {
			if(i %2 != 0 ) {
				toplam = toplam + i;
			}

		}
		System.out.println(toplam);


	}

}
