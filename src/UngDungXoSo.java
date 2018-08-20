import java.util.Random;
import java.util.Scanner;

public class UngDungXoSo {
    public static void main(String[] args) {
        int guessDigit1;
        int guessDigit2;

        int lottery=0;

        Random random = new Random();
        lottery = random.nextInt (100);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi nhap so ma ban du doan!");
        System.out.print("Chu so thu nhat la: ");
        guessDigit1 = scanner.nextInt();
        System.out.print("Chu so thu hai la: ");
        guessDigit2 = scanner.nextInt();
        System.out.println("So ban du doan la: " +guessDigit1 +guessDigit2);

        String lotte = String.valueOf(lottery);
        String guess1 = String.valueOf(guessDigit1);
        String guess2 = String.valueOf(guessDigit2);

        char g1 = lotte.charAt(0);
        char g2 = lotte.charAt(1);

        String gue1 = String.valueOf(g1);
        String gue2 = String.valueOf(g2);

        boolean firstPrize = (guess1.compareTo(gue1))==0 && (guess2.compareTo(gue2)==0);
        boolean secondPrize = (guess1.compareTo(gue2))==0 && (guess2.compareTo(gue1))==0;

        if (firstPrize) {
            System.out.println("Xin chuc mung! Ban da doan trung so trung thuong hom nay. Phan thuong cua ban la $10000");
        }
        else if (secondPrize) {
            System.out.println("Xin chuc mung! Ban da trung giai $3000");
        }
        else if ((guess1.compareTo(gue1)==0 || (guess1.compareTo(gue2))==0 || (guess2.compareTo(gue1))==0 || (guess2.compareTo(gue2))==0)){
            System.out.println("Xin chuc mung! Ban da trung giai $1000");
        }
        else System.out.println("Cam on ban da tham gia chuong trinh. Chuc ban may man lan sau!");

        System.out.println("So trung thuong la: "+lottery);
    }
}
