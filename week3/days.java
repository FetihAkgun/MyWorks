package homework_2;

import java.util.Scanner;

public class days {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

		int sayi ;

		System.out.println("Sayı gir  ");
		sayi = input.nextInt();

		if(sayi == 1) {
			System.out.println("Pazartesi");
		}else if(sayi == 2){
			System.out.println("Salı");
		}
		else if(sayi == 3){
			System.out.println("Çarşamba");
		}
		else if(sayi == 4){
			System.out.println("Perşembe");

		}else if(sayi == 5){
			System.out.println("Cuma");
		}
		else if(sayi == 6){
			System.out.println("Cumartesi");
		}
		else if(sayi == 7){
			System.out.println("Pazar");
		}else {
			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz.");
		}



}
}
