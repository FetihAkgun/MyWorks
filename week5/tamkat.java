package week6_homeworks;

import java.util.Scanner;

public class tamkat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sayi;
		System.out.print("Sayı giriniz:");
		sayi = input.nextInt();
		
		for(int i = 1 ; i <=sayi; i++) {
			for(int b = 1; b<=sayi;b++) {
				
				if(sayi == i*3 + b*5) {
					System.out.println("a="+i+" ve b="+b );
				}
				
			}
		}
		
	}

}
