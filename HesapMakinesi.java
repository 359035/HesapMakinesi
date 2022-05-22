/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hesapmakinesi;

/**
 *
 * @author Samsung
 */

import java .util.Scanner;
public class HesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,secim;
        Scanner inp=new Scanner(System.in);
        
        System.out.print("Ýlk Sayýyý Giriniz:");
        a=inp.nextInt();
        
        System.out.print("Ýkinci Sayýyý Giriniz:");
        b=inp.nextInt();
        
        System.out.println("1.Toplama\n2.Çýkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Lütfen Seçiminizi Giriniz:");
        secim=inp.nextInt();
        
        switch(secim){
            case 1 -> System.out.println("Toplam:"+(a+b));
            case 2 -> System.out.println("Çýkarma:"+(a-b));
            case 3 -> System.out.println("Çarpma:"+(a*b));
            case 4 -> {
                if(b==0){
                    System.out.println("Bir sayý sýfýra bölünemez!");
                    
                }
                else{
                    System.out.println("Bölme:"+(a/b));
                }
            }
            default -> System.out.println("Hatalý Seçim");
                
                
                
        }
        
    }
    
}
