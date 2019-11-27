package lz.utils.sort.impl;

import java.lang.reflect.Array;

import static lz.utils.sort.impl.SortComparator.compare;

/**
 * 插入排序：
 *      将当前值，插入到前面已排序好的数组中的合适位置
 * @author Ironlz
 */
public class InsertSort {

    /**
     * 插入排序实现
     * @param array 待排序数组
     * @param isAscend 是否升序
     * @param <T> 排序的元素类型
     * @return 排序后的数组
     */
    public static <T extends Comparable> T[] insertSort(T[] array, boolean isAscend){
        if (array == null || array.length < 2){
            return array;
        }
        for (int i = 1; i < array.length; i++){
            T temp = array[i];
            int j = i - 1;
            while (j >= 0 && compare(temp, array[j], isAscend) < 0){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }


    /**
     * 插入排序实现：非原址
     * @param array 待排序数组
     * @param isAscend 是否升序
     * @param <T> 排序的元素类型
     * @return 排序后的数组
     */
    public static <T extends Comparable> T[] insertSort2(T[] array, boolean isAscend){
        if (array == null){
            return null;
        }
        T[] temp = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        System.arraycopy(array, 0, temp, 0, array.length);
        return insertSort(temp, isAscend);
    }

}
