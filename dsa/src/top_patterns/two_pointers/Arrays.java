package top_patterns.two_pointers;


public class Arrays{
    public int[] reverseArray(int[] arr){
       int start = 0;
       int end = arr.length-1;
       while(start < end){
          int temp = arr[end];
          arr[end--] = arr[start];
          arr[start++] = temp;
       }
       return arr;
    }
}