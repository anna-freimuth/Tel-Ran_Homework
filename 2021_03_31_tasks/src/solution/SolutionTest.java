package solution;

import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.*;


public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void hello_world_5(){
        String result = "Hello";
        assertEquals(result,solution.task1("Hello world", 5));
    }

    @Test
    public void hello_world_11(){
        String result = "Hello world";
        assertEquals(result,solution.task1("Hello world", 11));
    }

    @Test
    public void hello_world_2(){
        String result = "";
        assertEquals(result,solution.task1("Hello world", 2));
    }
    @Test
    public void hello_world_8(){
        String result = "Hello";
        assertEquals(result,solution.task1("Hello world", 8));
    }
}
