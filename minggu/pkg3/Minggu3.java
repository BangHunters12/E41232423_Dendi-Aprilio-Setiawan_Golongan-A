
package minggu.pkg3;
import java.util.Scanner;
public class Minggu3 {

    public static void main(String[] args) {
     
        int angka, fac, i;
        System.out.println("====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR====");
        System.out.print("Masukkan Bilangan : ");
        
        
        Scanner input = new Scanner(System.in);
         angka = input.nextInt();
          fac =1;
          for (i=1; i<=angka;i++)
        {
            fac = fac*i;   
            
        }
        System.out.println("Nilai faktorial bilangan tersebut adalah : %d \n"+ fac);  
    }
}
        
   
    