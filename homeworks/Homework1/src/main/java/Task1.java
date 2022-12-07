/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n)
 */

public class Task1 {
    public static void main(String[] args) {
        int num = 7;
        int res = triangularNumber(num);
        System.out.println(res);
    }
    public static int triangularNumber(int n){
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }

        return res;
    }
}
