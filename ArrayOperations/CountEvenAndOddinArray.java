public class CountEvenAndOddinArray {
    public int[] solution(int[] nums) {
        int event_count =0 , odd_count = 0 ;
    for (int i : nums) {
        if ( i % 2 == 0){
            event_count++;
        }
        else{
            odd_count++;
        }
             
    }
      int [] result = {event_count,odd_count};
        return result;
    }
    public static void main(String[] args) {
        // Create an instance of Solution
        CountEvenAndOddinArray solution = new CountEvenAndOddinArray();

        // Example array
        int[] nums = {34, 15, 88, 2, 51};

        // Call the solution method
        int[] result = solution.solution(nums);

        // Print the result
        System.out.println("The number of even numbers in the array is: " + result[0]);
        System.out.println("The number of odd numbers in the array is: " + result[1]);
    }
}
