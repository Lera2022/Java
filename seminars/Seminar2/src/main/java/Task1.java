import java.util.Scanner;
public class Task1
{
    public static void main(String[] args) {
        Equation();
    }
    public static int GetNumber()
    {
        Scanner numberS = new Scanner(System.in);
        int number;
        while(true)
        {
            try {
                System.out.print("Введите число");
                number = numberS.nextInt();
                break;
            } catch(Exception e) {
                System.out.print("Ошибка ввода");
            }
        }
        return number;
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
        String equation = GetString();
        equation = String.format(equation).replace(" ","");
        System.out.print(equation);
        String[] st1 = equation.split("\\+"); // "2?    ?5 = 69";
        String[] st2 = st1[1].split("="); // "2?    ?5   69";
        String[] st3 = new String[3];
        st3[0] = st1[0];
        st3[1] = st2[0];
        st3[2] = st2[1];
        for (int i = 0; i < 3 ;i++ )
        {
            st3[i] = String.format(st3[i]).replace("?","");
        }
        int number = GetNumber();
        int num = Integer.parseInt(st3[0]) * number + number * Integer.parseInt(st3[1]);
        if(num != Integer.parseInt(st3[2])){
            System.out.print("Число не подходит");
        }else{
            System.out.print("Все хорошо");
        }
    }
}
