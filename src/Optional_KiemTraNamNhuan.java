import java.util.Scanner;

public class Optional_KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long year;

        System.out.print("Enter year: ");
        year = scanner.nextLong();

        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                {
                    if (isDivisibleBy400) {
                        isLeapYear = true;
                    }
                }
            } else isLeapYear = true;
        }

        if (isLeapYear) System.out.println(+year + " la nam nhuan");
        else System.out.println(+year + " khong la nam nhuan");
    }
}


