package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream {

	private Queue<Integer> queue;
	private int size;
	private double sum;

	public MovingAverageFromDataStream(int size) {
		this.size = size;
		queue = new LinkedList<>();
		sum = 0;
	}

	public double next(int val) {

		queue.offer(val);
		sum += val;

		if (queue.size() > size) {
			sum -= queue.poll();
		}

		return sum / queue.size();
	}
}