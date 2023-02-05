//Реализовать простой калькулятор + - / * 

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число...");
        int a = scanner.nextInt();
        System.out.println("Введите арифметическое действие: (+ - * /)...");
        char op = scanner.next().charAt(0);
        System.out.println("Введите второе число...");
        int b = scanner.nextInt();
        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + add(a, b)); 
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + minus(a, b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + mult(a, b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + divide(a, b));
                break;
            default:
                System.out.println("Введите верно операцию! (+ - * /)");      
        }
        scanner.close();        
    }

    private static int divide(int a, int b) {
        try {
            return  a / b;
        } catch (Exception divideZero) {
            System.out.println("Делить на ноль нельзя, введите другой делитель!");
        }
        return 0;       
    }

    private static int mult(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }
}