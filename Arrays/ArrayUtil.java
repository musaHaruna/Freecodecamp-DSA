package Arrays;


public class ArrayUtil {
 
   public static void printArray(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }

   public static int findSecondMax(int[]arr) { 
      int max = Integer.MIN_VALUE;
      int secondMax = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
         if(arr[i] > max) {
            secondMax = max;
            max = arr[i];
         } else if (arr[i] > secondMax && arr[i]!= max) {
            secondMax = arr[i];
         }
      }
   return secondMax;
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

   public static void moveZeros(int[] arr, int n) {
      int j = 0;
      for (int i = 0; i < n; i++) {
         if (arr[i]!= 0 && arr[j]== 0) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
         } 
         if(arr[j] != 0) {
            j++;
         }
      }

   }
   public static void main(String[] args) {
      int[] arr = {1, 3, 0, 6, 0, 8, 0,  2, 4,7}; 
      moveZeros(arr, arr.length);
      printArray(arr);
  
    
      
   }

}