import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        double a;
        double b;
        double x;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chuong trinh giai phuong trinh bac nhat");
        System.out.println("Phuong trinh bac nhat có dang: a*x + b = 0");
        System.out.println("Nhap vao cac he so:");
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) System.out.println("Phuong trinh co vo so nghiem");
            else System.out.println("Phuong trinh vo nghiem");
        } else {
            x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
}
