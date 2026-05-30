import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temp) {

        int n = temp.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() &&
                    temp[stack.peek()] <= temp[i]) {

                stack.pop();
            }

            result[i] =
                    stack.isEmpty()
                    ? 0
                    : stack.peek() - i;

            stack.push(i);
        }

        return result;
    }
}