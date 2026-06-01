import java.util.Stack;

public class PostfixEvaluation {

    public static int evaluate(String exp) {

        Stack<Integer> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if (Character.isDigit(ch)) {

                stack.push(ch - '0');

            } else {

                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (ch) {

                    case '+':
                        stack.push(val1 + val2);
                        break;

                    case '-':
                        stack.push(val1 - val2);
                        break;

                    case '*':
                        stack.push(val1 * val2);
                        break;

                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }

        return stack.pop();
    }
}