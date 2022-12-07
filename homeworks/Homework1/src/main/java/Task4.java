/*
Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... "укажите операцию,
 которую надо выполнить с этими числами"... "ответ: ...")
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        calculator();
    }
    public static void calculator(){
        System.out.println("введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        Double num1 = scanner.nextDouble();

        System.out.println("введите второе число: ");
        Double num2 = scanner.nextDouble();

        System.out.println("укажите операцию, которую надо выполнить с этими числами (+, -, *, /): ");
        Scanner scanner2 = new Scanner(System.in);
        String ch = scanner2.nextLine();

        double res = 0;
        if (ch.equals("+")) {
            res = num1 + num2;
        } else if (ch.equals("-")) {
            res = num1 - num2;
        } else if (ch.equals("*")) {
            res = num1 * num2;
        } else if (ch.equals("/")) {
            res = num1 / num2;
        } else {
            System.out.println("Данная функция в стадии разработки(");
        }

        System.out.println("ответ: " + res);
    }
}
