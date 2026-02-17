package recursion;

public class SumOfNnaturalNums{
    public static void main(Strings[] args){
          var sumOfNums =  new SumOfNnaturalNums();
         var result = sumOfNums.sumOfNumbers(10);
         System.out.println(result);
    }
    public int sumOfNumbers(int range){
        if(range == 1){
            return 1;
        }
       return sumOfNumbers(range-1)+range;
    }
     public int productOfNnumbers(int range){
        if(range == 1){
            return 1;
        }
       return productOfNnumbers(range-1)*range;
    }
    public void printLinkedListInReverseOrder(ListNode head){
        if(head == null){
            return ;
        }
         printLinkedListInReverseOrder(head.next);
         System.out.print(head.data + " -> ");
       return ;
    }
}