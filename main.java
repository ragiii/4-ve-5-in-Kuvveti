import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    
        int n;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Limit sayiyi giriniz : ");
        n = inp.nextInt();

        System.out.println("4'ün katları : ");
        for (int i = 1; i <= n; i *= 4){
            System.out.println(i);
        }
        System.out.println("5'in katları : ");
        for (int j = 1; j <= n; j *= 5){
            System.out.println(j);
        }
    }
}
