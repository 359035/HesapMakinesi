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
        
        System.out.print("�lk Say�y� Giriniz:");
        a=inp.nextInt();
        
        System.out.print("�kinci Say�y� Giriniz:");
        b=inp.nextInt();
        
        System.out.println("1.Toplama\n2.��karma\n3.�arpma\n4.B�lme");
        System.out.print("L�tfen Se�iminizi Giriniz:");
        secim=inp.nextInt();
        
        switch(secim){
            case 1 -> System.out.println("Toplam:"+(a+b));
            case 2 -> System.out.println("��karma:"+(a-b));
            case 3 -> System.out.println("�arpma:"+(a*b));
            case 4 -> {
                if(b=0){
                    System.out.println("Bir say� s�f�ra b�l�nemez!");
                    
                }
                else{
                    System.out.println("B�lme:"+(a/b));
                }
            }
            default -> System.out.println("Hatal� Se�im");
                
                
                
        }
        
    }
    
}
