public class FruitsIntoBaskets{
public int totalFruit(int[] fruits) {
    Map<Integer, Integer> map = new HashMap<>();
    int left = 0, max = 0;

    for (int right = 0; right < fruits.length; right++) {
        map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

        while (map.size() > 2) {
            int f = fruits[left];
            map.put(f, map.get(f) - 1);
            if (map.get(f) == 0) map.remove(f);
            left++;
        }
        max = Math.max(max, right - left + 1);
    }
    return max;
}

}
