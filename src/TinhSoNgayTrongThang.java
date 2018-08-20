import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao thang can kiem tra: ");
        month = scanner.nextInt();

        switch (month){
            case 2:
                System.out.println("Thang "+month+" 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang "+month+" co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang "+month+" co 30 ngay");
        }
    }
}
