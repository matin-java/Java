import java.util.*;

public class Steuer {

   public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);
         System.out.println("Bitte geben Sie einen Betrag");
         
        double betrag = sc.nextDouble();
        
        
        double Summe = betrag* 1.19;
        
        System.out.println(Summe);
   
     }
  }
