package minggu.pkg3;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
    
        Scanner input= new Scanner(System.in);
        
        int angka, fac, i;
        System.out.println("====PROGRAM MENGHITUNG FAKTORIAL DENGAN WHILE====");
        System.out.print("masukkan bilangan : ");
        
        angka = input.nextInt();
        fac =1;
        i = 1;
        while (i<=angka)
        {
       fac = fac*i;
       i++;
    }
        System.out.printf("nilai bilangan faktorial bilangan tersebut adalah : %d \n", fac);
}
}