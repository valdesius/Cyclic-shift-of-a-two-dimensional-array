package valdes.com.company;
import org.junit.Assert;

import org.junit.Test;
import valdes.com.company.Utils.ArrayUtils;

public class CyclicColumnShiftTest {
    CyclicColumnShift cyclicColumnShift = new CyclicColumnShift();
    @Test
    public void test1File() {
        int[][] correctResult = ArrayUtils.readIntArray2FromFile("testFiles/answer1.txt");
        int[][] array = ArrayUtils.readIntArray2FromFile("testFiles/testInput1.txt");

        assert array != null;
        cyclicColumnShift.reverseRows(array);

        Assert.assertArrayEquals(correctResult, array);
    }
    @Test
    public void test2File() {
        int[][] correctResult = ArrayUtils.readIntArray2FromFile("testFiles/answer2.txt");
        int[][] array = ArrayUtils.readIntArray2FromFile("testFiles/testInput2.txt");

        assert array != null;
        cyclicColumnShift.reverseRows(array);

        Assert.assertArrayEquals(correctResult, array);
    }
    @Test
    public void test3File() {
        int[][] correctResult = ArrayUtils.readIntArray2FromFile("testFiles/answer3.txt");
        int[][] array = ArrayUtils.readIntArray2FromFile("testFiles/testInput3.txt");

        assert array != null;
        cyclicColumnShift.reverseRows(array);

        Assert.assertArrayEquals(correctResult, array);
    }
    @Test
    public void test4File() {
        int[][] correctResult = ArrayUtils.readIntArray2FromFile("testFiles/answer4.txt");
        int[][] array = ArrayUtils.readIntArray2FromFile("testFiles/testInput4.txt");

        assert array != null;
        cyclicColumnShift.reverseRows(array);

        Assert.assertArrayEquals(correctResult, array);
    }
    @Test
    public void test5File() {
        int[][] correctResult = ArrayUtils.readIntArray2FromFile("testFiles/answer5.txt");
        int[][] array = ArrayUtils.readIntArray2FromFile("testFiles/testInput5.txt");

        assert array != null;
        cyclicColumnShift.reverseRows(array);

        Assert.assertArrayEquals(correctResult, array);
    }


}
