public class asal_sayi {
    public static void main(String[] args) {
       int i,j;
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
 