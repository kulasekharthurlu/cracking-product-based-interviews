package stack;

public class RemoveOuterParentheses {

	public String removeOuterParentheses(String s) {

		StringBuilder result = new StringBuilder();
		int depth = 0;

		for (char ch : s.toCharArray()) {

			if (ch == '(') {

				if (depth > 0) {
					result.append(ch);
				}

				depth++;

			} else {

				depth--;

				if (depth > 0) {
					result.append(ch);
				}
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {

		RemoveOuterParentheses solution = new RemoveOuterParentheses();

		String input = "(()())(())";
		String output = solution.removeOuterParentheses(input);

		System.out.println("Input  : " + input);
		System.out.println("Output : " + output);
	}
}