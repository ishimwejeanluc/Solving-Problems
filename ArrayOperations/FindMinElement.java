/*You are given an array of integers. 
Your task is to write a function findMinElement, that returns the minimum number 
from the array without using Java's built-in methods such as Arrays.stream().min().
If the array is empty, your function should return null.*/

public class FindMinElement {
    public Integer findMinElement(int[] array) {
        if( array.length == 0){
            return null;
        }
         int minElement = array[0];
    for ( int element : array){
        if( element < minElement){
            minElement = element;
        }
    }
    return minElement;   
}
       
    

    public static void main(String[] args) {
        // Create an instance of Solution
        FindMinElement solution = new FindMinElement();

        
        // Example array
        int[] array = {34, 15, 88, 2, 51};
        
        // Call the findMinElement method
        Integer minElement = solution.findMinElement(array);
        
        // Check if a minimum element was found and print it
        if (minElement != null) {
            System.out.println("The minimum element in the array is: " + minElement);
        } else {
            System.out.println("The array is empty.");
        }
    }
}