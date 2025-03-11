import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class Tests {

    @Test
    public void testMaxMirror(){
        
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 8, 9, 3, 2, 1)); 
        assertEquals(2,ArrOperation.maxMirror(arr));
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(7, 1, 4, 9, 7, 4, 1)); 
        assertEquals(2,ArrOperation.maxMirror(arr1));
        
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 4)); 
        assertEquals(2,ArrOperation.maxMirror(arr2));
        
        ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(1, 4, 5, 3, 5, 4, 1)); 
        assertEquals(2,ArrOperation.maxMirror(arr3));

        assertThrows(AssertionError.class,()->ArrOperation.maxMirror(new ArrayList<Integer>())); 
    }

    @Test
    public void testcountClumps(){
        
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4)); 
        assertEquals(2,ArrOperation.countClumps(arr)); 
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,1,2,1,1)); 
        assertEquals(2,ArrOperation.countClumps(arr1)); 
        
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1)); 
        assertEquals(1,ArrOperation.countClumps(arr2)); 
        
        assertThrows(AssertionError.class,()->ArrOperation.countClumps(new ArrayList<Integer>())); 
        assertThrows(AssertionError.class,()->ArrOperation.countClumps(new ArrayList<Integer>())); 
        
    }
    
    @Test
    public void testFixXY(){
        assertThrows(AssertionError.class,()->ArrOperation.fixXY(new ArrayList<Integer>(),4,5)); 
        
        assertThrows(AssertionError.class,()->ArrOperation.fixXY(new ArrayList<Integer>(Arrays.asList(1,4,3,4,2,5)),4,5)); 
        
        assertThrows(AssertionError.class,()->ArrOperation.fixXY(new ArrayList<Integer>(Arrays.asList(2,4,4,3,5,6,5)),4,5)); 
        
        assertThrows(AssertionError.class,()->ArrOperation.fixXY(new ArrayList<Integer>(Arrays.asList(2,1,5,3,4)),4,5)); 
        
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(5,4,9,4,9,5)); 
        assertEquals(new ArrayList<Integer>(Arrays.asList(9,4,5,4,5,9)), ArrOperation.fixXY(arr,4,5));
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 4, 1, 5, 5, 4, 1)); 
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 4, 5, 1, 1, 4, 5)),ArrOperation.fixXY(arr1,4,5));
        
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1, 4, 1, 5)); 
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 4, 5, 1)), ArrOperation.fixXY(arr2,4,5));
        
    }

    @Test
    public void testSplitArray(){
        
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,1,1,2,1)); 
        assertEquals(3, ArrOperation.splitArray(arr));
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(2,1,1,2,1)); 
        assertEquals(-1, ArrOperation.splitArray(arr1));
        
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(10,10)); 
        assertEquals(1, ArrOperation.splitArray(arr2));
        
        assertThrows(AssertionError.class,()->ArrOperation.splitArray(new ArrayList<Integer>())); 

    }

}
