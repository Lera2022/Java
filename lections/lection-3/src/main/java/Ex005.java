import java.util.Stack;

import static java.lang.Character.isDigit;

public class Ex005 {
    public static void main(String[] args) {
        var exp = "20 30 - 10 *".split(" ");   // (20-30)*10
//        var exp = "1 2 + 3 *".split(" ");   // (1 + 2) * 3
//        var exp = "1 2 3 * +".split(" ");   // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(Integer.parseInt(exp[i]))) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}
