package homework;

import java.util.Scanner;

public class besinci {
	
	  public static void main(String[] args) {
	        
	        // Başla 
	        // Direnç ve Akım bilgilerini al 
	        // Gerilimi Hesapla (direnç * akım)
	        // Gerilimi Ekrana yazdır 
	        // Bitir 
	        Scanner input = new Scanner(System.in);
	        
	        int direnc, akim, gerilim;
	        
	        System.out.println("Direnç gir  ");
	        direnc = input.nextInt();
	        System.out.println("Akım gir  ");
	        akim = input.nextInt();
	        
	        gerilim = direnc * akim ;
	        
	        System.out.println("------------------------------------------------");
	        System.out.println("Gerilim : " + gerilim);
	        
	    }
}
