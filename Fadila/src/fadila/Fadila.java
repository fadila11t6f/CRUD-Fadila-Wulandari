package fadila;
import java.util.Scanner;
public class Fadila {

    public static void main(String[] args) {
    float A, B, C;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Tinggi : ");
        A = keyboard.nextInt();
        
        System.out.print("Berat : ");
        B = keyboard.nextInt();
        
        C = (int) (B/(A/100*A/100));
        System.out.println("--OUTPUT--");
        System.out.println("Hasil : "+ C );
        
        System.out.println("--SARAN--");
        
        if(C==0){
            System.out.println("Anda belum memasukkan data");
        }else if(C<=18){
            System.out.println("Berat badan anda kurang (Underweight)"); 
        }else if(C<=24.9){
            System.out.println("Berat badan anda normal");
        }else if(C<=29.9){
            System.out.println("Berat badan anda berlebih (Overweight)");
       }else {
            System.out.println ("Anda kelebihan berat badan(obesitas)");
        }
 

