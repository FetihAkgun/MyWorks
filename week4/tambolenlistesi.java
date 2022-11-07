package week4_homeworks;

import java.util.Scanner;

public class tambolenlistesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi;
		
		System.out.print("Tam bölen listesini görmek istediğiniz sayıyı giriniz: ");
		sayi = input.nextInt();
		System.out.println("");
		System.out.println(sayi +" Sayısının tam bölenleri listesi");
		System.out.println("------------------------------------");
		
		for(int i = 1 ; i <= sayi ; i++) {
			if(sayi % i == 0) {
				System.out.println(sayi + " Sayısı "+i + " Sayısına tam bölünüyor." );
			}
		}
		System.out.println("------------------------------------");
		
	}

}
