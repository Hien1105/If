import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Phuong trinh bac hai co dang: a*x*x + b*x + c = 0");
        System.out.println("Moi nhap vao cac he so a, b, c cua phuong trinh!");
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("c = ");
        c = scanner.nextDouble();

        delta = b*b - 4*a*c;

        if (delta > 0)
        {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem thuc phan biet ");
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
        else if (delta == 0)
        {
            x1 = -b/(2*a);
            System.out.println("Phuong trinh co 1 nghiem thuc");
            System.out.println("x = "+x1);
        }
        else System.out.println("Phuong trinh khong co nghiem thuc");
    }
}
