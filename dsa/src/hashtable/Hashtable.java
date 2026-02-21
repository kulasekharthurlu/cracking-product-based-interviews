package hashtable;


public class Hashtable<K, V> {

	private HashNode<K, V>[] buckets;
	private int numOfBuckets;
	private int size;

	public Hashtable() {
		this(16);
	}

	public Hashtable(int capacity) {
		this.numOfBuckets = capacity;
		this.buckets = new HashNode[capacity];
		this.size = 0;
	}

	static class HashNode<K, V> {
		K key;
		V value;
		HashNode<K, V> next;

		HashNode(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private int getBucketIndex(K key) {
		int hashCode = key.hashCode();
		return Math.abs(hashCode) % numOfBuckets;
	}

	public void put(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = this.buckets[bucketIndex];

		while (head != null) {
			if (head.key == key) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = buckets[bucketIndex];
		HashNode<K, V> newHashNode = new HashNode<>(key, value);
		newHashNode.next = head;
		buckets[bucketIndex] = newHashNode;
	}

	public V get(K key) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = buckets[bucketIndex];

		while (head != null) {
			if (head.key == key) {
				return head.value;
			}
			head = head.next;
		}
		return null;

	}
    public V remove(K key) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = buckets[bucketIndex];
        var temp = head;

		while (temp != null) {
			if (temp.next.key == key) {
                V value = temp.next.value;
                temp.next = temp.next.next;
				return value;
			}
			temp = temp.next;
		}
        buckets[bucketIndex] = head;

		return null;

	}

}
