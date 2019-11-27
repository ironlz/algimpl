package lz.utils.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 排序工具测试类
 * @author Ironlz
 */
class SortUtilTest {

    private Integer[] nullArray = null;
    private Integer[] nullArrayResult = null;
    private Integer[] emptyArray;
    private Integer[] singleArray;
    private Integer[] descendArray;
    private Integer[] randomArray;
    private Integer[] evenArray;
    private Integer[] emptyArrayResult;
    private Integer[] singleArrayResult;
    private Integer[] ascendArrayResult;
    private Integer[] evenArrayAscendResult;
    private Integer[] envenArrayDescendResult;

    @BeforeEach
    void init(){
        emptyArray = new Integer[0];
        emptyArrayResult = new Integer[0];

        singleArray = new Integer[]{1};
        singleArrayResult = new Integer[]{1};

        randomArray = new Integer[]{3,2,4,5,1};
        ascendArrayResult = new Integer[]{1,2,3,4,5};
        descendArray = new Integer[]{5,4,3,2,1};

        evenArray = new Integer[]{2,3,5,4,1,6};
        evenArrayAscendResult = new Integer[]{1,2,3,4,5,6};
        envenArrayDescendResult = new Integer[]{6,5,4,3,2,1};
    }

    @Test
    void testSelectSort(){
        Integer[] sort = SortUtil.selectSort(nullArray, true);
        assertNull(sort);

        sort = SortUtil.selectSort(nullArray, false);
        assertNull(sort);

        sort = SortUtil.selectSort(emptyArray, true);
        assertNotNull(sort);
        assertEquals(0, sort.length);
        assertArrayEquals(emptyArrayResult, sort);

        sort = SortUtil.selectSort(emptyArray, false);
        assertNotNull(sort);
        assertEquals(0, sort.length);
        assertArrayEquals(emptyArrayResult, sort);

        sort = SortUtil.selectSort(singleArray, true);
        assertNotNull(sort);
        assertEquals(1, sort.length);
        assertArrayEquals(singleArrayResult, sort);

        sort = SortUtil.selectSort(singleArray, false);
        assertNotNull(sort);
        assertEquals(1, sort.length);
        assertArrayEquals(singleArrayResult, sort);

        sort = SortUtil.selectSort(randomArray, true);
        assertNotNull(sort);
        assertArrayEquals(ascendArrayResult, sort);

        sort = SortUtil.selectSort(randomArray, false);
        assertNotNull(sort);
        assertArrayEquals(descendArray, sort);

        sort = SortUtil.selectSort(evenArray, true);
        assertNotNull(sort);
        assertArrayEquals(evenArrayAscendResult, sort);

        sort = SortUtil.selectSort(evenArray, false);
        assertNotNull(sort);
        assertArrayEquals(envenArrayDescendResult, sort);
    }

    @Test
    void testSelectSort2(){
        Integer[] sort = SortUtil.selectSort2(nullArray, true);
        assertNull(sort);

        sort = SortUtil.selectSort2(nullArray, false);
        assertNull(sort);

        sort = SortUtil.selectSort2(emptyArray, true);
        assertNotNull(sort);
        assertEquals(0, sort.length);
        assertArrayEquals(emptyArrayResult, sort);

        sort = SortUtil.selectSort2(emptyArray, false);
        assertNotNull(sort);
        assertEquals(0, sort.length);
        assertArrayEquals(emptyArrayResult, sort);

        sort = SortUtil.selectSort2(singleArray, true);
        assertNotNull(sort);
        assertEquals(1, sort.length);
        assertArrayEquals(singleArrayResult, sort);

        sort = SortUtil.selectSort2(singleArray, false);
        assertNotNull(sort);
        assertEquals(1, sort.length);
        assertArrayEquals(singleArrayResult, sort);

        sort = SortUtil.selectSort2(randomArray, true);
        assertNotNull(sort);
        assertArrayEquals(ascendArrayResult, sort);

        sort = SortUtil.selectSort2(randomArray, false);
        assertNotNull(sort);
        assertArrayEquals(descendArray, sort);

        sort = SortUtil.selectSort2(evenArray, true);
        assertNotNull(sort);
        assertArrayEquals(evenArrayAscendResult, sort);

        sort = SortUtil.selectSort2(evenArray, false);
        assertNotNull(sort);
        assertArrayEquals(envenArrayDescendResult, sort);
    }

    @Test
    void testInsertSort(){
        Integer[] sort = SortUtil.insertSort(nullArray, true);
        assertNull(sort);

        sort = SortUtil.insertSort(nullArray, false);
        assertNull(sort);

        sort = SortUtil.insertSort(emptyArray, true);
        assertNotNull(sort);
        assertEquals(0, sort.length);
        assertArrayEquals(emptyArrayResult, sort);

        sort = SortUtil.insertSort(emptyArray, false);
        assertNotNull(sort);
        assertEquals(0, sort.length);
        assertArrayEquals(emptyArrayResult, sort);

        sort = SortUtil.insertSort(singleArray, true);
        assertNotNull(sort);
        assertEquals(1, sort.length);
        assertArrayEquals(singleArrayResult, sort);

        sort = SortUtil.insertSort(singleArray, false);
        assertNotNull(sort);
        assertEquals(1, sort.length);
        assertArrayEquals(singleArrayResult, sort);

        sort = SortUtil.insertSort(randomArray, true);
        assertNotNull(sort);
        assertArrayEquals(ascendArrayResult, sort);

        sort = SortUtil.insertSort(randomArray, false);
        assertNotNull(sort);
        assertArrayEquals(descendArray, sort);

        sort = SortUtil.insertSort(evenArray, true);
        assertNotNull(sort);
        assertArrayEquals(evenArrayAscendResult, sort);

        sort = SortUtil.insertSort(evenArray, false);
        assertNotNull(sort);
        assertArrayEquals(envenArrayDescendResult, sort);
    }

    @Test
    void testInsertSort2(){
        Integer[] sort = SortUtil.insertSort2(nullArray, true);
        assertNull(sort);

        sort = SortUtil.insertSort2(nullArray, false);
        assertNull(sort);

        sort = SortUtil.insertSort2(emptyArray, true);
        assertNotNull(sort);
        assertEquals(0, sort.length);
        assertArrayEquals(emptyArrayResult, sort);

        sort = SortUtil.insertSort2(emptyArray, false);
        assertNotNull(sort);
        assertEquals(0, sort.length);
        assertArrayEquals(emptyArrayResult, sort);

        sort = SortUtil.insertSort2(singleArray, true);
        assertNotNull(sort);
        assertEquals(1, sort.length);
        assertArrayEquals(singleArrayResult, sort);

        sort = SortUtil.insertSort2(singleArray, false);
        assertNotNull(sort);
        assertEquals(1, sort.length);
        assertArrayEquals(singleArrayResult, sort);

        sort = SortUtil.insertSort2(randomArray, true);
        assertNotNull(sort);
        assertArrayEquals(ascendArrayResult, sort);

        sort = SortUtil.insertSort2(randomArray, false);
        assertNotNull(sort);
        assertArrayEquals(descendArray, sort);

        sort = SortUtil.insertSort2(evenArray, true);
        assertNotNull(sort);
        assertArrayEquals(evenArrayAscendResult, sort);

        sort = SortUtil.insertSort2(evenArray, false);
        assertNotNull(sort);
        assertArrayEquals(envenArrayDescendResult, sort);
    }
}
