import java.util.Scanner;

public class kombinasyonHesaplama {
    public static void main(String[] args){

        // Kombinasyon hesaplama
        int n, r, ust =1, alt = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("n ' i giriniz : ");
        n = inp.nextInt();
        System.out.print("r ' yi giriniz : ");
        r = inp.nextInt();

        for (int i = 0; i < r; i++){
            ust *=(n - i);
        }
        for (int k =1; k<= r; k++){
            alt *= k;
        }
        System.out.println(n + " 'in " + r + " 'li kombinasyonu : " + (ust / alt));
    }
}
