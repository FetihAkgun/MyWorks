package homework;

import java.util.Scanner;

public class dorduncu {
public static void main(String[] args) {
        
        // Başla 
        // Kütle, Hız ve Yükseklik Bilgilerini Al
        // Potansiyel Enerjiyi Hesapla (Kütle * Yer çekimi ivmesi * yükseklik)
        // Kinetik Enerjiyi Hesapla ( kütle /2 * hiz^2 )
        // Kinetik Enerji Ve Potansiyel Enerjiyi Ekrana yazdır 
        // Bitir
       Scanner input = new Scanner(System.in);
       
       int kütle, hiz, yükseklik; 
       double pe, ke;
       
       System.out.println("Kütle Girin");
       kütle = input.nextInt();
       
       System.out.println("Hız Girin");
       hiz = input.nextInt();
       
       System.out.println("Yükseklik girin");
       yükseklik = input.nextInt();
       
       pe = kütle * 9.80665 * yükseklik;
       ke = (kütle /2 ) * Math.pow(hiz,2);
       
       System.out.println("-------------------");
       System.out.println("Potansiyel Enerji : " + pe);
       System.out.println("Kinetik Enerji : " + ke);
       
       
    }
}
