public class BinaryNumbersFrom1toN{
public void generateBinary(int n) {
    Queue<String> q = new LinkedList<>();

    q.offer("1");

    for (int i = 0; i < n; i++) {
        String cur = q.poll();

        System.out.println(cur);

        q.offer(cur + "0");
        q.offer(cur + "1");
    }
}
}