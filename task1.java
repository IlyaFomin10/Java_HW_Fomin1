//Вычислить сумму чисел от 1 до n и n! (произведение чисел от 1 до n)


import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //считывает те данные, которые пользователь в него вводит
        System.out.println("Введите n:");
        int n = scanner.nextInt(); //Метод nextInt() считывает и возвращает введенное число
        System.out.printf("Сумма от 1 до n равна %s\n", countFrom1ToN(n));
        System.out.printf("Произведение от 1 до n равно %s", factorial(n));
        scanner.close();
    }

    public static int countFrom1ToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        return sum;
    }    
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
            
        }
        return f;
    }    
}