package minggu.pkg3;
import java.util.Scanner;
public class dowhilebreak {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int angka, b;
        System.out.println("====PROGRAM LOOP DENGAN BREAK====");
        b=0;
        do
        {
            System.out.print("Masukkan Bilangan : ");
            angka = input.nextInt();
            b += angka;
            if (b>50) break;
            
        }
        while (true);
        System.out.printf("Angka berhenti pada angka : %d \n",b);
    }
    
}
