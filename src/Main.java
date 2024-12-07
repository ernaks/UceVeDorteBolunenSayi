import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = sc.nextInt();
        int toplam = 0, adet = 0;
        for(int i = 0; i <= number; i++){
            if(i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }
        if(adet > 0){
            double ort = toplam / adet;
            System.out.println("Ortalama: " + ort);
        }
        else
            System.out.println("3'e ve 4'e bölünen sayı yok.");
    }
}