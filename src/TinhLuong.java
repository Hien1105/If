import java.util.Scanner;

public class TinhLuong {
    public static void main(String[] args) {
        float heSoLuong;
        float soNamLamViec;
        double tienLuong;

        Scanner scanner = new Scanner(System.in);

        System.out.print("He so luong = ");
        heSoLuong = scanner.nextFloat();

        System.out.print("So nam lam viec = ");
        soNamLamViec = scanner.nextFloat();

        if (heSoLuong > 5.0f || heSoLuong < 1.0f){
            System.out.println("He so luong khong hop le. Moi nhap lai");
            System.out.print("He so luong = ");
            heSoLuong = scanner.nextFloat();
            TinhTienLuong(heSoLuong,soNamLamViec);
        }
    }
    public static void TinhTienLuong(float heSoLuong, float soNamLamViec){
        double tienLuong;
        if (heSoLuong <= 5.0f && heSoLuong >= 1.0f){
            tienLuong = heSoLuong*4000000 + soNamLamViec*500000;
            System.out.println("Tien luong = "+tienLuong+"vnd");
        }
    }
}
