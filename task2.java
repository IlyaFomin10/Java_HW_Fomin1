//Вывести все простые числа от 1 до 1000 

public class task2 {

    public static void main(String[] args) {
        for (int index = 1; index < 1000; index++) {
            if (checkSimpleNumber(index) == true) {
                System.out.println(index);
            }
        }
    }

    public static Boolean checkSimpleNumber(int num) { 

        for (int index = 2; index <= Math.sqrt(num); index++) { // цикл for до корня числа
            if ((num == 1) || (num % index == 0)) { // ищем делители числа, проверяя остаток от деления на index
                return false;
            }
        }
        return true;
    }

}