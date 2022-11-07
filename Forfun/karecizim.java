package forfun;

import java.util.Scanner;

public class karocizim {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		int satir, sutun;
		String metin = "satır sayısı gir:";
		int lenght = metin.length();
		String metin2 = "senin için hemen bir karo hazırlıyorum...";
		int lenght2 = metin2.length();
		for(int i =0; i <lenght; i++) {
			Thread.sleep(50);
			System.out.print(metin.charAt(i));

		}

		satir = input.nextInt();

		for(int i =0; i <lenght2; i++) {
			Thread.sleep(50);
			System.out.print(metin2.charAt(i));

		}
		System.out.println();



		for(int i = 1 ; i <=satir ; i++) {


			for(int j = 1; j <=satir-i; j++ ){
				System.out.print(" ");
			}
			for(int j = 1; j <=(i*2)-1; j++ ){
				Thread.sleep(50);
				System.out.print("*");
			}
			System.out.println();
		}


		int k = (satir*2)-1;
		int bosluk = 0;
		for(int i = 1 ; i <=satir ; i++) {

			for(int j = 1; j <=i-1; j++ ){
				System.out.print(" ");

			}
			for(int j = 1; j <=k; j++ ){
				Thread.sleep(50);
				System.out.print("*");

			}
			k= k - 2;
			System.out.println();
		}
	}

}
