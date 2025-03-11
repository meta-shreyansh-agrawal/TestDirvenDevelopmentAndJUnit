import java.util.ArrayList;

public class ArrOperation {
    public static int maxMirror(ArrayList<Integer> arr)throws AssertionError{
        if(arr.isEmpty())throw new AssertionError("Array is Empty");
        return 0; 
    }

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