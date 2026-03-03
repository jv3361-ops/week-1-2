import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float celsius;
        float fahrenheitResult;

        System.out.print("Enter temperature in celsius: ");
        celsius = input.nextFloat();

        fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println(
            "The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit"
        );

        input.close();
    }
}