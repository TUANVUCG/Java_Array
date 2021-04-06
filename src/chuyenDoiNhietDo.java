import java.util.Scanner;

public class chuyenDoiNhietDo {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("---------------");
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit");
                    double f = sc.nextDouble();
                    System.out.println("Celsius is: " + (5.0 / 9) * (f - 32));
                    break;
                case 2:
                    System.out.println("Enter Celsius");
                    double c = sc.nextDouble();
                    System.out.println("Fahrenheit is : " + (c / (5.0 / 9) + 32));
                    break;
            }
        } while (choice !=0);
    }
}
