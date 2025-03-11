package TestDirvenDevelopmentAndJUnit;

import java.util.ArrayList;

public class ArrOperation {
    public static int maxMirror(ArrayList<Integer> arr){
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

    public static ArrayList<Integer> fixXY(ArrayList<Integer> arr){
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