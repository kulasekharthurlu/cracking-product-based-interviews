public class MovingAverage {

    Queue<Integer> q = new LinkedList<>();
    int size, sum = 0;

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {

        if (q.size() == size)
            sum -= q.poll();

        q.offer(val);
        sum += val;

        return (double) sum / q.size();
    }
}