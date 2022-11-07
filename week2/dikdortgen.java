package homework;

import java.util.Scanner;

public class dikdortgen {

	public static void main(String[] args) {
		
			// Başla 
			// Kısa kenar bilgisini al 
			// uzun kenar bilgisini al 
			// alanı hesapla 
			// ekrana alanı yazdır 
			// bitir 
		 Scanner input = new Scanner(System.in);
	        
	        int uzun, kisa, alan;
	        
	        System.out.println("Kısa kenar gir  ");
	        kisa = input.nextInt();
	        System.out.println("Uzun kenar  gir  ");
	        uzun = input.nextInt();
	        
	        alan = uzun * kisa ;
	        
	        System.out.println("------------------------------------------------");
	        System.out.println("Alan : " + alan);

	}

}
