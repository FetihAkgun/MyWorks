package homework;

import java.util.Scanner;

public class ikinci {
	 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	// Başla
    	// kullanıcıdan açı bilgisini al 
    	// Radyanı hesapla (  (açı * pi )/ 180 )
    	// gradyanı hesapla ( (Açı * 200)/180 )
    	// gradyanı ve radyanı ekrana yazdır
    	// bitir
       Scanner input = new Scanner(System.in);
       double pi = 3.14 ; 
       int degree, radyan, gradyan;
       
        System.out.println("Açı  giriniz:");
        degree = input.nextInt();
        
        radyan = (int) ((degree * pi )/ 180);
        gradyan = (degree * 200)/180;
        
        System.out.println("--------------------------");
        System.out.println("Radyan : " + radyan );
        System.out.println("Gradyan : " + gradyan );
       
    }
}
