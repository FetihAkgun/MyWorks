package week4_homeworks;

import java.util.Scanner;

public class tamsayitoplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, tektoplam = 0 , ciftoplam = 0 , tamsayitoplam = 0 ;
		
		System.out.print("Sayı giriniz : ");
		n = input.nextInt();
		
		for(int i = 0 ; i <= n ; i++) {
			if(i % 2 == 0 ) {
				ciftoplam = ciftoplam + i ;
			}else {
				tektoplam = tektoplam + i ; 
			}
			tamsayitoplam = tamsayitoplam + i ;
			
		}
		
		System.out.println("---------------------");
		System.out.println("Çift sayıların toplamı : " +ciftoplam);
		System.out.println("Tek sayıların toplamı : " + tektoplam);
		System.out.println("Tam sayıların toplamı : "+ tamsayitoplam);
	}

}
