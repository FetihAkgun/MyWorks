package homework;

import java.util.Scanner;

public class ucuncu {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        //Başla 
	        // Yarı çap bilgisini al 
	        // Alanı hesapla 
	        // Hacimi hesapla 
	        // alan ve hacmi ekrana yazdır 
	        // Bitir 
	        int yari, alan, hacim;
	        
	        System.out.println("Yarı Çap Giriniz");
	        yari = input.nextInt();
	        
	        alan = (int) (4 * Math.PI * Math.pow(yari,2));
	        hacim = (int) (( 4/ 3) * Math.PI * Math.pow(yari,3) );
	        
	        System.out.println("---------------------------");
	        System.out.println("Alan : " + alan);
	        System.out.println("Hacim :" + hacim);
	    }
}
