package queue;

import java.util.Queue;
import java.util.LinkedList;

public class FirstNonRepeatingCharacterInStream {
	public String firstNonRepeating(String s) {
		Queue<Character> q = new LinkedList<>();
		int[] freq = new int[26];

		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {

			freq[c - 'a']++;
			q.offer(c);

			while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
				q.poll();
			}

			if (q.isEmpty())
				sb.append('#');
			else
				sb.append(q.peek());
		}

		return sb.toString();
	}
}