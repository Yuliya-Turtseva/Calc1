import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double fn = input();
        char operation = getOperation();
        double sn = input();
        double result = calc(fn, sn, operation);
        System.out.println("Результат вычисления:" + result);
        System.out.println("Результат вычисления:" + result);
    }

    public static double input() {   /*ввод чисел*/
        System.out.println("Введите число");
        double op;
        if (scanner.hasNextDouble()) {
            op = scanner.nextDouble();
        } else {
            System.out.println("это не число, введите число:");
            scanner.next();
            op = input();
        }
        return op;
    }

    public static char getOperation() { /* ввод знака (+,-,*,/) */
        System.out.println("Введите операцию");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Можно использовать только +, -, *, /");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double fn, double sn, char operation) { /*вычисление*/
        double result;
        switch (operation) {
            case '+' -> result = fn + sn;
            case '-' -> result = fn - sn;
            case '/' -> result = fn / sn;
            case '*' -> result = fn * sn;
            default -> {
                System.out.println("Операция не выполнена, попробуйте другое действие:");
                scanner.next();
                result = calc(fn, sn, getOperation());
            }
        }
        return result;
    }
}

