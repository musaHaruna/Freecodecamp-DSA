package Arrays;


public class ArrayUtil {
 
   public static void printArray(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }

  

   public static void reverse(int[] numbers, int start, int end) {
      while (start <= end) {
          int temp = numbers[start];
          numbers[start] = numbers[end];  
          numbers[end] = temp;
          start++;
          end--;
      }
   }


public static int findMinimum(int[] numbers) {
   int min = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
return min;
}

   public static int[] removeEven(int[] arr) {
    int oddCount = 0;
    for (int i = 0; i < arr.length; i++ ) {
      if (arr[i] % 2 !=0) {
       oddCount++;
      }
    }
    int[] result = new int[oddCount];
    int idx = 0;
    for (int i = 0; i < arr.length; i++ ) {
      if (arr[i] % 2 !=0) {
        result[idx] = arr[i];
        idx++;
      }
    }
    return result;
   }

   public static void main(String[] args) {
      int[] arr = {1, 3, 6, 8, 2, 4,7}; 
      printArray(new int[] {1, 3, 6, 8, 2, 4,7});
      int [] result = removeEven(arr);
      printArray(result);
      reverse(arr, 0, arr.length - 1);
      int minimun = findMinimum(arr);
       System.out.println(minimun);
    
      
   }

}