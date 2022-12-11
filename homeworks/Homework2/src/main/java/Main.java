//решить задачу семинара с условием a+b+c+d+f+c чтобы было математически верно

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Equation();
    }
    public static String GetString()
    {
        Scanner str = new Scanner(System.in);
        String equation;
        System.out.print("Введите формулу");
        equation = str.nextLine();
        return equation;
    }
    public static void Equation()
    {
        Scanner str = new Scanner(System.in);
        // a + b + c + d + c
        String equation = GetString();
        equation = String.format(equation).replace(" ","");
        String[] st1 = equation.split("\\+");
        int sum = 0;
        for (int i = 0; i < st1.length; i++ )
        {
            sum += str.nextInt();
            }
        System.out.print(sum);
    }
}