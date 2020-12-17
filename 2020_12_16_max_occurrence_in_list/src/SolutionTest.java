import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(15);
        assertEquals(15, solution.solve(list));
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(15, 15, 15);
        assertEquals(15, solution.solve(list));
    }

    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(15, 18, 15);
        assertEquals(15, solution.solve(list));
    }

    @Test
    public void test4() {
        List<Integer> list = Arrays.asList(15, 18);
        int res = solution.solve(list);
        assertTrue(res == 15 || res == 18);
    }

    @Test
    public void test5() {
        List<Integer> list = Arrays.asList(15, 18, 18, 15);
        assertTrue(solution.solve(list) == 15 || solution.solve(list) == 18);
    }

    @Test
    public void test6() {
        List<Integer> list = Arrays.asList(15, 18, 18, 38, 15);
        assertTrue(solution.solve(list) == 15 || solution.solve(list) == 18);
    }

    @Test
    public void test7() {
        List<Integer> list = Arrays.asList(15, 38, 18, 18, 38, 15, 38);
        assertEquals(solution.solve(list), 38);
    }
    @Test
    public void test8() {
        List<Integer> list = Arrays.asList(15, 38,1,6,5,4,8,8,2,3, 18, 18, 38, 15, 38);
        assertEquals(solution.solve(list), 38);
    }

}
