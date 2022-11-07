package homework;

import java.util.Scanner;

public class birinci {
	
    public static void main(String[] args) {
    	 // Başla 
        // Kullanıcıdan uzunluk ve yükseklik bilgisini al 
        // Alanı hesapla ((Uzunluk * Yükseklik)/ 2 )
        // Alanı ekrana yazdır 
        // Bitiş
       Scanner input = new Scanner(System.in);
       
       int lenght, hight;
       
       System.out.println("Kenar uzunluğu giriniz:");
       lenght = input.nextInt();
       
       System.out.println("yüksekliği giriniz:");
       hight = input.nextInt();
       
       double alan = (lenght * hight)/2;
       
       System.out.println("Üçgenin Alanı :" + alan);
    }
}
