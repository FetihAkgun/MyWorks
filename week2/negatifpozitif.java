package homework;

import java.util.Scanner;

public class negatifpozitif {

	public static void main(String[] args) {
		
		// Başla 
		// Sayı bilgisi al
		// sayı 0 dan küçükse negatif yazdır
		// sayi 0'dan büyükse pozitif yazdır
		// sayi 0'a eşitse sıfır yazdır 
		// bitir 
		 Scanner input = new Scanner(System.in);
         System.out.print("Bir Sayı Girin:");
 
        double sayi = input.nextInt();
        
        if (sayi < 0.0)
            System.out.println(sayi + " Negatiftir.");
        else if ( sayi > 0.0)
            System.out.println(sayi + " Pozitiftir.");
 
        else
            System.out.println(sayi + "  Sıfırdır.");

	}

}
