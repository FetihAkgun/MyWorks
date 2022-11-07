package week4_homeworks;

import java.util.Scanner;

public class kombinasyon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,r;
		
		System.out.print("Eleman sayısı giriniz: ");
		n = input.nextInt();
		System.out.println("");
		System.out.print("r sayısı giriniz: ");
		r = input.nextInt();
		
		int nfak = 1, rfak = 1 , rnfak=1;
		
		for(int i = 1 ; i <=n; i++ ) {
			nfak = nfak * i;
		}
		
		for(int i = 1 ; i <=r; i++ ) {
			rfak = rfak * i;
		}
		
		for(int i = 1 ; i <= (n-r); i++ ) {
			rnfak = rnfak * i;
		}
		
		int k = nfak/(rfak * rnfak);
		System.out.println("");
		System.out.println("Kombinasyon sayısı : " + k);
		
	}

}
