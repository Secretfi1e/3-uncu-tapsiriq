import java.util.Scanner;

public class Main {
    public static boolean toplamTekMi(String sayi) {
        int toplam = 0;
        for (int i = 0; i < sayi.length(); i++) {
            toplam += Character.getNumericValue(sayi.charAt(i));
        }
        return toplam % 2 == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç boyutta dizi oluşturmak istiyorsunuz? ");
        int boyut = scanner.nextInt();
         scanner.nextLine();

        String[] array = new String[boyut];
        for (int i = 0; i < boyut; i++) {
            boolean gecerli = false;
            while (!gecerli) {
                System.out.print("Lütfen bir sayı girin: ");
                String sayi = scanner.nextLine();
                if (toplamTekMi(sayi)) {
                    array[i] = sayi;
                    gecerli = true;
                } else {
                    System.out.println("Rakamların toplamı tek değil. Tekrar deneyin.");
                }
            }
        }

        System.out.println("Oluşturulan dizi:");
        for (String sayi : array) {
            System.out.print(sayi + " ");
        }
    }
}