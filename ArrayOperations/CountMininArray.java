public class CountMininArray{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        CountMininArray countMininArray = new CountMininArray();
        System.out.println(countMininArray.countMin(numbers));
    }

public int countMin(int[] numbers) {
    if( numbers.length == 0){
        return 0;
    }
     int minElment = numbers[0];
     int count = 0;
     
    for (int i : numbers) {
        if( i < minElment){
            minElment = i;
            count = 1;
            
        }
        else if( i == minElment){
          count++;  
        }
         
    }
     return count;
        
    }

      
    
}
  
