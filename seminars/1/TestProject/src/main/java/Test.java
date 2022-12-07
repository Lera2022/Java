/*
В консоли запросить имя пользователя. В зависимости от текущего времени вывести приветствие вида
"Доброе утро, <имя>!", если время от 05:00 до 11:59;
"Добрый день, <имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <имя>!", если время от 23:00 до 4:59;
 */

/*
Дан массив двоичных чисел, напирмер [1,1,0,1,1,1],
вывести максимальное количество подряд идущих 1.
 */

/*
Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */

/*
Реализовать функцию возведения числа a в степень b (a, b из Z),
сводя количество выполняемых действий к минимуму.
Пример 1: a = 3, b = 2, ответ: 9
Пример 2: a = 3, b = -2, ответ 0.25
Пример 3: a = 3, b = 0, ответ: 1
 */

/*
Дан массив nums = [3, 2, 5, 3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенеси эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов должны быть отличны от заданного,
а остальные - равны ему.
5, 2, 3, 3
 */

import javax.print.DocFlavor;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        int[] array = new int[]{1,1,0,1,1,1};
        int count = ex2(array);
        System.out.println(count);
        String s = "Добро пожаловать на курс по Java";
        System.out.println(ex3(s));
        System.out.println(ex4(5, 0));         */

        int[] arr = new int[]{3, 2, 5, 3};
        int val = 3;
        int[] res = ex5(arr, val);
        System.out.println(Arrays.toString(res));
    }

    public static void ex1(){
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        String res = "";
        if (hour >= 5 && hour < 12) {
            res += "Доброе утро, ";
        } else if (hour >= 12 && hour < 18) {
            res += "Добрый день, ";
        } else if (hour >= 18 && hour < 23) {
            res += "Добрый вечер, ";
        } else {
            res += "Доброй ночи, ";
        }

        System.out.println(res + name + "!");
    }
    public static int ex2(int[] arr){
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
            } else {
                if (maxCount < count){
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (maxCount < count){
            maxCount = count;
        }
        return maxCount;
    }
    public static String ex3(String s){
        String[] arr = s.split(" ");
        String res = "";
        for (int i = arr.length-1; i >= 0; i--) {
            res += arr[i] + " ";
        }
        return res;
    }
    public static double ex4(int a, int b){
        if (b == 0) {
            return 1;
        }
        if (a == 0 || a == 1) {
            return a;
        }
        double a1 = a;
        if (b < 0){
            b = -b;
            a1 = 1 / a1;
        }
        double res = 1;
        for (int i = 0; i < b; i++) {
            res *= a1;
        }
        return res;
    }
    public static int[] ex5(int[] arr, int val) {
        int[] res = new int[arr.length];
        Arrays.fill(res, val);
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != val){
                res[j++] = arr[i];
            }
        }
        return res;
    }
}
