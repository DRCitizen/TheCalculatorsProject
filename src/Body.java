import java.util.Scanner;
import java.util.TreeMap;
public class Body {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your details to calculate your Body Mass Index.");
        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in metres:");
        double height = scanner.nextDouble();
        scanner.close();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);

        TreeMap<Double, String> map = new TreeMap<>();
        map.put(40.0, "Serious obesity");
        map.put(30.0, "Obesity");
        map.put(25.0, "Overweight");
        map.put(18.0, "Standard");
        map.put(0.0, "Underweight");

        System.out.println(map.floorEntry(bmi).getValue());
        // Please use comma when inserting your measures.
        // Example w - 70,00 h - 1,80
        // Otherwise the program will not work correctly.


    }
}
