package week4_homeworks;

import java.util.*;
import java.lang.*;


public class fonksiyon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double x, sonuc;
		
		System.out.print("x^2 - 5x+3 Fonksiyonu için x girin:");
		x = input.nextDouble();
		
		sonuc = ((Math.pow(x, 2))- (5*x)) +3;
		
		if(sonuc < 0 ) {
			System.out.println("Sonuç negatif : " + sonuc );
		}else if(sonuc > 0 ) {
			System.out.println("Sonuç pozitif : " + sonuc );
		}else {
			System.out.println("Sonuç sıfıra eşit : " + sonuc );
		}
		
		
	}

}
