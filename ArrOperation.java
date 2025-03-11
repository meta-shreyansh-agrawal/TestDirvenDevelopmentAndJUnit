import java.util.ArrayList;

public class ArrOperation {

    /**
     * @param arr input array with positive integers
     * @return size of the largest mirror section found in the input array
     * @throws AssertionError when array is empty
     */
    public static int maxMirror(ArrayList<Integer> arr)throws AssertionError{
        if(arr.isEmpty())throw new AssertionError("Array is Empty");
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            int count = 0;
            for(int j = arr.size() - 1; j >= 0 && i + count < arr.size(); j--) {
                if(arr.get(i + count) == arr.get(j)) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }                                                    
            max = Math.max(max, count);
        }
        return max;
    }

    /**
     * @param arr input array with positive integers
     * @return number of clumps in the input array
     * @throws AssertionError when array is empty
     */
    public static int countClumps (ArrayList<Integer> arr)throws AssertionError{
        if(arr.isEmpty())throw new AssertionError("Array is Empty"); 
        int clumps = 0; 
        int prev = arr.get(0); 
        boolean clump = false; 
        for(int i = 1;i<arr.size();i++){
            int curr = arr.get(i); 
            if(!clump && prev == curr){
                clump = true;
                clumps += 1; 
            } else if(prev != curr){
                clump = false; 
            }
            prev = curr; 
        }
        return clumps; 
    }

    /**
     * @param arr input array with positive integers
     * @param x fixed position number
     * @param y number to set behind x
     * @return array that contains exactly the same numbers as the input array, but rearranged so that every X is immediately followed by a Y. 
     * @throws AssertionError when array is empty, last element is x, adjacent x's found or unequal count of x and y
     */
    public static ArrayList<Integer> fixXY(ArrayList<Integer> arr,int x, int y)throws AssertionError{
        if(arr.isEmpty()) throw new AssertionError("Array is Empty");
        if(arr.get(arr.size()-1)==x)throw new AssertionError("Last element is X");
        int i = 0; 
        int j = 0; 
        while(i<arr.size()&&j<arr.size()){
            while(i<arr.size()&&arr.get(i)!=x){
                i++; 
            }
            if(!(i<arr.size()))return arr; 
            if(arr.get(i+1)==x)throw new AssertionError("Adjacent X found"); 
            while(j<arr.size()){
                if(arr.get(j)==y){
                    if(j!=0&&arr.get(j-1)==x){
                        j++; 
                        continue; 
                    }
                    break; 
                }
                j++; 
            }
            if(!(j<arr.size())) throw new AssertionError("Unequal count of X and Y");
            int temp = arr.get(i+1); 
            arr.set(i+1, arr.get(j)); 
            arr.set(j,temp); 
            i++; 
        }
        return arr; 
    }

    /**
     * @param arr with positive integers
     * @return if there is a place to split the input array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side
     * @throws AssertionError if array is empty
     */
    public static int splitArray(ArrayList<Integer> arr) throws AssertionError{
        if(arr.isEmpty())throw new AssertionError("Array is Empty"); 
        int i = 0;
        int j = arr.size()-1;
        int firstSum = arr.get(i);
        int secondSum = arr.get(j);  
        while(i<j){
            if(firstSum == secondSum && j == i+1){
                return j; 
            }else if(firstSum<secondSum){
                i++; 
                firstSum+=arr.get(i); 
            }else if(secondSum<firstSum){
                j--; 
                secondSum+=arr.get(j); 
            }else{
                j--; 
                secondSum+=arr.get(j); 
                i++; 
                firstSum+=arr.get(i); 
            }
        }
        return -1; 
    }
}