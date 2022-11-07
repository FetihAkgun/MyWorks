package week4_homeworks;

import java.util.Scanner;

public class metredonusturucu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double m, response,option;

		System.out.println("Metre gir");
		m = input.nextDouble();

		System.out.println("---------------");
		System.out.println("İŞLEM MENÜSÜ");
		System.out.println("---------------");
		System.out.println("1 - Milimetreye dönüştür");
		System.out.println("2 - Santimetre dönüştür");
		System.out.println("3 - Desimetreye dönüştür");
		System.out.println("4 - Kilometreye dönüştür");
		option = input.nextDouble();

		if(option == 1) {
			response = m * 1000;
			System.out.println("Sonuç : " + response);
		}else if(option == 2) {
			response = m * 100;
			System.out.println("Sonuç : " + response);
		}else if(option == 3) {
			response = m * 10;
			System.out.println("Sonuç : " + response);
		}else if(option == 4) {
			response = m / 1000;
			System.out.println("Sonuç : " + response);
		}else {
			System.out.println("Geçerli bir işlem seçiniz.");
		}



	}

}
