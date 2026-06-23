import java.util.HashMap;
import java.util.Map;

public class HappyNumber {

    public boolean isHappy(int n) {

        Map<Integer, Boolean> visited = new HashMap<>();

        while (n != 1) {

            if (visited.containsKey(n)) {
                return false; // cycle detected
            }

            visited.put(n, true);

            n = getSquareSum(n);
        }

        return true;
    }

    private int getSquareSum(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum += digit * digit;

            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        HappyNumber obj = new HappyNumber();

        System.out.println(obj.isHappy(19)); // true
        System.out.println(obj.isHappy(2));  // false
    }
}