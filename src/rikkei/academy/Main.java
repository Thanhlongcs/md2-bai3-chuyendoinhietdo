package rikkei.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Fahrenheit to Celsius: ");
            System.out.println("2. Celsius to Fahrenheit: ");
            System.out.println("0. Exit ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    System.out.println(fahrenheit + " Fahrenheit To Celsius = " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.println(celsius + " Celsius To Fahrenheit = " + fahrenheitToCelsius(celsius));
                    break;
                case 0:
                    // System.exit() la mot void method (phuong thuc khong co gia tri tra ve) nhan 1 tham so status code kieu int de thuc thi.
                    // Status code co the la bat cu so int nao, nhung thong thuong status code se la 0
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        } while (choice != 0);
    }

    //Viết phương thức chuyển đổi nhiệt độ từ C sang F
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9 / 5.0) * celsius + 32;
        return fahrenheit;
    }
    //Viết phương thức chuyển đổi nhiệt độ từ F sang C
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}