import java.util.Scanner;

public class asal_sayi {
    public static void main(String[] args) {
      checkPrime();
      
    }

    public static void checkPrime(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Bir sayı giriniz: ");
      int i = scanner.nextInt();
      System.out.println("Bir sayı giriniz: ");
      int j = scanner.nextInt();
      
       System.out.println(i + "-" + j + " arasindaki asal sayilar:");
       for(int num = i; num <= j; num++) {
         boolean asalMi = true;
         
         for(int k = 2; k < num; k++) {
             if(num % k == 0) {
                asalMi = false;
                break;
             }
          }
          
          if(asalMi) {
             System.out.print(num + " ");
          }
       }
       scanner.close();
    }
}
