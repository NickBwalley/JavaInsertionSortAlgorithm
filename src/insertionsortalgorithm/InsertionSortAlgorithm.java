
package insertionsortalgorithm;
public class InsertionSortAlgorithm {

    public static void main(String[] args) {
        int [] sampleArray = {23,69,79,49,19};
        
        int [] result = insertionSort(sampleArray);
        
        for (int i = 0; i < result.length; i++) {
            
            System.out.println(result[i] + " ");
            
        }
      
    }
    
    public static int[] insertionSort (int [] arr){
        
        int n = arr.length;
        
        for(int i = 1; i < n; i++){
            int value = arr[i];
            int hole = i;
            
            while (hole>0 && arr[hole-1] > value){
                arr[hole] = arr[hole-1];
                hole = hole-1;
            }
            arr[hole] = value;
    }
        return arr;
    }
    
}
//computing the running time complexity of the program
//on looking at the while loop of the sorted array
//in computing the running time complexity or the number of execution
/*this means that n=6 when i has 5number of executions to be carried out
if n; 1+2+3+4+....+n-1;
therefore:
when i = 1 no of execution is (n-5)
when i = 2 no of execution is (n-4)
when i = 3 no of execution is (n-3)
when i = 4 no of executions is (n-2)
when i = 5 no of executions is (n-1)

 expressing n generally is 
Sn = T(n) = n/2 (2a +(n-1)d)
a = 1
n = remain n
d= 1
 
O(n^2) - running time complexity;

space complexity
which are the variables declared in our algorithm
O(1); which is constant;
*/