package lz.utils.sort;

import lz.utils.sort.impl.InsertSort;
import lz.utils.sort.impl.SelectSort;

/**
 * 排序工具类，内置各种算法实现
 *
 * @author Ironlz
 * @since 0.0.1
 */
public class SortUtil {

    /**
     * 选择排序
     * @param array 待排序数组
     * @param isAscend 排序类型，升序或降序
     * @param <T> 待排序数组的数据类型
     * @return 排序后的结果，注意该方法为原址排序，排序后会改变输入数组的值的位置。传入null将会获得一个null
     */
    public static <T extends Comparable> T[] selectSort(T[] array, boolean isAscend){
        return SelectSort.selectSort(array, isAscend);
    }

    /**
     * 非原址选择排序，排序后返回一个新数组
     * @param array 待排序数组
     * @param isAscend 排序类型，true升序 false降序
     * @param <T> 待排序数组的数据类型
     * @return 排序后的结果，注意该方法为原址排序，排序后会改变输入数组的值的位置。传入null将会获得一个null
     */
    public static <T extends Comparable> T[] selectSort2(T[] array, boolean isAscend){
        return SelectSort.selectSort2(array, isAscend);
    }

    /**
     * 插入排序实现
     * @param array 待排序数组
     * @param isAscend 是否升序
     * @param <T> 排序的元素类型
     * @return 排序后的数组
     */
    public static <T extends Comparable> T[] insertSort(T[] array, boolean isAscend){
        return InsertSort.insertSort(array, isAscend);
    }

    /**
     * 插入排序实现：非原址
     * @param array 待排序数组
     * @param isAscend 是否升序
     * @param <T> 排序的元素类型
     * @return 排序后的数组
     */
    public static <T extends Comparable> T[] insertSort2(T[] array, boolean isAscend){
        return InsertSort.insertSort2(array, isAscend);
    }
}
