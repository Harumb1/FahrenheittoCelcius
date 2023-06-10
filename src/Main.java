import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Fahrenheit (cringe) to Celsius (based) converter!");
        System.out.println("Choose an option:" +
                "\n 1. Fahrenheit to Celsius." +
                "\n 2. Celsius to Fahrenheit.");

        Scanner sc = new Scanner(System.in);
        int option = Integer.valueOf(sc.nextLine());

        System.out.println("Set an amount:");
        double amount = Double.valueOf(sc.nextLine());

        switch (option) {
            case 1:
                System.out.println("Temperature in Fahrenheit is:");
            Converter.FToC(amount);
                break;

            case 2:
                System.out.println("Temperature in Celsius is:");
                Converter.CToF(amount);
                break;
        }
    }

    public class Converter {
        public static void FToC(double amount) {
            System.out.println(((amount - 32)*5)/9);
        }

        public static void CToF(double amount) {
            System.out.println(amount * 1.8 + 32);
        }

    }
}