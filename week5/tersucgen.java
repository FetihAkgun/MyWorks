package week6_homeworks;

import java.util.Scanner;

public class tersucgen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int yukseklik;
		System.out.print("Üçgenin yüksekliğini giriniz:");
		yukseklik = input.nextInt();
		int sayi = yukseklik;
		for(int i = 1; i <= yukseklik; i++) {
			for(int b = 1; b <=sayi; b++) {
				
				System.out.print("*");
			}
			sayi--;
			System.out.println("");
		}

	}

}
