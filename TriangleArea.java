import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float base, height;
        float areaSqCm, areaSqIn;

        System.out.print("Enter base in cm: ");
        base = input.nextFloat();

        System.out.print("Enter height in cm: ");
        height = input.nextFloat();

        // Area in square centimeters
        areaSqCm = 0.5f * base * height;

        // Convert cm to inches (1 in = 2.54 cm)
        areaSqIn = areaSqCm / (2.54f * 2.54f);

        System.out.println(
            "The Area of the triangle in sq in is " + areaSqIn +
            " and sq cm is " + areaSqCm
        );

        input.close();
    }
}