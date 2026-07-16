package recursion;

public class TowerOfHanoi {
	public void hanoi(int n, char src, char aux, char dest) {
		if (n == 1) {
			System.out.println(src + " -> " + dest);
			return;
		}

		hanoi(n - 1, src, dest, aux);
		System.out.println(src + " -> " + dest);
		hanoi(n - 1, aux, src, dest);
	}
}