package TestDirvenDevelopmentAndJUnit;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class Tests {

    @Test
    public void testcountClumps(){
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4)); 
        assertEquals(2,ArrOperation.countClumps(arr)); 
    }
}
