import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight(kg) = ");
        weight = scanner.nextDouble();

        System.out.print("Enter height(m) = ");
        height = scanner.nextDouble();

        bmi = weight / (height*height);

        if (bmi >= 30) System.out.println("BMI = "+bmi+"Interpretation: Obese");
        else if (bmi >= 25) System.out.println("BMI = "+bmi+"Interpretation: Overweight");
        else if (bmi >= 18.5) System.out.println("BMI = "+bmi+"\nInterpretation: Normal");
        else System.out.println("BMI = "+bmi+"Interpretation: Underweight");
    }
}
