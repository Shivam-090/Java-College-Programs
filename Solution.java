class Solution {
    public static void main( String args[] ) {
       //initialize array
       int[] arr = {11, 12, 13, 14, 15};

       //array length
       int n = arr.length;

        // loop through the array and increment by 2
       for(int i=0; i<n; i = i+2){
         //print element
         System.out.println(arr[i]);
       }
    }
}