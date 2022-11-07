package week6_homeworks;

import java.util.Scanner;

public class karetoplami {

	public static void main(String[] args) throws InterruptedException {
	Scanner input = new Scanner(System.in);
		
		System.out.print("Sayı giriniz:");
		int sayi = input.nextInt();
		
		for(int i=0;i <= sayi; i++) {
			for(int b=0; b<=sayi;b++) {
				
				if(sayi == (b*b + i*i)) {
					Thread.sleep(500);
					System.out.println(b+" ve "+i + " sayısının kareleri toplamı girdiğiniz sayıya eşit.");
				}
				
				
			}
		}
		
		

	}

}
