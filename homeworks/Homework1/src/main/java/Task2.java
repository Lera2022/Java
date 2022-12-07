/*
Вычислить n! (произведение чисел от 1 до n)
 */

public class Task2 {
    public static void main(String[] args) {
        int num = 7;
        int res = factorial(num);
        System.out.println(res);
    }
    public static int factorial(int n){
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }
}
