package homework;

import java.util.Scanner;

public class bki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Başla 
        // Boy bilgisi al
        // kilo bilgisi al 
        //  bki hesapla 
        // eğer bki 18.6 dan küçükse ekrana zayıf yazdır 
        // eğer bki 18.6 dan büyük 24.9 dan küçükse ekrana normal yazdır 
        // eğer bki 25 den büyük 29.9 dan küçükse ekrana fazla kilolu yazdır 
        // eğer bki 29.9 dan büyükse ekrana obez yazdır 
        // bitir 
        
        double boy, kilo, bki;
        
        System.out.println("Boyunuzu giriniz (M)");
        boy = input.nextDouble();
        
        
        System.out.println("Kilo giriniz (KG)");
        kilo = input.nextDouble();
        
        bki = kilo / Math.pow(boy,21) ;
        System.out.println("--------------------------------------");
         System.out.println("Beden Kitle İndeksiniz : " + bki );
        if(bki <=18.6){
           System.out.println("Durumunuz : Zayıf " );
        }else if(bki >=18.6 && bki <= 24.9){
           System.out.println("Durumunuz : Normal " );
        }else if(bki >=25 && bki <= 29.9){
           System.out.println("Durumunuz : Fazla kilolu " );
        }else {
           System.out.println("Durumunuz : Obez " ); 
        }
        
    }
}
