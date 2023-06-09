import java.util.Scanner;

public class asal_sayi {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Bir sayı giriniz: ");
      int i = scanner.nextInt();
      System.out.println("Bir sayı giriniz: ");
      int j = scanner.nextInt();
       boolean asalMi;
       System.out.println("1-100 arasindaki asal sayilar:");
       for(i=2;i<=100;i++) {
          asalMi=true;
          for(j=2;j<i;j++) {
             if(i%j==0) {
                asalMi=false;
                break;
             }
          }
          if(asalMi) {
             System.out.print(i + " ");
          }
       }
    }
 }
 